package com.htk.presentation.ui.view.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.htk.aos_study.databinding.ItemSaleBinding
import com.htk.presentation.ui.view.home.model.RecSaleInfo

class RecSaleAdapter: RecyclerView.Adapter<RecSaleAdapter.RecSaleViewHolder>() {
    val sale = mutableListOf<RecSaleInfo>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecSaleViewHolder {
        val binding = ItemSaleBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return RecSaleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecSaleViewHolder, position: Int) {
        holder.onBind(sale[position])
    }

    override fun getItemCount(): Int {
        return sale.size
    }


    class RecSaleViewHolder(
        private val binding : ItemSaleBinding
    ) : RecyclerView.ViewHolder(binding.root){

        fun onBind(recSaleInfo: RecSaleInfo){
            binding.apply{
                imgSale.setImageResource(recSaleInfo.recSaleImage)
            }

        }
    }
}