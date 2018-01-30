package app.chatt.chattapp.base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import app.chatt.chattapp.application.ChattApplication
import app.chatt.chattapp.dagger.component.ActivityComponent
import app.chatt.chattapp.dagger.module.ActivityModule

open class BaseActivity : AppCompatActivity() {

    private lateinit var component: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component = retrieveActivityComponentOrCreateNew()
    }

    override fun onRetainCustomNonConfigurationInstance(): ActivityComponent {
        return component;
    }

    private fun retrieveActivityComponentOrCreateNew(): ActivityComponent {
        if (lastCustomNonConfigurationInstance == null) {
            return (applicationContext as ChattApplication).appComponent.activityComponent(ActivityModule());
        } else {
            return applicationContext as ActivityComponent
        }
    }

    protected fun getActivityComponent() = component
}
