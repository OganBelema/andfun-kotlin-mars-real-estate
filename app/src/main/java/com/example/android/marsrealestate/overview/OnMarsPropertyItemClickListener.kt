package com.example.android.marsrealestate.overview

import com.example.android.marsrealestate.network.MarsProperty

/**
 * Created by Belema Ogan on 2019-08-20.
 */
class OnMarsPropertyItemClickListener(private val clickListener: (marsProperty: MarsProperty) -> Unit){
    fun onClick(marsProperty: MarsProperty) = clickListener(marsProperty)
}