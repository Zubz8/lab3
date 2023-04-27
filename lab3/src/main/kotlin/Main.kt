import java.util.*

fun main() {

    val Wyatt = Person(Fio("Wyatt  walker"), 17, "man", Passport("6020", "384455"))

    val Jessica = Person(Fio("Jessica Lamb"), 21, "female", Passport("6017", "834255"))

    val Nick = Person(
        Fio("Nick"), 20, "man", Passport("6079", "342795"),
        listOf(Duty("developer", 2, 68541, "director")).toMutableList()
    )
    println("press 1 to add a duty")
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()

    when (a){
        1 -> Jessica.addDuty(Duty("is a employee for a pizzeria",2, 68541, "security guard"))
    }
    println("added a duty: $Jessica")

    println("press 2 to delete the duty")
    val b = scan.nextInt()
    when (b){
        2 -> Jessica.deleteDuty("security guard")
    }
    println("deleted the duty: $Jessica")
    println("the other employees: \n $Wyatt \n $Nick ")

    val process = Scanner(System.`in`)
    println("do you want to add a new worker?? \n 1 - yes, 2 - no")
    val c = process.nextInt()
    when (c){
        1 -> println("adding a new worker:")
        2 -> return

    }

    process.nextLine()
    println("put the full name of the person you want to add")
    var Fio = process.nextLine()
    println("put the age of this person")
    var Age = process.nextInt()

    process.nextLine()
    println("put the gender")
    var Sex = process.nextLine()

    println("put the series number of your passport here (only 4 numbers)")
    var Series  = process.nextLine()

    println("the number of the passport here (must be 6 numbers)")
    var Num  = process.nextLine()

    val Person = Person(Fio(Fio),Age,Sex,Passport(Series,Num))
    println("a new worker has been added: \n $Person")
}
