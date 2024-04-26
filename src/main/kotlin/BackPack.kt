class BackPack {
    private val waterBottle = WaterBottle()
    private val potatoPack = PotatoPack()

    private var isOpen: Boolean = false

    fun open() {
        isOpen = true
    }

    fun close() {
        isOpen = false
    }

    fun takeWaterBottle(): WaterBottle? {
        return if (isOpen)
            WaterBottle()
        else
            null
    }

    fun takePotatoPack(): PotatoPack? {
        return if (isOpen) {
            PotatoPack()
        } else null
    }

}

//backpack has a waterbottel
//backpack has a potato pack