package app.my.iweather

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecentSearchAdapter :  RecyclerView.Adapter<RecentSearchAdapter.ItemViewHolder>{

    private var data : ArrayList<String>? = null

    lateinit var OnItemClick:((position:Int)->Unit)
    constructor(mData : ArrayList<String>){
        Log.d("adapter","${mData.size}")
        data = mData
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_city,parent,false))
    }

    override fun getItemCount(): Int {
        return data?.size?:0
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.setData(data?.get(position) ?: "")
        holder.itemView.setOnClickListener {
            OnItemClick.invoke(position)
        }
    }

    inner class ItemViewHolder : RecyclerView.ViewHolder {
        private var tvCity:TextView? = null
        constructor(itemView:View) : super(itemView) {
            tvCity = itemView.findViewById<TextView>(R.id.tvCity)
        }

        fun setData(city:String){
            tvCity?.text = city
        }

    }

}