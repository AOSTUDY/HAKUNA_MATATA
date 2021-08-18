package com.htk.aos_study.util

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.htk.aos_study.R

    fun AppCompatActivity.changeFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.nav_host_fragment_activity_main, fragment)
            .addToBackStack(null)
            .commit()
    }
