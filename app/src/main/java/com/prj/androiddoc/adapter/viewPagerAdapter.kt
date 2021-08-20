package com.prj.androiddoc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prj.androiddoc.databinding.ItemViewpagerBinding

class viewPagerAdapter : RecyclerView.Adapter<viewPagerAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemViewpagerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class Holder(val binding: ItemViewpagerBinding) : RecyclerView.ViewHolder(binding.root){
        fun setText(text : String){
            binding.textView.text = text
        }
    }

}