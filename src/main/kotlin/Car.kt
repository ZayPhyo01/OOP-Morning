class Car {
    private var isOpen: Boolean = false
    private var carSpeed: Int = 0
    private var isKeyOpen: Boolean = false
    private val carBreak: Break = Break()
    private val speedometer: Speedometer = Speedometer()

    fun doorOpen() {
        isOpen = true
    }

    fun closeDoor() {
        isOpen = false
    }

    fun openKey() {
        isKeyOpen = true
    }

    fun closeKey() {
        isKeyOpen = false
    }

    fun drive() {
        // speed 0 and car key open
        // beep beep beep (speed limit over)
        // drive()

        // key need open first

        // first
        // key open , car stop
        // car limit over alarm
        // drive

        if (isCarReadyToDrive()) {
            while (carSpeed <= 1000) {
                carSpeed++
                if (speedometer.isSpeedLimitOver(speed = carSpeed)) {
                    speedometer.beep()
                }
            }
        } else {
            println("You need to open key")
        }


    }

    private fun isCarReadyToDrive() = isKeyOpen && carSpeed == 0

    fun stop() {
        carBreak.stopBreak(
            speed = carSpeed,
            onUpdateSpeed = {
                println("current speed is $it")
            }
        )
    }
}














