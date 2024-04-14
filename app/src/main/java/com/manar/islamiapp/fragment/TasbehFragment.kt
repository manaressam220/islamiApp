package com.manar.islamiapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.manar.islamiapp.databinding.FragmentQuraanBinding
import com.manar.islamiapp.databinding.FragmentTasbehBinding

class TasbehFragment:Fragment() {
    lateinit var binding: FragmentTasbehBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState : Bundle?
    ): View?{
        binding =FragmentTasbehBinding.inflate(inflater)
        return binding.root
    }

}