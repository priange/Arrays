fun main() {
    them()
towns()
    calculate()
    var names= arrayOf("Angel","Micheal","Yuvy")
    println(names.contentToString())


}

fun them(){
    var names=arrayOf("Elsie","Omara","Jane","Irene")
    println(names.contentToString())
}
fun towns(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities.map { it.capitalize() })
    
}
fun calculate(){
    val number=arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    //sum of the second and fifth elements
    val sum=number[1].plus(number[4])
    println(sum)
    println(number.indexOf(158))
    number.sort()
    println(number.contentToString())

}
fun names(name1:String,name2:String,name3:String):String{
    var allNames= arrayOf("name1","name2","name3")
   return allNames.contentToString()
}

