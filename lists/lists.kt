fun main() {
    // Kotlin has 2 types of lists
    // 1. immutable created by function listOf()
    // 2. mutable created by function mutableListOf()
    val li1 = mutableListOf("list", "set", "dictionary")

    // In kotlin we can store any type to list using Any class as type parameter
    val li2 = listOf<Any>("one", "1", 2, "two", "three", 4, 5);
    val li3 = listOf("str", "hex", "dec")

    println("Type of li1 ${li1::class.simpleName}")
    println("Type of li2 ${li2::class.simpleName}")
    println("Type of li3 ${li3::class.simpleName}")

    // We can use .add to add element to the end on mutable lists
    li1.add("added")
    println(li1)

    // Immutable lists does not have .add method
    // li3.add("added") // won't compile

    li1.remove("added")
    println(li1)

    val li4 = li1 + li2
    println(li4)

    //# li5 is a list of elements from li4 that satisfy the condition that li4 elements are integers
    val li5 = li4.filterIsInstance<Int>()

    //# li6 is a list of elements from li4 that are strings and contains "a" character
    val li6 = li4.filter { it is String && it.length > 4 }

    println(li5)
    println(li6)
}