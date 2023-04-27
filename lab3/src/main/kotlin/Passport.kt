class Passport(var series: String, var number: String) {

    init {
        require(series.matches("\\d{4}".toRegex())) {
        }
        require(number.matches("\\d{6}".toRegex())) {
        }
    }
    override fun toString(): String {
        return "series=$series, number=$number"
    }
}
