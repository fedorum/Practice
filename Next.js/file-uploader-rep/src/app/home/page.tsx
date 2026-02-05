export default function Page() {

    return (
        <div className="p-5 flex justify-center">

            <p>Home</p>

            {/* insert table to display individual folders here 
                each folder contains sub-folders/ files
                files can be uploaded to folders
                files can be downloaded (and previewed?) */}

            {/* <form className="flex flex-col p-5 bg-gray-100 w-fit text-center rounded-md">
                <label htmlFor="fileToUpload" className="py-0.5 px-1.5 w-fit text-center bg-white hover:bg-neutral-50 border border-gray-400 rounded-sm cursor-pointer">Choose file</label>
                <input type="file" name="fileToUpload" id="fileToUpload" className="hidden"/>
                <input type="submit" name="submit" value="Upload" className="mt-3 py-0.5 px-1.5 w-fit text-center bg-white hover:bg-neutral-50 border border-gray-400 rounded-sm cursor-pointer"/>
            </form> */}

        </div>
    )

}
