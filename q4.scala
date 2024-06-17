object bookCost{
    def wholesaleCost(copies : Int): Double = {
        val coverPage = 24.95
        val discount = 0.6
        val coverPageWithDis = coverPage * discount
        val shippingCost: Double =  if(copies < 50){
            copies * 3
        }else{
            (50 * 3) + ((copies - 50) * 0.75)
        }

        (coverPageWithDis * copies) + shippingCost
    }

    def main(args: Array[String]) = {
        val copies = 60
        val wholeSaleCose = wholesaleCost(copies)
        println(s"Wholesale cost = $wholeSaleCose")
    }
}