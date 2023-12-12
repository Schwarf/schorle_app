package abs.apps.schorle_app

import abs.apps.schorle_app.data.AppContainer
import android.app.Application

class SchorleApp: Application() {
    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate(){
        super.onCreate()
        container = AppContainer(this)
    }
}