class Person(private val name: String, private val age: Int) {

    private val backPack = BackPack()

    fun eatPotatoChip() {
        println("eat")
        backPack.takePotatoPack()?.take()
    }

    fun drink() {
        println("drink")
        backPack.takeWaterBottle()?.take()
    }

    fun openBackPack() {
        println("open back pack")
        backPack.open()
    }

    fun closeBackPack() {
        println("close back pack")
        backPack.close()
    }

    fun carDoorOpen() {
        println("car door open")
    }

    fun drive() {
        println("drive")
    }

    fun stopCar() {
        println("stop car")
    }
}