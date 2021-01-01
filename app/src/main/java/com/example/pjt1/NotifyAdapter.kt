package com.example.pjt1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class NotifyAdapter(private val items: MutableList<NotifyViewitem>):BaseAdapter() {
    override fun getCount(): Int =
        items.size

    override fun getItem(p0: Int): NotifyViewitem = items[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(p0: Int, view: View?, parent: ViewGroup?): View {
        var convertView = view
        if(convertView == null ) convertView =LayoutInflater.from(parent?.context).inflate(R.layout.notify_view,parent,false)
        val item: NotifyViewitem = items[p0]
        val notify_image: ImageView = convertView!!.findViewById(R.id.notify_image)
        val text_title:TextView = convertView!!.findViewById(R.id.notify_title)
        val description:TextView= convertView!!.findViewById(R.id.notify_description)
        val date:TextView = convertView!!.findViewById(R.id.date)
        notify_image.setImageDrawable(item.image)
        text_title.text = item.title
        description.text = item.description
        date.text = item.createdAt

        return convertView
    }

}