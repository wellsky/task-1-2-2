fun main() {
    var likes = 157
    println("Понравилось $likes " + countWordPeople(likes))

    likes = 111
    println("Понравилось $likes " + countWordPeople(likes))

    likes = 2342
    println("Понравилось $likes " + countWordPeople(likes))
}

fun countWordPeople(count: Int): String {
    // Функция для частного случая приведеиня формы "человек - люди"
    return countWord(count, "челоеку", "людям", "людям")
}

fun countWord(count: Int, form1: String, form2: String, form5: String): String {
    // Универсальная функция для приведения формы любых существительных
    return when (count % 10) {
        1 -> form1
        2,3,4 -> form2
        else -> form5
    }
}