package com.gogi.recyclerviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gogi.ex_recyclerview.Todo
import com.gogi.ex_recyclerview.TodoAdapter
import com.gogi.recyclerviewex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    private val todos = listOf(
        Todo("리싸이클러뷰 부시기 #1", false),
        Todo("리싸이클러뷰 부시기 #2", false),
        Todo("리싸이클러뷰 부시기 #3", false),
        Todo("리싸이클러뷰 부시기 #4", false),
        Todo("리싸이클러뷰 부시기 #5", false),
        Todo("리싸이클러뷰 부시기 #6", false),
        Todo("리싸이클러뷰 부시기 #7", false),
        Todo("리싸이클러뷰 부시기 #8", false),
        Todo("리싸이클러뷰 부시기 #9", false),
        Todo("리싸이클러뷰 부시기 #10", false),
        Todo("리싸이클러뷰 부시기 #11", false),
        Todo("리싸이클러뷰 부시기 #12", false),
        Todo("리싸이클러뷰 부시기 #13", false),
        Todo("리싸이클러뷰 부시기 #14", false),
        Todo("리싸이클러뷰 부시기 #15", false),
        Todo("리싸이클러뷰 부시기 #16", false),
        Todo("리싸이클러뷰 부시기 #17", false),
        Todo("리싸이클러뷰 부시기 #18", false),
        Todo("리싸이클러뷰 부시기 #19", false),
        Todo("리싸이클러뷰 부시기 #20", false)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.todoList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.todoList.adapter = TodoAdapter(todos)
    }
}