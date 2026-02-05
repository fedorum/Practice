import Link from "next/link"

export default function Page() {

    return (
        <div className="p-5 flex justify-center">

            <form className="flex flex-col p-5 bg-gray-100 w-fit text-left rounded-md">
                <label htmlFor="adid" className="mb-2">ADID</label>
                <input type="text" id="adid" className="py-0.5 px-1 bg-white border border-gray-400 rounded-sm"/>

                <label htmlFor="password" className="mt-3 mb-2">Password</label>
                <input type="password" id="password" className="py-0.5 px-1 bg-white border border-gray-400 rounded-sm"/>

                <Link href={'/home'} className="mt-5 py-0.5 px-1 bg-white hover:bg-neutral-50 border border-gray-400 rounded-sm text-center">Login</Link>
            </form>

        </div>
    )

}
