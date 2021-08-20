package com.prj.androiddoc.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.prj.androiddoc.R
import com.prj.androiddoc.adapter.FragmentAdapter
import com.prj.androiddoc.databinding.ActivityMainBinding
import com.prj.androiddoc.view.fragment.CummFragment
import com.prj.androiddoc.view.fragment.HomeFragment
import com.prj.androiddoc.view.fragment.MyFragment
import com.prj.androiddoc.view.fragment.QuizFragment

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val fragmentList = listOf(HomeFragment(), QuizFragment(), CummFragment(), MyFragment())
    val tabTitles = listOf("홈","퀴즈","커뮤니티","마이페이지")
    lateinit var adapter : FragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        adapter = FragmentAdapter(this)
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }
}