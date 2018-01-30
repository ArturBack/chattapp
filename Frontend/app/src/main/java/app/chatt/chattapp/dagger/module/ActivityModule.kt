package app.chatt.chattapp.dagger.module

import app.chatt.chattapp.activities.main.MainPresenter
import app.chatt.chattapp.dagger.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    @ActivityScope
    fun provideMainPresenter() = MainPresenter()

}