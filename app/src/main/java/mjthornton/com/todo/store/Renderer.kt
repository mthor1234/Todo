package mjthornton.com.todo.store

import android.arch.lifecycle.LiveData

/**
 * Created by mitchthornton on 8/31/18.
 */
interface Renderer<T> {
    fun render(model: LiveData<T>)
}