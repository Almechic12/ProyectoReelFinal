package gonzalez.edith.proyectofinalreel.ui.cartelera

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import gonzalez.edith.proyectofinalreel.Pelicula
import gonzalez.edith.proyectofinalreel.R
import gonzalez.edith.proyectofinalreel.databinding.FragmentCarteleraBinding
import gonzalez.edith.proyectofinalreel.detalles_pelicula

class CarteleraFragment : Fragment() {

    private var _binding: FragmentCarteleraBinding? = null
    var peliculas = ArrayList<Pelicula>()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(CarteleraViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_cartelera, container, false)
        val gridview = view.findViewById(R.id.gridview) as GridView

        cargarPeliculas()

        var adapter: PeliculaAdapter? = null
        adapter = PeliculaAdapter(peliculas, this.context)
        gridview.adapter = adapter

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun cargarPeliculas(){
        peliculas.add(Pelicula("Godzilla vs Kong", R.drawable.king_kong, arrayListOf("Acción"), 4.5f))
        peliculas.add(Pelicula("Caos: El Inicio", R.drawable.caos_el_inicio, arrayListOf("Aventura", "Ciencia Ficción"), 4.0f))
        peliculas.add(Pelicula("El Protector", R.drawable.el_protector, arrayListOf("Acción"), 3.5f))

        peliculas.add(Pelicula("UUUPS! 2: La Aventura Continúa", R.drawable.uuups, arrayListOf("Animación"), 4.5f))
        peliculas.add(Pelicula("El Día del Fin del Mundo", R.drawable.el_dia_del_fin_del_mundo, arrayListOf("Acción", "Thriller"), 4.0f))
        peliculas.add(Pelicula("El Túnel", R.drawable.el_tunel, arrayListOf("Thriller", "Acción"), 3.5f))

        peliculas.add(Pelicula("Tom y Jerry", R.drawable.tom_y_jerry, arrayListOf("Animación"), 4.5f))
        peliculas.add(Pelicula("Pinocho", R.drawable.pinocho, arrayListOf("Fantasía", "Drama") , 4.0f))
        peliculas.add(Pelicula("Juega Conmigo", R.drawable.juega_conmigo, arrayListOf("Terror"), 3.5f))

        peliculas.add(Pelicula("Mujer Maravilla", R.drawable.mujer_maravilla, arrayListOf("Acción"), 4.5f))
        peliculas.add(Pelicula("El Cazador de Monstruos", R.drawable.cazador_de_mostruos, arrayListOf("Terror", "Fantasía") , 4.0f))
        peliculas.add(Pelicula("Dime Cuando Tú", R.drawable.dime_cuando_tu, arrayListOf("Drama", "Comedia") , 3.5f))
    }

    class PeliculaAdapter: BaseAdapter {
        var peliculas = ArrayList<Pelicula>()
        var context: Context? = null

        constructor(peliculas: ArrayList<Pelicula>, context: Context?): super(){
            this.peliculas = peliculas
            this.context = context
        }

        override fun getCount(): Int {
            return peliculas.size
        }

        override fun getItem(p0: Int): Any {
            return peliculas[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var pelicula = peliculas[p0]
            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflator.inflate(R.layout.pelicula, null)

            var imagen = vista.findViewById(R.id.iv_pelicula) as ImageView
            var titulo = vista.findViewById(R.id.tv_titulo) as TextView
            var genero = vista.findViewById(R.id.linear_genero) as LinearLayout
            var estrellas = vista.findViewById(R.id.estrellas) as RatingBar

            imagen.setImageResource(pelicula.image)
            titulo.setText(pelicula.titulo)
            for(item in pelicula.genero){
                val tv_genero = TextView(this.context)
                tv_genero.text = item
                tv_genero.setPadding(5,5,5,5)
                tv_genero.setTextColor(Color.BLACK)
                tv_genero.setBackgroundColor(Color.WHITE)
                tv_genero.setSingleLine(true)
                tv_genero.setTextSize(10.0f)
                tv_genero.setTypeface(null, Typeface.BOLD)
                val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                params.setMargins(0,0,10,0)
                tv_genero.layoutParams = params
                genero.addView(tv_genero)
            }

            estrellas.rating = (pelicula.estrellas)

            imagen.setOnClickListener {
                var intent = Intent(context, detalles_pelicula::class.java)
                intent.putExtra("nombre", pelicula.titulo)
                intent.putExtra("image", pelicula.image)

                context!!.startActivity(intent)
            }
            return vista
        }
    }
}