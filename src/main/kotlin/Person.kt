class Person(private val name: String, private val age: Int) {

    private val backPack = BackPack()
    private val car = Car()

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
        car.doorOpen()
    }

    fun closeDoor() {
        car.closeDoor()
    }

    fun openKey() {
        car.openKey()
    }

    fun closeKey() {
        car.closeKey()
    }

    fun drive() {
        println("drive")
        car.drive()
    }

    fun stopCar() {
        println("stop car")
        car.stop()
    }
}