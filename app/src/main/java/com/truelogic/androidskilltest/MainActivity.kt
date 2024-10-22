package com.truelogic.androidskilltest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Setup ViewModel and RecyclerView
        taskViewModel = ViewModelProvider(this)[TaskViewModel::class.java]
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        // Initialize RecyclerView with an adapter, listen for task list updates
    }

    private fun addNewTask() {
        // Launch an activity or dialog to create a new task
    }
}
