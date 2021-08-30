package com.htk.presentation.ui.view.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.htk.aos_study.databinding.ItemIconBinding
import com.htk.presentation.ui.view.home.model.RecIconInfo

class RecIconAdapter: RecyclerView.Adapter<RecIconAdapter.RecIconViewHolder>() {

    val icon = mutableListOf<RecIconInfo>()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecIconViewHolder {
        val binding = ItemIconBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecIconViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecIconViewHolder, position: Int) {
        holder.onBind(icon[position])
    }

    override fun getItemCount(): Int {
        return icon.size
    }

    class RecIconViewHolder(
        private val binding : ItemIconBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(recIconInfo : RecIconInfo){
            binding.apply{
                with(recIconInfo){
                    imgIcon.setImageResource(this.recIconImage)
                    tvIcon.text = this.recIconTitle
                }
            }

        }

    }
}