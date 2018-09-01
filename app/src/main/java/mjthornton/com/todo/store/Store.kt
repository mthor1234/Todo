package mjthornton.com.todo.store

/**
 * Created by mitchthornton on 8/31/18.
 */
import android.arch.core.util.Function
import mjthornton.com.todo.model.Action

interface Store<T> {
    fun dispatch(action: Action)

    fun subscribe(renderer: Renderer<T>, func: Function<T, T> = Function{ it })
}