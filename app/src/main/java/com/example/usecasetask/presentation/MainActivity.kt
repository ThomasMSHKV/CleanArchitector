package com.example.usecasetask.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.usecasetask.R
import com.usecasetask.data.repository.UserRepositoryImpl
import com.usecasetask.data.storage.sharedprefs.SharedPrefUserStorage
import com.usecasetask.domain.model.SaveUserNameParam
import com.usecasetask.domain.model.UserName
import com.usecasetask.domain.usecase.GetUserNameUseCase
import com.usecasetask.domain.usecase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {



    private lateinit var vm: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("AAA", "Activity CREATED")

        vm = ViewModelProvider(this, MainViewModelFactory(this)).get(MainViewModel::class.java)

        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val dataEditText = findViewById<EditText>(R.id.dataEditText)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val receiveButton = findViewById<Button>(R.id.receiveButton)

        vm.resultLive.observe(this,  { text ->
            dataTextView.text = text
        })

        sendButton.setOnClickListener {
            val text = dataEditText.text.toString()
            vm.save(text)
        }

        receiveButton.setOnClickListener {
            vm.load()
        }
    }
}