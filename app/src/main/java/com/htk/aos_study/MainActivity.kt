package com.htk.aos_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.htk.aos_study.databinding.ActivityMainBinding
import com.htk.aos_study.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>({ActivityMainBinding.inflate(it)}) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }
}