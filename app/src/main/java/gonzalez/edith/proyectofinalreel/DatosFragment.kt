package gonzalez.edith.proyectofinalreel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class DatosFragment(val bundle: Bundle?) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val vista = inflater!!.inflate(R.layout.fragment_datos, container, false)

        val img_pelicula: ImageView = vista.findViewById(R.id.img_pelicula)
        val tv_peli_titulo: TextView = vista.findViewById(R.id.tv_peli_titulo)
        val tv_peli_titulo_ingles: TextView = vista.findViewById(R.id.tv_peli_titulo_ingles)
        val rating: RatingBar = vista.findViewById(R.id.estrellas)
        val trailer: ImageView = vista.findViewById(R.id.img_trailer)
        val sinopsis: TextView = vista.findViewById(R.id.tv_sinopsis)

        tv_peli_titulo.text = bundle?.getString("nombre")
        tv_peli_titulo_ingles.text = bundle?.getString("nombre_ingles")
        img_pelicula.setImageResource(bundle?.getInt("image")!!)
        rating.rating = bundle?.getFloat("estrellas")!!
        trailer.setImageResource(bundle?.getInt("trailer"))
        sinopsis.text = bundle?.getString("sinopsis")

        return vista
    }
}