package app.chatt.chattapp.dagger

import app.chatt.chattapp.application.ChattApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(application: ChattApplication)

}