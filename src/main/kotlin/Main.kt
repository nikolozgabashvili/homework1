import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

//ექმენით კლასი Point რომელსაც ექნება 2 ველი, შესაბამისად x და y კოორდინატის შესანახად 💾  (საწყისი მნიშვნელობები გადმოაწოდეთ კონსტრუქტორში).
// კლას უნდა ჰქონდეს შემდეგი ფუნქციონალი: 🧑🏼‍💻
//toString მეთოდი - რომელიც უნდა აბრუნებდეს კლასის ველებს String ფორმატში 👈
//equals მეთოდი - უნდა იძლეოდეს საშუალებას შევადაროთ 2 point კლასის ობიექტი 🤗
//მეთოდი, რომელებიც სათავის მიმართ სიმეტრიულად გადაიტანს წერტილს  👌🏻
//მეთოდი, რომელსაც ჩაეწოდება სხვა Point კლასის ობიექტი და დააბრუნებს მანძილს ამ ორ წერტილს შორის 🗺️ (optional)

fun main() {


    val point1 = Point(7.0, 12.4)
    val point2 = Point(15.0, 5.0)
    val point3 = Point(12.0, 7.0)
    val point4 = Point(12.0, 7.0)

    println("coordinates...")
    println("point1= $point1")
    println("point2 = $point2")
    println("point3 = $point3")
    println("point4 = $point4")
    println()
    println("equation...")

    println("point1 = point2 --> ${point1 == point2}")
    println("point3 = point4 --> ${point3 == point4}")
    println()
    println("symmetrical points..")
    println("point1 symmetrical  is ${point1.symmetrical()}")
    println("point2 symmetrical  is ${point2.symmetrical()}")
    println("point3 symmetrical  is ${point3.symmetrical()}")
    println("point4 symmetrical  is ${point4.symmetrical()}")
    println()
    println("distance from point1 to point3 is ~ ${(point1.distance(point3) * 100).roundToInt() / 100.0}")
    println("distance from point1 to point3 is ~ ${point1.distance(point3)}")


}


class Point(x: Double, y: Double) {

    private var xCord = x
    private var yCord = y


    override fun toString(): String {
        return "X: $xCord, Y: $yCord"
    }

    override fun equals(other: Any?): Boolean {
        return other is Point && other.xCord == xCord && other.yCord == yCord
    }

    fun symmetrical(): Point {
        return Point(xCord * -1, yCord * -1)


    }

    fun distance(point: Point): Double {

        return sqrt((point.xCord - xCord).pow(2) + (point.yCord - yCord).pow(2))
    }

    override fun hashCode(): Int {
        var result = xCord.hashCode()
        result = 31 * result + yCord.hashCode()
        return result
    }
}


