package com.htk.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.htk.presentation.databinding.ActivityMainBinding
import com.htk.presentation.ui.base.BaseActivity
import com.htk.presentation.ui.view.heart.HeartFragment
import com.htk.presentation.ui.view.home.HomeFragment
import com.htk.presentation.ui.view.location.LocationFragment
import com.htk.presentation.ui.view.mylocation.MyLocationFragment
import com.htk.presentation.ui.view.mypage.MyPageFragment
import com.htk.presentation.util.changeFragment

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val homeFragment: HomeFragment by lazy { HomeFragment() }
    private val locationFragment : LocationFragment by lazy { LocationFragment() }
    private val myLocationFragment : MyLocationFragment by lazy { MyLocationFragment() }
    private val heartFragment : HeartFragment by lazy { HeartFragment() }
    private val myPageFragment : MyPageFragment by lazy { MyPageFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initNavView()

    }

    private fun initNavView() {

        binding.apply {
            navView.setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.nav_home -> {
                        changeFragment(homeFragment)
                        return@setOnItemSelectedListener true
                    }
                    R.id.nav_location -> {
                        changeFragment(locationFragment)
                        return@setOnItemSelectedListener true
                    }
                    R.id.nav_my_location -> {
                        changeFragment(myLocationFragment)
                        return@setOnItemSelectedListener true
                    }
                    R.id.nav_heart -> {
                        changeFragment(heartFragment)
                        return@setOnItemSelectedListener true
                    }
                    R.id.nav_my_page -> {
                        changeFragment(myPageFragment)
                        return@setOnItemSelectedListener true
                    }
                }
                false

            }
        }
    }

    private fun replaceHomeFragment() {
        changeFragment(homeFragment)

    }
}