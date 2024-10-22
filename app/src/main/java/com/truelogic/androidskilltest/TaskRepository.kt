package com.truelogic.androidskilltest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

interface TaskRepository {

    fun getTasks(): LiveData<List<Task>>
    fun addTask(task: Task)
    fun deleteTask(task: Task)

}

class InMemoryTaskRepository : TaskRepository {

    private val taskList = MutableLiveData<List<Task>>()

    override fun getTasks(): LiveData<List<Task>> = taskList

    override fun addTask(task: Task) {
        // Add task to list and notify observers
    }

    override fun deleteTask(task: Task) {
        // Delete task from list and notify observers
    }
}
