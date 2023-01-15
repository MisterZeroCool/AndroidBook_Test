package ru.alexfox.androidbook_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SelectLanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_language)
    }
}