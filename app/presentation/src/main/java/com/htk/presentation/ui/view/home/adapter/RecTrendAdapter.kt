package com.htk.presentation.ui.view.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.htk.aos_study.databinding.ItemTrendBinding
import com.htk.presentation.ui.view.home.model.RecTrendInfo

class RecTrendAdapter : RecyclerView.Adapter<RecTrendAdapter.RecTrendViewHolder>() {

    val trend = mutableListOf<RecTrendInfo>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecTrendViewHolder {
        val binding = ItemTrendBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return RecTrendViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecTrendViewHolder, position: Int) {
        holder.onBind(trend[position])
    }

    override fun getItemCount(): Int {
        return trend.size
    }

    class RecTrendViewHolder(
        private val binding: ItemTrendBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun onBind(recTrendInfo : RecTrendInfo){
            binding.apply{
                with(recTrendInfo){
                    imgTrend.setImageResource(this.recTrendImage)

                    tvNewHot.text = this.recTrendTitle
                }


            }
        }

    }

}