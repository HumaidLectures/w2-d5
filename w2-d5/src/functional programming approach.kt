fun main() {
    val x = mutableListOf(5,10,15,22,99,81,20)

    val result = x.filter { it > 16}

    println(result)

    val y = mutableListOf("ahmed", "hi","hello","car")

    val answer = y.filter { it.length >3 }

    println(answer)

    val xi = mutableListOf(5,10,15,22,99,81,20)

    val result1 = xi.filter { it > 22 }
                        .map { it * 2 }

    println(result1)
}