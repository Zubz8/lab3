class Duty (Workposition: String, experience: Int, salary: Int, duty: String) {


    var Workposition: String = Workposition
        private set
    private var experience: Int = experience
        private set
    private var duty: String = duty
        private set
    private var salary: Int = salary
        private set
    override fun toString(): String {
        return "Work position='$Workposition', experience=$experience, solary=$salary, duty='$duty')"
    }
}