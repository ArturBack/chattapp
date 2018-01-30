package app.chatt.chattapp.activities.main

import android.os.Bundle
import android.widget.Toast
import app.chatt.chattapp.R
import app.chatt.chattapp.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : BaseActivity(), MainView {

    private val presenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getActivityComponent().inject(this)
        initViews()
    }

    override fun onStart() {
        super.onStart()
        presenter?.attachView(this)
    }

    override fun onStop() {
        super.onStop()
        presenter?.detachView()
    }

    private fun initViews() {
        button.setOnClickListener {
            presenter?.onButtonClick()
        }
    }

    override fun showToast() {
        Toast.makeText(this, "Message", Toast.LENGTH_LONG).show()
    }
}