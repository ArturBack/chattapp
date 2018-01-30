package app.chatt.chattapp.dagger.component

import app.chatt.chattapp.activities.main.MainActivity
import app.chatt.chattapp.dagger.module.ActivityModule
import app.chatt.chattapp.dagger.scope.ActivityScope
import dagger.Subcomponent

@Subcomponent(modules = arrayOf(ActivityModule::class))
@ActivityScope
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}