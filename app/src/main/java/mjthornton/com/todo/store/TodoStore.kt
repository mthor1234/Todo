package mjthornton.com.todo.store

import android.arch.core.util.Function
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import mjthornton.com.todo.model.Action
import mjthornton.com.todo.model.TodoModel
import mjthornton.com.todo.model.*

/**
 * Created by mitchthornton on 8/31/18.
 */

class TodoStore : Store<TodoModel>, ViewModel() {
    private val state: MutableLiveData<TodoModel> = MutableLiveData()
    private val initState = TodoModel(listOf(), Visibility.All())


    override fun dispatch(action: Action) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun subscribe(renderer: Renderer<TodoModel>, func: Function<TodoModel, TodoModel>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}