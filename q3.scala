object volume{
    def sphereVolume(radius : Double): Double = {
        (4/3) * math.Pi * radius * radius * radius
    }

    def main(args: Array[String])={
        val radius = 5
        val volume = sphereVolume(radius)
        println(s"Volume of the spehere = $volume")
    }
}