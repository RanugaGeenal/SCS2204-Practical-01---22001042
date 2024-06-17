object run{
    def time(distance: Double , pace: Double): Double = {
        distance * pace
    }

    def runningTime(): Double = {
        val easyPace = 8.0
        val tempoPace = 7.0

        val distance1 = 2.0
        val distance2 = 3.0
        val distance3 = 2.0

        val time1 = time(distance1, easyPace)
        val time2 = time(distance2, tempoPace)
        val time3 = time(distance3, easyPace)

        time1 + time2 + time3
    }

    def main(args: Array[String]): Unit = {
        val totalTime = runningTime()
        println(s"Total running time = $totalTime")
    }
}