data class PotatoChip(private val color: String, private val isCrispy: Boolean)


fun main() {
    println(PotatoChip("red", false).copy())
}

