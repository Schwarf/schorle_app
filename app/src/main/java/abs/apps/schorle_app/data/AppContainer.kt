package abs.apps.schorle_app.data

import abs.apps.schorle_app.data.files.IFileRepository
import android.content.Context

interface IAppContainer {
    val fileRepository: IFileRepository
}

class AppContainer(private val context: Context) : IAppContainer{
    
}
