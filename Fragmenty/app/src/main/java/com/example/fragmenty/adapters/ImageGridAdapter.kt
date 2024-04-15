package com.example.fragmenty.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class ImageGridAdapter(
    private val context: Context,
    private val imagesList: List<Int>
): BaseAdapter() {
    override fun getCount(): Int = imagesList.size
    override fun getItem(position: Int): Any = imagesList[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView = convertView as? ImageView ?: ImageView(context).apply {
            layoutParams = ViewGroup.LayoutParams(300, 300)
            scaleType = ImageView.ScaleType.CENTER_CROP
            setPadding(8,8,8,8)
        }
        imageView.setImageResource(imagesList[position])

        return imageView
    }

}