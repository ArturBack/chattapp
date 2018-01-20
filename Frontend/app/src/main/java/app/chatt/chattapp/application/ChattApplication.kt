package app.chatt.chattapp.application

import android.app.Application
import app.chatt.chattapp.dagger.AppComponent
import app.chatt.chattapp.dagger.AppModule
import app.chatt.chattapp.dagger.DaggerAppComponent

class ChattApplication : Application() {

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