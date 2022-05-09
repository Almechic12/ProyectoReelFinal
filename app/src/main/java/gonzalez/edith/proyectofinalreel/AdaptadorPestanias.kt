package gonzalez.edith.proyectofinalreel

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.lang.Exception

class AdaptadorPestanias(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int): FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
                return DatosFragment()
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