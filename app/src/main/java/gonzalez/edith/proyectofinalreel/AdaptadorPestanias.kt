package gonzalez.edith.proyectofinalreel

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.lang.Exception

class AdaptadorPestanias(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int, val bundle: Bundle): FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return DatosFragment(bundle)
            }
            1 -> {
                return HorariosFragment()
            }
            2 -> {
                // val movieFragment = MovieFragment()
                return CalificacionesFragment()
            }
            else -> throw Exception("Error")
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}