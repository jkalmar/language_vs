import java.math.BigInteger
import kotlin.math.pow

fun main() {
    // kotlin can infer variable type, no need to write the actual type; the val is something like auto in c++
    val intNum = 10

    println("Decimal number: $intNum")
    println("Type of: ${intNum::class.simpleName}")

    val floatNum = 5.5f
    val big = BigInteger("10000000000000000000000000000000000000000000000000000000000000000000000000000000000")

    // Kotlin has BigInteger from Java
    println("Big: $big")
    println(big::class.simpleName)
    println(2.0.pow(64.0))

    println("big + intNum: " + big.add(BigInteger.valueOf(intNum.toLong())))
    println("Float number: $floatNum")
    println("Type of: ${floatNum::class.simpleName}")

    // formatted output is easy, almost the same as in python
    println("%010.5f".format(floatNum))

    // basic math operations
    println("intNum - floatNum " + (intNum - floatNum))
    println(intNum * floatNum)
    println(intNum / floatNum)
    println(intNum.toDouble().pow(2.0))
    println(intNum % 3)

    // kotlin is translated to java so also tells us that 1.1 + 2.2 is not equal to 3.3
    if (1.1f + 2.2f == 3.3f) {
        println("1.1 + 2.2 equal 3.3")
    } else {
        println("1.1 + 2.2 non equal 3.3")
    }
}
