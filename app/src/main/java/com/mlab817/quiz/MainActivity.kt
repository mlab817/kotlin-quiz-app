package com.mlab817.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mlab817.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var questionNo = 0

    var questions = listOf("What are the two official languages for Android development? \n\n A) Kotlin and Java \n\n B) Java and Python \n\n C) Kotlin and Python", "How do you define a function in Kotlin? \n\n A) void \n\n B) var \n\n C) function", "What is a variable used for? \n\n A) To contain data \n\n B) To insert a random value \n\n C) Don't know", "What does SDK stand for in Android SDK? \n\n A) Software Development Kit \n\n B) Software Development Kotlin \n\n C) Something Don't Know")

    var rightAnswers = listOf(1, 2, 1, 1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnA.setOnClickListener {
            showToast(1)
        }

        binding.btnB.setOnClickListener {
            showToast(2)
        }

        binding.btnC.setOnClickListener {
            showToast(3)
        }

    }

    private fun showToast(answer: Int) {
        if (answer == rightAnswers[questionNo]) {
            Toast.makeText(applicationContext, "CORRECT!", Toast.LENGTH_SHORT).show()
            updateQuestion()
        } else {
            Toast.makeText(applicationContext, "WRONGO!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateQuestion() {
        questionNo += 1
        binding.txtQuestion.text = questions[questionNo]
    }
}