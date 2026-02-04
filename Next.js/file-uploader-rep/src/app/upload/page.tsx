export default function Upload() {

    return (
        <div className="p-5 flex justify-center">

            <form className="flex flex-col p-5 bg-gray-100 w-fit text-center rounded-md">
                <label htmlFor="fileToUpload"></label>
                <input type="file" name="fileToUpload" id="fileToUpload" className="py-0.5 px-1.5 w-fit bg-white hover:bg-neutral-50 border border-gray-400 rounded-sm text-center"/>
                <input type="submit" name="submit" value="Upload File" className="mt-3 py-0.5 px-1.5 w-fit text-center bg-white hover:bg-neutral-50 border border-gray-400 rounded-sm cursor-pointer"/>
            </form>

        </div>
    )

}
