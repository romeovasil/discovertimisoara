package com.example.romeo.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun onclick(view:View)
    {
        var intent= Intent(this,pagina2::class.java)
        startActivity(intent)
    }
    public fun onclick(view:View)
    {
        var intent=Intent(this,pagina3::class.java)
        startActivity(intent)
    }
}
