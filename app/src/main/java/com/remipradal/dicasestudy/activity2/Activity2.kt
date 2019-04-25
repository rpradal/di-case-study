package com.remipradal.dicasestudy.activity2

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.remipradal.dicasestudy.BaseComponent
import com.remipradal.dicasestudy.R
import kotlinx.android.synthetic.main.activity_2.*
import javax.inject.Inject

class Activity2 : AppCompatActivity(), DateScreen {

    @Inject
    lateinit var presenter: Presenter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        showDateButton.setOnClickListener { presenter.loadDate() }
        DaggerActivity2Component
            .builder()
            .baseComponent(BaseComponent.getInstance())
            .activity2Module(Activity2Module(this))
            .build()
            .inject(this)

    }

    override fun showDate(humanDate: String) {
        dateTextView.text = humanDate
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, Activity2::class.java)
    }

}
