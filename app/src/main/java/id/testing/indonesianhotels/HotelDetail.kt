package id.testing.indonesianhotels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_hotel_detail.*


class HotelDetail : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "hotel_name"
        const val EXTRA_DESC = "hotel_detail"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_ADDRESS = "extra_address"
        const val EXTRA_TOCENTRE = "extra_tocentre"
        const val EXTRA_PRICE = "extra price"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Hotel Details"
        actionbar.setDisplayHomeAsUpEnabled(true)



        val ivHotelReceived : ImageView = findViewById(R.id.img_hotels)
        val tvHotelNameReceived : TextView = findViewById(R.id.tv_hotel_name)
        val tvHotelDescReceived : TextView = findViewById(R.id.tv_hotel_desc)
        val tvHotelLocReceived : TextView = findViewById(R.id.tv_hotel_loc)
        val tvHotelCenReceived : TextView = findViewById(R.id.tv_hotel_to_centre)
        val tvHotelPriceReceived : TextView = findViewById(R.id.tv_hotel_price)

        val tname = intent.getStringExtra(EXTRA_NAME)
        val tdesc = intent.getStringExtra(EXTRA_DESC)
        val tloc = intent.getStringExtra(EXTRA_ADDRESS)
        val tcen = intent.getStringExtra(EXTRA_TOCENTRE)
        val tprice = intent.getStringExtra(EXTRA_PRICE)
        val tphoto = intent.getIntExtra(EXTRA_PHOTO,0)

        Glide.with(this)
            .load(tphoto)
            .apply(RequestOptions().override(70,70))
            .into(ivHotelReceived)


        tvHotelNameReceived.text = tname
        tvHotelDescReceived.text = tdesc
        tvHotelCenReceived.text = tcen
        tvHotelLocReceived.text = tloc
        tvHotelPriceReceived.text = tprice


    }
}