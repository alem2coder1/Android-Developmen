fun main(args: Array<String>){
    val a = 5;
    val d = 10;
    val sum = (a + d) * (d - a)
    val read = listOf("banana","apple")
    val shapes : MutableList<String> = mutableListOf("triangle","square")
    shapes.add("add")
    shapes.removeAt(1)
    val juiceMap: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190)
    juiceMap["apple"] = 40
    println("hello kotlin")
    println(sum)
    println(read)
    println(shapes)
    println(juiceMap)
    println("Keys: ${juiceMap.keys}")
    println("Values: ${juiceMap.values}")

    val c = 3
    if(c % 2 == 0){
        println("$a is even")
    }else{
        println("$a is odd")
    }
    for (number in 0..read.size) {
        println(number)
    }
    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    println(add(a,d))
}
fun add(a: Int, d: Int): Int = a + d
class Contact(val id: Int, val email: String) {
    fun data() {
        println("ID: $id, Email: $email")
    }
}

//kotlinc Main.kt -include-runtime -d Main.jar，java -jar Main.jar