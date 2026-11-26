import java.awt.dnd.DropTarget
import java.time.LocalDateTime


fun extractNumbers(text:String) : String{
    return text.filter{it.isDigit()}
}
fun main() {
    do{
    println("შეიყვანეთ  X ტექსტი :")
    val textX = readln() ?: ""
    val resultX = extractNumbers((textX)).toDouble()
    println("რიცხვები : $resultX")
    val numbers1 = extractNumbers(textX)
    if (numbers1.isEmpty()) {
        println("ტექსტი უნდა შეიცავდეს მინიმუმ ერთ ციფრს:")
    } else {
        println("$numbers1")
    }

    println("შეიყვანეთ Y  ტექსტი :")
    val textY = readln() ?: ""
    val resultY = extractNumbers(textY).toDouble()
    println("რიცხვები : $resultY")
    val numbers2 = extractNumbers(textY)
    if (numbers2.isEmpty()) {
        println(" ტექსტი უნდა შეიცავდეს მინიმუმ ერთ ციფრს : ")
    } else {
        println("$numbers2")
    }
    if (resultY == 0.0) {
        println("ნულზე გაყოფა აკრძალულია")

    }
    val result: Double = textX.toDouble() / textY.toDouble()
    println("$result")

} while (yesNo("გსურთ კიდევ ერთი გამოთვლა? (y/n)"))

}
fun yesNo(answer : String) : Boolean{
    while(true){
        print("$answer (y/n) : ")
        when(readln().trim().lowercase()){
            "y" ->return true
            "n" -> return false
            else ->println("შეიყვანეთ მხოლოდ 'y' ან 'n'")
        }
}
}


