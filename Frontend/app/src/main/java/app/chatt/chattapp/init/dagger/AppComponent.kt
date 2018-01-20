package app.chatt.chattapp.init.dagger

import app.chatt.chattapp.init.ChattApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(application: ChattApplication)

}