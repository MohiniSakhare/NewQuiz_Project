package com.example.nquiz_project

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
            "What Country does this flag belong to?",
            R.drawable.white_bg,
            "India",
            "Austria",
            "America",
            "England",
            1
            )

        questionList.add(que1)

        //2
        val que2 = Question(
            2, "Who is the Captain of Indian Cricket team?",
            R.drawable.white_bg,
            "MSD",
            "Virat Kohli",
            "ABD",
            "Hardik pandya",
            2
        )
        questionList.add(que2)

        //3

        return questionList
    }


}