package com.htk.presentation.ui.view.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.htk.aos_study.databinding.ItemWeeklyBinding
import com.htk.presentation.ui.view.home.model.RecWeeklyInfo

class RecWeeklyAdapter: RecyclerView.Adapter<RecWeeklyAdapter.RecWeeklyViewHolder>() {
    val weekly = mutableListOf<RecWeeklyInfo>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecWeeklyViewHolder {
        val binding = ItemWeeklyBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return RecWeeklyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecWeeklyViewHolder, position: Int) {
        holder.onBind(weekly[position])
    }

    override fun getItemCount(): Int {
        return weekly.size
    }

    class RecWeeklyViewHolder(
        private val binding : ItemWeeklyBinding
    ) : RecyclerView.ViewHolder(binding.root){

        fun onBind(recWeeklyInfo : RecWeeklyInfo){
            binding.apply{
                with(recWeeklyInfo){

                    imgWeekly.setImageResource(this.recWeeklyImage)
                    tvWeekly.text = this.recWeeklyTitle
                    tvWon.text = this.recWeeklyWon

                }
            }

        }
    }
}