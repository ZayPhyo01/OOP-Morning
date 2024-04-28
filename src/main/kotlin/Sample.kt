class Sample {

    fun abc() {
        var temperature = 0
        val isElectricityAvailable: Boolean = true
        val timerInMinute = 0
        if (isElectricityAvailable) {
            plug()

            while (temperature < 1000) {
                temperature++
                if (timerInMinute > 3 && temperature < 100) {
                    eat()
                    print("show alarm beep beep")
                }
            }

        }
    }

    private fun isElectricityAvailable(): Boolean {
        // intenal
        // second level
        // third level
        return true
    }

    private fun isBoil(): Boolean {
        return true
    }

    fun eatNoodle() {

        //first level
        if (isElectricityAvailable()) {
            plug()
            if (isBoil() && isThreeMinuteArrived()) {
                eat()
            }
        }
    }

    private fun isThreeMinuteArrived(): Boolean {
        //internal
        return true
    }
}


fun plug() {
    println("plugged")
}

fun eat() {

}
