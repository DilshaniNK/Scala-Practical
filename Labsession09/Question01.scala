

object Question01 {
    def FindInterset(deposit: Double): Double ={
        val intersetRate = deposit match{
            case x if x <= 20000   => 0.02
            case x if x <= 200000  => 0.04
            case x if x <= 2000000 => 0.035
            case _                 => 0.065

        }
        val interset = (deposit * intersetRate)
        interset
    }
}

