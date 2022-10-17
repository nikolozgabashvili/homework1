fun main() {


    val f1 = Fraction(2, 6)
    val f2 = Fraction(3, 2)
    println("f1 = $f1")
    println(f1 == f2)
    println(f1.multiply(f2))
    println(f1.divide(f2))
    println(trauncate(f1))
    println(trauncate(f2))
    println(f1.plus(f2))
    println(f1.plus(f1.plus(f2)))


}

class Fraction(mricxveli: Int, mnishvneli: Int) {

    var a = mricxveli
    var b = mnishvneli

    override fun toString(): String {
        return "$a/$b"
    }

    override fun equals(other: Any?): Boolean {
        return other is Fraction && other.a * b == other.b * a
    }

    override fun hashCode(): Int {
        var result = a
        result = 31 * result + b
        return result
    }

    fun multiply(f:Fraction):Fraction{

        val nmr =(f.a*a)
        val nmn = (f.b*b)
        return trauncate(Fraction(nmr,nmn))
    }
    fun divide(fr:Fraction):Fraction{
        val nmr = a*fr.b
        val nmn = b*fr.a
        return trauncate(Fraction(nmr,nmn))
    }


    fun plus(fraction: Fraction):Fraction{
        val newmr = a*fraction.b+fraction.a*b
        val newmn = b *fraction.b

        return trauncate(Fraction(newmr,newmn))
    }
    fun minus(fraction: Fraction):Fraction{
        val newmr = a*fraction.b-fraction.a*b
        val newmn = b *fraction.b

        return trauncate(Fraction(newmr,newmn))
    }

}


fun trauncate(fraction: Fraction):Fraction{
    val jr = usg(fraction.a,fraction.b)
    return Fraction(fraction.a/jr,fraction.b/jr)
}
fun usg(number1:Int,number2: Int):Int{

    return if (number2==0){
        number1
    }
    else{
        usg(number2,number1%number2)
    }

}
