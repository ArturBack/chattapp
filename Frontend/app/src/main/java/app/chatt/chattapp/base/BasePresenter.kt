package app.chatt.chattapp.base


open class BasePresenter<T> {

    private var view: T? = null

    open fun attachView(view: T) {
        this.view = view
    }

    open fun detachView() {
        view = null;
    }

    protected open fun getView() = view
}