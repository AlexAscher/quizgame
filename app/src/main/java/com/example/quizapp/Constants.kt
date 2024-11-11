package com.example.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "Какой стране пренадлежит этот флаг?",
            R.drawable.ic_flag_of_argentina,
            arrayListOf("Аргентина", "Австралия", "Армения", "Австрия"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "Какой стране пренадлежит этот флаг?",
            R.drawable.ic_flag_of_australia,
            arrayListOf("Ангола", "Австрия",
                "Австралия", "Армения"),
            2
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "Какой стране пренадлежит этот флаг?",
            R.drawable.ic_flag_of_brazil,
            arrayListOf("Беларусь", "Белиз",
                "Бруней", "Бразилия"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "Какой стране пренадлежит этот флаг?",
            R.drawable.ic_flag_of_belgium,
            arrayListOf("Багамские острова", "Бельгия",
                "Барбадос", "Белиз"),
            1
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Какой стране пренадлежит этот флаг?",
            R.drawable.ic_flag_of_fiji,
            arrayListOf("Габон", "Франция",
                "Фиджи", "Финляндия"),
            2
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "Какой стране пренадлежит этот флаг?",
            R.drawable.ic_flag_of_germany,
            arrayListOf("Германия", "Грузия",
                "Греция", "Никакая из этих"),
            0
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "Какой стране пренадлежит этот флаг?",
            R.drawable.ic_flag_of_denmark,
            arrayListOf("Доминика", "Египт",
                "Дания", "Эфиопия"),
            2
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "Какой стране пренадлежит этот флаг?",
            R.drawable.ic_flag_of_india,
            arrayListOf("Ирландия", "Иран",
                "Хорватия", "Индия"),
            3
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "Какой стране пренадлежит этот флаг?",
            R.drawable.ic_flag_of_new_zealand,
            arrayListOf("Австралия", "Новая Зеландия",
                "Тувалу", "США"),
            1
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "Какой стране пренадлежит этот флаг?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Кувейт", "Иордания",
                "Судан", "Палестина"),
            0
        )
        questionsList.add(questionTen)

        return questionsList
    }
}