package com.example.simplecrud.Pegawai

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simplecrud.R
import kotlinx.android.synthetic.main.pegawai_list.view.*


class RVAAdapterPegawai(private val context: Context, private val
arrayList: ArrayList<Pegawai.Pegawai>) : RecyclerView.Adapter<RVAAdapterPegawai.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.pegawai_list,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = arrayList!!.size

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.view.lbNipList.text = arrayList?.get(position)?.nip
        holder.view.lbNameList.text = "Nama : "+arrayList?.get(position)?.name
        holder.view.lbAddressList.text = "Alamat : "+arrayList?.get(position)?.address
        holder.view.lbGenderList.text = "Jenkel : "+arrayList?.get(position)?.gender

        holder.view.cvList.setOnClickListener {
            val i = Intent(context, ManagePegawaiActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            i.putExtra("editmode","1")
            i.putExtra("nip",arrayList?.get(position)?.nip)
            i.putExtra("name",arrayList?.get(position)?.name)
            i.putExtra("address",arrayList?.get(position)?.address)
            i.putExtra("gender",arrayList?.get(position)?.gender)
            context.startActivity(i)
        }

    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)

}
