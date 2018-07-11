package bol.policy.com.uploaddocument

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview.text = "Hey, I am here only for you."
        textview.setOnClickListener(View.OnClickListener { textview.text = "Congrats you take your first step in Kotlin programming" })
        fab.setOnClickListener(View.OnClickListener {
            goonway()
            Toast.makeText(this, "Fab Clicked!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CheckView::class.java)
            startActivity(intent)
        })
    }

    private fun goonway() {
        Toast.makeText(this, "Go On Your Way!!", Toast.LENGTH_SHORT).show()
    }
}