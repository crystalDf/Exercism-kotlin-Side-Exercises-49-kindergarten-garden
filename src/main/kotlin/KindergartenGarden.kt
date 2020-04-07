class KindergartenGarden(private val diagram: String) {

    fun getPlantsOfStudent(student: String): List<String> =
            diagram.split("\n")
                .joinToString("") { it.windowed(2, 2)[student.first() - 'A'] }
                .map { when(it) {
                    'G' -> "grass"
                    'C' -> "clover"
                    'R' -> "radishes"
                    'V' -> "violets"
                    else -> throw IllegalArgumentException()
                } }.toList()
}
