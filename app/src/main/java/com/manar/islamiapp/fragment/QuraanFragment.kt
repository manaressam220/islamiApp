package com.manar.islamiapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.manar.islamiapp.Adapter.SuraNameAdapter
import com.manar.islamiapp.databinding.FragmentQuraanBinding
import com.manar.islamiapp.model.ArSuras
import com.manar.islamiapp.model.SuraNameIndex

class QuraanFragment: Fragment() {
    lateinit var binding: FragmentQuraanBinding
     lateinit var adapter: SuraNameAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState : Bundle?
    ):View?{
        binding = FragmentQuraanBinding.inflate(inflater)
        return binding.root
    }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)
         val suraNameIndexList = ArSuras.mapIndexed {
           index, suraName ->
             SuraNameIndex(suraName,index+1)
         }
         adapter= SuraNameAdapter(suraNameIndexList)
         binding.suraNameRecycle.adapter=adapter
     }

}