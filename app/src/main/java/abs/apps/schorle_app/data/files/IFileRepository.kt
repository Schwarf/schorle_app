package abs.apps.schorle_app.data.files

import java.io.File
import java.io.InputStream

interface IFileRepository {
    fun getFile(fileName: String) : File
}