import java.util.*

open class Game() {

    protected inline fun executeCommand(command: String): String {
        val result = resolveRules()
        return result
    }

    protected fun resolveRules(): String {
        return if (Random().nextBoolean()) resolveRules()
        else resolveRules()
    }
}