package com.prj.androiddoc.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.prj.androiddoc.databinding.FragmentQuizBinding
/**
 * @author 안명성
 * @since 2021.08.26
 * type
 * 1 -> Activity
 * 2 -> Spinner
 * 3 -> RecyclerView
 * 4 -> Fragment
 * 5 -> View
 * 6 ->
 * 7 ->
 * 8 ->
 */
class QuizFragment : Fragment() {

    val binding by lazy { FragmentQuizBinding.inflate(layoutInflater) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding.btnChap1.setOnClickListener { setChap(1) }
        binding.btnChap2.setOnClickListener { setChap(2) }
        binding.btnChap3.setOnClickListener { setChap(3) }
        binding.btnChap4.setOnClickListener { setChap(4) }
        binding.btnChap5.setOnClickListener { setChap(5) }
        binding.btnChap6.setOnClickListener { setChap(6) }
        binding.btnChap7.setOnClickListener { setChap(7) }
        binding.btnChap8.setOnClickListener { setChap(8) }
        return binding.root
    }

    fun setChap(type_Chap : Int){
        when(type_Chap){
            1 -> showToast("chap1")
            2 -> showToast("chap2")
            3 -> showToast("chap3")
            4 -> showToast("chap4")
            5 -> showToast("chap5")
            6 -> showToast("chap6")
            7 -> showToast("chap7")
            8 -> showToast("chap8")
        }
    }

    fun showToast(msg : String){
        Toast.makeText(context, "$msg", Toast.LENGTH_SHORT).show()
    }
}