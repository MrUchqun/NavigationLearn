package com.example.navigationlearn

import androidx.navigation.NavOptions

object Utils {
    fun navOptions(): NavOptions {
        return NavOptions.Builder()
            .setEnterAnim(R.anim.slide_in_up)
//            .setExitAnim(R.anim.slide_out_down)
            .setPopEnterAnim(R.anim.slide_out_up)
//            .setPopExitAnim(R.anim.slide_in_down)
            .build()
    }
}