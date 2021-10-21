// make extension function with class INt, the function name is even or odd
// if the number is even print this number is even
// if the number is odd print this number is odd


fun main() {
    val x = 561217
    val y = 5115
    x.getRev
    x.evenOrOdd()
    y.evenOrOdd()
//
//    x.compareNumber(7)
//    y.compareNumber(7)
//    x.compareNumber(8)
//
//
//
//

    val name = "hmd"
//    name.repeating(5)


//    if (name.contains('a','e','i','i','o')){
//        println("$name contains a vowel")
//    }else{
//        println("$name does not contain any vowel")
//    }

//    name.vowels()
}

@OptIn(ExperimentalStdlibApi::class)
fun Int.evenOrOdd () {
    if (this %2 == 0){
        println("$this is an even number")
    }else println("$this is an odd number")

    this.rotateRight(this)
    println(this)
}

fun Int.compareNumber (n:Int){
    if (this <n){
        println("$n is greater than $this")
    } else if (this > n){
        println("$n is lower than $this")
    }else println("$n is equal to $this")
}

fun String.repeating (num:Int){
    println("$this")
        repeat(num){
            println("$this!")
            }

    }
//
//fun String.vowels(){
//    println(this.contains('a' ,'e' ,'i','u','o'))
////    if (this.contains('a' ,'e' ,'i','u','o')){
////        println("$this contains a vowel")
//////    }else if (this.contains('e')){
//////        println("$this contains a vowel")
//////    }
//////    else if (this.contains('o')){
//////        println("$this contains a vowel")
//////    }else if (this.contains('i')){
//////        println("$this contains a vowel")
//////    }
//////    else if (this.contains('u')){
//////        println("$this contains a vowel")
//////    }else if (this.contains('A')){
//////        println("$this contains a vowel")
//////    }else if (this.contains('E')){
//////        println("$this contains a vowel")
//////    }else if (this.contains('U')){
//////        println("$this contains a vowel")
//////    }else if (this.contains('O')){
//////        println("$this contains a vowel")
//////    }else if (this.contains('I')){
//////        println("$this contains a vowel")
////    }else{
////        println("$this does not contains a vowel")
////    }
//
//}
//
//private fun String.contains(a: Char, e: Char, i: Char, u:Char,o:Char): Boolean {
//    return (this.contains(a,e,i,u,o))
//}


// -------------------- part 2 --------------------
// make an extension function with Int class the has one parameter
// this extansion function name is compare number
// make it to see if the input is larger than this or smaller than this



//----------------------part 3 ---------------------
// make extension function with class String
// the name of the function is repeating
//it has parameter named num:Int
// the string is repeated num times with each repetition adds !




//----------------------part 4 ---------------------
// make an extension function that checks if a name has a vowel letter or not

// part 4 solution
fun String.veowl():Boolean{
    var x = "[aieou]".toRegex()
    return this.lowercase().contains(x)

}