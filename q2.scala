object covertion{
    def CelToFaren(Celcius : Double) : Double = {
        (Celcius * 1.8000) + 32.000
    }

    def main(args: Array[String]): Unit = {
        val temp = 35.000
        val tempF = CelToFaren(temp)
        println(s"Temperature in Farenheit = $tempF")
    }
}