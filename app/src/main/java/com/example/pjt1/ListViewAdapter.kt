package com.example.pjt1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(private val items: MutableList<ListViewitem>):BaseAdapter(){
    override fun getCount(): Int =
        items.size

    override fun getItem(p0: Int): ListViewitem = items[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(p0: Int, view: View?, parent: ViewGroup?): View {
        var convertView = view
        if(convertView == null) convertView = LayoutInflater.from(parent?.context).inflate(com.example.pjt1.R.layout.custom_list_item,parent,false)
        val text_title: TextView = convertView!!.findViewById(R.id.text_title)
        val text_subtitle: TextView = convertView!!.findViewById(R.id.text_subtitle)
        val text_rate: TextView = convertView!!.findViewById(R.id.text_rate)
        val item: ListViewitem = items[p0]
        text_title.text = item.title
        text_subtitle.text = item.subTitle
        text_rate.text = item.rate
        return convertView
    }
}