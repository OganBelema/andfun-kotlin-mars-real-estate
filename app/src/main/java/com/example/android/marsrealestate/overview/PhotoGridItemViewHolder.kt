package com.example.android.marsrealestate.overview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.marsrealestate.databinding.GridViewItemBinding
import com.example.android.marsrealestate.network.MarsProperty

/**
 * Created by Belema Ogan on 2019-08-20.
 */
class PhotoGridItemViewHolder(private val gridViewItemBinding: GridViewItemBinding)
    : RecyclerView.ViewHolder(gridViewItemBinding.root) {

    fun bind(property: MarsProperty){
        gridViewItemBinding.property = property
        gridViewItemBinding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): PhotoGridItemViewHolder{
            val inflater = LayoutInflater.from(parent.context)
            return PhotoGridItemViewHolder(GridViewItemBinding.inflate(inflater, parent,
                    false))
        }
    }
}