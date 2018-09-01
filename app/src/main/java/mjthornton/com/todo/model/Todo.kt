package mjthornton.com.todo.model

/**
 * Created by mitchthornton on 8/31/18.
 */

data class Todo(val text: String, val id: Long, val status: Boolean = false)