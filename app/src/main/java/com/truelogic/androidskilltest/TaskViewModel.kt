package com.truelogic.androidskilltest

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class TaskViewModel(private val repository: TaskRepository) : ViewModel() {

    val tasks: LiveData<List<Task>> = repository.getTasks()

    fun addTask(task: Task) {
        repository.addTask(task)
    }

    fun deleteTask(task: Task) {
        repository.deleteTask(task)
    }

    fun observeReminders() {
        // Use a simplified Observer pattern to log reminders when the due date is close
    }
}
