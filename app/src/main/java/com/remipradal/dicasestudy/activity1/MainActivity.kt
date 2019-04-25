package com.remipradal.dicasestudy.activity1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.remipradal.dicasestudy.R
import com.remipradal.dicasestudy.activity2.Activity2
import kotlinx.android.synthetic.main.activity_main.*
import org.joda.time.DateTime

class MainActivity : AppCompatActivity() {

    private val presenter = Presenter1()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpButton.setOnClickListener {
            presenter.setDate(DateTime.now())
        }

        nextButton.setOnClickListener {
            startActivity(Activity2.newIntent(this))
        }
    }
}
