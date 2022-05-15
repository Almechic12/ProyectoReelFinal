package gonzalez.edith.proyectofinalreel

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlin.math.log


class detalles_pelicula : AppCompatActivity() {

    var viewPager: ViewPager? = null
    var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_detalles_pelicula)

        tabLayout = findViewById<TabLayout>(R.id.tablayout)
        viewPager = findViewById<ViewPager>(R.id.viewPager)

        val bundle = intent.extras
        for (key in bundle?.keySet()!!){
            val value = bundle.get(key)
            Log.d(TAG, String.format("%s %s (%s)", key, value.toString(), value?.javaClass!!.name))
        }


        if(bundle != null){
            val adapter = AdaptadorPestanias(this, supportFragmentManager, tabLayout!!.tabCount, bundle!!)
            viewPager!!.adapter = adapter

            viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
            tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    if (tab != null) {
                        viewPager!!.currentItem = tab.position
                    }
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {

                }

                override fun onTabReselected(tab: TabLayout.Tab?) {

                }
            })
        }

    }

}