@JvmInline
value class Fio (val fio: String)

class Person (val fio: Fio, val age: Int, val sex: String){
    var passport: Passport? = null
    var duties: MutableList<Duty>? = mutableListOf()


    constructor(fio: Fio, age: Int,sex: String, passport: Passport): this(fio,age, sex){
        this.passport = passport
    }

    constructor(fio: Fio, age: Int, sex: String, passport: Passport, duties: MutableList<Duty>): this(fio,age, sex, passport){
        this.duties = duties
    }

    fun addDuty(duty: Duty){
        duties?.add(duty)
    }

    fun deleteDuty(Workposition: String) {
        println("your duty: $Workposition , you are removed from this duty:)")
        duties?.removeAll { it.Workposition == Workposition }
    }

    init {
        if (age < 18){
            duties = null
        }
    }

    override fun toString(): String {
        return "Person $fio, age=$age, sex='$sex', passport $passport ,\n\n duties=$duties"
    }

}