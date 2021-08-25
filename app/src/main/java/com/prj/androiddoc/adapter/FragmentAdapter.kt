package com.prj.androiddoc.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
/**
 * @author 안명성
 * @since 2021.08.25
 */
class FragmentAdapter(fragmentActivity : FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    var fragmentList = listOf<Fragment>()
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList.get(position)
    }
}