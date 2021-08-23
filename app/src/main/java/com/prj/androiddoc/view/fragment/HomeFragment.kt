package com.prj.androiddoc.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.prj.androiddoc.databinding.FragmentHomeBinding

/**
 * @author 안명성
 * @since 2021.08.24
 * type
 * 1 -> Activity
 * 2 -> Spinner
 * 3 -> RecyclerView
 * 4 -> Fragment
 * 5 -> View
 */

class HomeFragment : Fragment() {

    val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding.btnLect1.setOnClickListener { setLect(1) }
        binding.btnLect2.setOnClickListener { setLect(2) }
        binding.btnLect3.setOnClickListener { setLect(3) }
        binding.btnLect4.setOnClickListener { setLect(4) }
        binding.btnLect5.setOnClickListener { setLect(5) }
        return binding.root
    }

    fun setLect(type_Lect : Int){
        when(type_Lect){
            1 -> showToast("Activity")
            2 -> showToast("Spinner")
            3 -> showToast("RecyclerView")
            4 -> showToast("Fragment")
            5 -> showToast("View")
        }
    }

    fun showToast(msg : String){
        Toast.makeText(context, "$msg", Toast.LENGTH_SHORT).show()
    }
}