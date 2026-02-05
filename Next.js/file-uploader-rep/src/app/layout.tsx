import "./globals.css"

export default function RootLayout({
    children,
}:  {
    children: React.ReactNode;
})  {

    return (
        <html lang="en">
            <body className="flex flex-col min-h-screen">
                <nav className="p-5 bg-indigo-950">
                    <h1 className="text-xl text-white font-bold">FILE UPLOADER</h1>
                </nav>

                <main className="flex-grow">
                    {children}
                </main>

                {/* <footer className="p-5 bg-stone-300">
                    <p className="text-white font-bold">NUHS GCTO</p>
                </footer> */}
            </body>
        </html>
  )

}
