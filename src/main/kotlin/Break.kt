class Break {

    fun stopBreak(speed: Int, onUpdateSpeed: (Int) -> Unit) {
        //99 98 97 ..50 49 48 . 10 9  8 0
        var speedHolder = speed
        while (speedHolder > 0) {
            speedHolder--
            onUpdateSpeed(speedHolder)
        }
    }
}