package com.remipradal.dicasestudy.activity2

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.remipradal.dicasestudy.R
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity(), DateScreen {

    private val presenter = Presenter2(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        showDateButton.setOnClickListener { presenter.loadDate() }
    }

    override fun showDate(humanDate: String) {
        dateTextView.text = humanDate
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, Activity2::class.java)
    }

}
