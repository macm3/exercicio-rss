package br.ufpe.cin.if710.rss

import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

class MyAdapterCustom(private val data: List<ItemRSS>) : RecyclerView.Adapter<MyAdapterCustom.MyViewHolder>(){
    //referenciando
    class MyViewHolder(val v: LinearLayout) : RecyclerView.ViewHolder(v)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapterCustom.MyViewHolder {
        //criando
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itemlista, parent, false) as LinearLayout
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var textView: TextView = holder.v.getChildAt(0) as TextView
        var textData: TextView = holder.v.getChildAt(1) as TextView
        textView.text = data[position].title
        textData.text = data[position].pubDate
    }

    // tamanho do dataset
    override fun getItemCount() = data.size

}

