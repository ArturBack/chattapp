package app.chatt.chattapp.dagger.component

import app.chatt.chattapp.application.ChattApplication
import app.chatt.chattapp.dagger.module.ActivityModule
import app.chatt.chattapp.dagger.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun activityComponent(activityModule: ActivityModule): ActivityComponent

    fun inject(application: ChattApplication)

}