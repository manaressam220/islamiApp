package com.manar.islamiapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.manar.islamiapp.databinding.FragmenrHadethBinding
import com.manar.islamiapp.databinding.FragmentQuraanBinding

class HadethFragment :Fragment(){
    lateinit var binding: FragmenrHadethBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState : Bundle?
    ): View?{
        binding = FragmenrHadethBinding.inflate(inflater)
        return binding.root
    }

}