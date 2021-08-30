package com.htk.presentation.ui.view.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.htk.presentation.databinding.ItemViewpagerBinding
import com.htk.presentation.ui.view.home.model.RecViewPagerInfo

class RecViewPagerAdapter: RecyclerView.Adapter<RecViewPagerAdapter.RecViewPagerViewHolder>() {

    val view = mutableListOf<RecViewPagerInfo>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecViewPagerViewHolder {
        val binding = ItemViewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return RecViewPagerViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: RecViewPagerViewHolder,
        position: Int
    ) {
        holder.onBind(view[position])
    }

    override fun getItemCount(): Int {
        return view.size
    }

    class RecViewPagerViewHolder(
        private val binding : ItemViewpagerBinding
    ) : RecyclerView.ViewHolder(binding.root){

        fun onBind(recViewPagerInfo : RecViewPagerInfo){
            binding.apply {
                imgViewpager.setImageResource(recViewPagerInfo.recViewPagerImage)
            }
        }
    }
}