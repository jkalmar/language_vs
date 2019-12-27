fun main() {
    // in Kotlin we have support for dictionaries from like in Java
    // as with lists there is a mapOf helper function that creates a Map from pairs
    // provided as arguments (the type of the key and value is inferred)

    // in Kotlin we can create map simply using the mapOf, do not need to put
    // entities one by one or using special init construct
    val di1 = mutableMapOf(1 to "one", 2 to "two")

    // if we want immutable map then use mapOf instead of mutableMapOf
    val di2 = mapOf(10 to "ten", 11 to "eleven")

    println("Type of di1: " + di1::class.simpleName)
    println("Type of di2: " + di2::class.simpleName)

    // adding key is very natural for C/C++ style programmer :)
    di1[3] = "three"

    println(di1)

    // removing a key is done using .remove method
    di1.remove(1)

    println(di1)

    // dictionary can be updated and merged using .putAll method which works the same as in python operator+
    val di3 = di1 + di2 // NOTE: di3 is immutable map, use "(di1 + di2) as MutableMap" cast if mutable map is needed

    println(di3)
    println("Type of di3: " + di3::class.simpleName)


    // true power is in lookups
    val di4 = mapOf("jedna" to 1, "dva" to 2, "tri" to 3, "styri" to 4)

    // this will print "two" and it works the same as python equivalent
    println(di3[di4["dva"]])

    // kotlin does not has dictionary comprehension but we can use map
    val di5 = di4.map { (key, value) ->
        key to di3[value]
    }.filter { (_, value) -> value != null }.toMap()

    println("di5: $di5")

    val di6 = di4.map { (key, value) ->
        value to key
    }.toMap()

    println("original: $di4")
    println("swapped: $di6")
}
