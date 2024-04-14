package com.manar.islamiapp.Adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.manar.islamiapp.databinding.ItemSuraNameBinding
import com.manar.islamiapp.model.SuraNameIndex

class SuraNameAdapter(val suraItems:List<SuraNameIndex>?): Adapter<SuraNameAdapter.SuraNameViewHolder>(){




    class SuraNameViewHolder (val suraNameBinding: ItemSuraNameBinding) :ViewHolder(suraNameBinding.root){


        fun bind(item :SuraNameIndex){
            suraNameBinding.suraIndex.text ="${item.index}"
            suraNameBinding.suraNm.text = item.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuraNameViewHolder {
        val context = parent.context
        val inflater =LayoutInflater.from(context)
        val binding =ItemSuraNameBinding.inflate(inflater,parent,false)
        return SuraNameViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return suraItems?.size?:0
    }

    override fun onBindViewHolder(holder: SuraNameViewHolder, position: Int) {
        val item = suraItems?.get(position)?:return
        holder.bind(item)
    }


}
