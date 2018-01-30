package app.chatt.chattapp.application

import android.app.Application
import app.chatt.chattapp.dagger.component.AppComponent
import app.chatt.chattapp.dagger.component.DaggerAppComponent
import app.chatt.chattapp.dagger.module.AppModule

class ChattApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = initDagger(this);
    }

    private fun initDagger(app: ChattApplication): AppComponent =
            DaggerAppComponent.builder()
                    .appModule(AppModule(app))
                    .build()

}