fun num(): Int {
    val randomnum = (0..100).shuffled().first()

    return randomnum
}
fun main(){
    var numb=num()
    //println("$numb")
    val s=cat(numb)
    s.species()
}