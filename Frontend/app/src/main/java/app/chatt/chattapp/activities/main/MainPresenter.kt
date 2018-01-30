package app.chatt.chattapp.activities.main

import app.chatt.chattapp.base.BasePresenter
import app.chatt.chattapp.dagger.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainPresenter @Inject constructor(): BasePresenter<MainView>() {

    fun onButtonClick() {
        getView()?.showToast()
    }


}