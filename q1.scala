object area{
    def areaOfDisk(radius: Double): Double = {
        math.Pi * radius  * radius
    }

    def main(args: Array[String]): Unit = {
        val radius = 5.0
        val area = areaOfDisk(radius)
        println(s"Area of the disk = $area")
    }
}