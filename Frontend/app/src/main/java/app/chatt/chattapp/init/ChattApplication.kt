package app.chatt.chattapp.init

import android.app.Application
import app.chatt.chattapp.init.dagger.AppComponent
import app.chatt.chattapp.init.dagger.AppModule
import app.chatt.chattapp.init.dagger.DaggerAppComponent

class ChattApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = initDagger(this);
        appComponent.inject(this)
    }

    private fun initDagger(app: ChattApplication): AppComponent =
            DaggerAppComponent.builder()
                    .appModule(AppModule(app))
                    .build()
}