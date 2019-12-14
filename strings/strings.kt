fun main() {
    // using val to let kotlin infer the type -> String
    val hello = "Hello"
    val world = "World"

    println(hello)
    println(world)

    // Strings can be easily merged
    println(hello + world)

    // String can be stored into a variable
    val concat = hello + world
    println(concat)

    // Adding space between Hello and World is easy
    println("$hello $world")

    val arr = arrayOf(hello, world)
    println("Joining collections is really easy, " + arr.joinToString(separator = ","))

    val helloworld = "$hello $world"

    // string slicing à la Kotlin
    println(helloworld.slice(IntRange(0, 5)))
    println(helloworld.substring(5))

    // Indexing is done naturally
    println("${hello[4]}${world[0]}${hello[2]}")

    // String can be repeated but you have to code it
    println("*".repeat(80))
    println("*" + " ".repeat(78) + "*")
    print(("*" + " ".repeat(78) + "*\n").repeat(2))
    println("*" + " ".repeat(78 / 2 - helloworld.length / 2 - 1) + helloworld + " ".repeat(78 / 2 - helloworld.length / 2) + "*")
    print(("*" + " ".repeat(78) + "*\n").repeat(3))
    println("*".repeat(80))

    // String can draw
    val base = 30
    for (stars in 1..base step 2) {
        println(" ".repeat(base / 2 - stars / 2 - 1) + "*".repeat(stars))
    }

    // searching is supported as well by default
    println("Is hello in Hello World?")
    println("hello" in helloworld)

    // search is case-sensitive in java too, luckily java has methods for case insensitive search
    println("Is hello in Hello World?")
    println(helloworld.contains("hello", ignoreCase = true))
}