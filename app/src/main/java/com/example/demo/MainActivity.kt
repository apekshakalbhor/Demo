package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
  // var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val button1 =findViewById<Button>(R.id.button1)
       button1.setOnClickListener{
           loadfrag1(
                fragment_one()
            )
       }

       val button2 =findViewById<Button>(R.id.button2)
       button2.setOnClickListener{
           loadfrag2(
               fragment_two()
           )
       }
     //  Log.i(TAG,"onCreate")
    }

//    override fun onStart() {
//        super.onStart()
//        Log.i(TAG,"onStart")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.i(TAG,"onResume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.i(TAG,"onPause")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.i(TAG,"onRestart")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.i(TAG,"onStop")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.i(TAG,"onDestroy")
//    }

    fun loadfrag1(frag1 : fragment_one){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag1)
        ft.commit()

    }

    fun loadfrag2(frag2 : fragment_two){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment,frag2)
        ft.commit()

    }
}