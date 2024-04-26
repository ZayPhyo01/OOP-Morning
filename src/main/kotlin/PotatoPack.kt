class PotatoPack {
    private var chips: List<PotatoChip> = listOf(
        PotatoChip(
            "yellow", true
        ),
        PotatoChip(
            "white", false
        ),
        PotatoChip(
            "yellow", false
        ),
        PotatoChip(
            "white", true
        ),
        PotatoChip(
            "yellow", true
        )
    )

    fun take(): List<PotatoChip> {
        return chips
    }
}