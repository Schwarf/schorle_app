package abs.apps.schorle_app.data.files

import android.content.Context
import java.io.File

class FileRepository(private val applicationContext: Context) : IFileRepository {
    override fun getFile(fileName: String) : File
    {
            return File(applicationContext.filesDir, fileName)
    }
}