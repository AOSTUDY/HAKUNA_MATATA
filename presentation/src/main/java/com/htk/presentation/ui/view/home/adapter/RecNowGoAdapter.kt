package com.htk.presentation.ui.view.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.htk.presentation.databinding.ItemNowGoBinding
import com.htk.presentation.ui.view.home.model.RecNowGoInfo

class RecNowGoAdapter : RecyclerView.Adapter<RecNowGoAdapter.RecNowGoViewHolder>() {

    val nowGo = mutableListOf<RecNowGoInfo>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecNowGoViewHolder {
        val binding = ItemNowGoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecNowGoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecNowGoViewHolder, position: Int) {
        holder.onBind(nowGo[position])
    }

    override fun getItemCount(): Int {
        return nowGo.size
    }

    class RecNowGoViewHolder(
        private val binding : ItemNowGoBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(recNowGoInfo: RecNowGoInfo){
            binding.apply{
                with(recNowGoInfo){
                    imgNowGo.setImageResource(this.recNowGoImage)
                    tvNowGo.text = this.recNowGoTitle

                }
            }

        }
    }
}