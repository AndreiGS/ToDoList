package com.lunartechnolabs.todolist.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lunartechnolabs.todolist.R
import com.lunartechnolabs.todolist.domain.model.Task
import com.lunartechnolabs.todolist.data.repo.RoomRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var roomRepository : RoomRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.IO).launch {
            val task = Task("amar772","High","This is detail",Date().time,Date().time)
            roomRepository.insertSingleTask(task)

        }
    }
}