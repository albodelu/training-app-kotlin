package com.ardock.training_app_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { toast(editText.text) }

//        val items = listOf(Item("title1","url1"), Item("title2", "url2"))
//        val empty = emptyList<Item>()
//
//        val result = items
//                .sortedBy(Item::title)
//                .filter { it.url.isNotEmpty() }
//                .map(Item::title)

//        val result: List<String> = items
//                .sortedBy(Item::title)
//                .filter { it.url.isNotEmpty() }
//                .map { it.title }

//        val sorted = items.sortedBy { it.title }
//        val sorted = items.sortedBy(Item::title)
//        val sorted = items.sortedBy { item -> item.title }

//        val item = Item("title", "url")
//
//        val (title, _) = item

//        val (title, url) = item

//        button.setOnClickListener { toast(editText.text, Toast.LENGTH_LONG) }

//        button.setOnClickListener {
//            val text = editText.text
//            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
//        }

//        button.setOnClickListener(object: View.OnClickListener{
//            override fun onClick(v: View?) {
//                val text = editText.text
//                Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()            }
//        })
//
//        val item = Item()
//        item.title = "Title"
//        val title = item.title
//
//        button.text = "Hide"
//        button.text = ""
//
//        val item2 = Item();
//        item2.url = "hello"
    }
}
