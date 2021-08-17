package com.htk.aos_study.ui.view.home.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.htk.aos_study.R


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class RecFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_rec, container, false)
    }


}