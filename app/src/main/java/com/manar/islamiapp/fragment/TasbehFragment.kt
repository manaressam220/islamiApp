package com.manar.islamiapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.manar.islamiapp.R
import com.manar.islamiapp.databinding.FragmentTasbehBinding

class TasbehFragment:Fragment() {
    lateinit var binding: FragmentTasbehBinding
    var counter = 0
    var currentDhikrIndex =0

    lateinit var azkarList : MutableList<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState : Bundle?
    ): View{
        binding =FragmentTasbehBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        azkarList = resources.getStringArray(R.array.azkarList).toMutableList()
        onSebhaClick()
    }

    private fun onSebhaClick() {
        binding.bodySebha.setOnClickListener{
            binding.bodySebha.rotation+= (360/33).toFloat()
            if(counter<33){
                counter++
            }
            else {
                counter=0
                currentDhikrIndex = if (currentDhikrIndex<azkarList.size-1)++currentDhikrIndex else 0
                binding.dhikr.text= azkarList[currentDhikrIndex]

            }
            binding.counterDhikr.text=counter.toString()
        }
    }

}