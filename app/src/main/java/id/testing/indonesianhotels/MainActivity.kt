package id.testing.indonesianhotels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvHotel: RecyclerView
    private var list: ArrayList<Hotel> = arrayListOf()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title = "Hotels Available Near You"


        rvHotel = findViewById(R.id.recview_hotel)
        rvHotel.setHasFixedSize(true)

        list.addAll(HotelsData.listData)
        showHotelRecyclerList()

    }


    private fun showHotelRecyclerList(){
        rvHotel.layoutManager = LinearLayoutManager(this)
        val listHotelAdapter = ListHotelAdapter(list)
        rvHotel.adapter = listHotelAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_seeprofile,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when (itemId){
            R.id.ic_myprofile -> {
                Toast.makeText(this,"Profile Selected ",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Profile::class.java)
                startActivity(intent)
            }
        }

    }
}