package id.testing.indonesianhotels


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListHotelAdapter(private val listHotel : ArrayList<Hotel>) : RecyclerView.Adapter<ListHotelAdapter.ListViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_hotels,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name,desc,price,photo,tocentre,address) = listHotel[position]
        val hotels = listHotel[position]

        Glide.with(holder.itemView.context)
            .load(hotels.photo)
            .apply(RequestOptions().override(70,70))
            .into(holder.imgHotels)

        holder.tvHotelName.text = hotels.name
        holder.tvHotelDesc.text = hotels.desc

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val movetoHotelDetail = Intent(mContext,HotelDetail::class.java)
            movetoHotelDetail.putExtra(HotelDetail.EXTRA_NAME,name)
            movetoHotelDetail.putExtra(HotelDetail.EXTRA_PHOTO,photo)
            movetoHotelDetail.putExtra(HotelDetail.EXTRA_PRICE,price)
            movetoHotelDetail.putExtra(HotelDetail.EXTRA_TOCENTRE,tocentre)
            movetoHotelDetail.putExtra(HotelDetail.EXTRA_DESC,desc)
            movetoHotelDetail.putExtra(HotelDetail.EXTRA_ADDRESS,address)
            mContext.startActivity(movetoHotelDetail)
           }
    }

    override fun getItemCount(): Int {
        return listHotel.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvHotelName : TextView = itemView.findViewById(R.id.tv_hotel_name)
        var tvHotelDesc : TextView = itemView.findViewById(R.id.tv_hotel_desc)
        var imgHotels : ImageView = itemView.findViewById(R.id.img_hotels)
    }

    interface  OnItemClickCallback {
        fun onItemClicked(data : Hotel)
    }

}