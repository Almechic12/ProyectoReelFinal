package gonzalez.edith.proyectofinalreel.ui.estrenos

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
import gonzalez.edith.proyectofinalreel.Estreno
import gonzalez.edith.proyectofinalreel.Pelicula
import gonzalez.edith.proyectofinalreel.R
import gonzalez.edith.proyectofinalreel.databinding.FragmentEstrenosBinding
import gonzalez.edith.proyectofinalreel.detalles_pelicula
import gonzalez.edith.proyectofinalreel.ui.cartelera.CarteleraFragment

class EstrenosFragment : Fragment() {

    private var _binding: FragmentEstrenosBinding? = null
    var estrenos = ArrayList<Estreno>()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(EstrenosViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_estrenos, container, false)
        val gridview = view.findViewById(R.id.gridview) as GridView

        cargarEstrenos()

        var adapter: EstrenoAdapter? = null
        adapter = EstrenoAdapter(estrenos, this.context)
        gridview.adapter = adapter

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun cargarEstrenos(){
        estrenos.add(Estreno("En Guerra con mi Abuelo", "War with Grandpa (2020)", R.drawable.trailer_guerra_con_mi_abuelo, "Cuando el abuelo Jack se muda con la familia, Peter se ve obligado a renunciar a su dormitorio. Para recuperarlo, trama con sus amigos una serie de bromas. Sin embargo, el abuelo no se rinde fácilmente y se convierte en una guerra entre los dos."))
        estrenos.add(Estreno("El Padre", "The Father (2020)", R.drawable.trailer_el_padre, "Un hombre rechaza la ayuda de su hija según va envejeciendo. A medida que intenta dar sentido a sus circunstancias cambiantes, comienza a dudar de sus seres queridos, de su propia mente e incluso del tejido de su realidad."))
        estrenos.add(Estreno("Judas y el Mesías Negro", "Judas and the Black Messiah (2021)", R.drawable.trailer_judas_y_el_mesias_negro, "La película está basada en hechos reales, es la incursión de Bill O´Neal en Las Panteras Negras: movimiento político en defensa de los derechos de los negros y el socialismo. Un acercamiento a la psicología del “Judas negro” nos sumerge en los vaivenes de un callejón sin salida prefabricado a medida."))
        estrenos.add(Estreno("Relic: Herencia Maldita", "Relic (2020)", R.drawable.trailer_relic_herencia_maldita, "Una hija, una madre y una abuela son acosadas por un tipo de demencia que está consumiendo a la familia. Cuando Edna desaparece, su hija y nieta se dan cuenta de que algo la está persiguiendo."))
        estrenos.add(Estreno("Hermosa Venganza", "Promising Young Woman (2020)", R.drawable.trailer_hermosa_venganza, "Cassie tenía un brillante futuro por delante hasta que un acontecimiento inesperado truncó su carrera. Ahora nada en su vida es lo que parece: es inteligente, audaz y vive una doble vida de noche. Cassie tiene la oportunidad de enmendar todo lo que no salió bien en su pasado, vengándose de los culpables."))
        estrenos.add(Estreno("Mortal Kombat", "Mortal Kombat (2021)", R.drawable.trailer_mortal_kombat, "Cole Young, el luchador de MMA, acostumbrado a recibir palizas por dinero, desconoce su ascendencia, y tampoco sabe por qué el emperador Shang Tsung de Outworld ha enviado a su mejor guerrero, Sub-Zero, un Cryomancer sobrenatural, para dar caza a Cole. Ante esta situación, Cole teme por la seguridad de su familia y busca a Sonya Blade siguiendo las indicaciones de Jax, un comandante de las Fuerzas Especiales que tiene la misma extraña marca de dragón con la que nació Cole."))
        estrenos.add(Estreno("Nomadland", "Nomadland (2020)", R.drawable.trailer_nomad_land, "Tras el colapso económico de una zona rural en Nevada, Fern (Frances McDormand) decide subirse a su furgoneta y echarse a la carretera convertida en una nómada moderna, dispuesta a descubrir cómo es la vida en los márgenes de la sociedad convencional."))
    }

    class EstrenoAdapter: BaseAdapter {
        var estrenos = ArrayList<Estreno>()
        var context: Context? = null

        constructor(estrenos: ArrayList<Estreno>, context: Context?): super(){
            this.estrenos = estrenos
            this.context = context
        }

        override fun getCount(): Int {
            return estrenos.size
        }

        override fun getItem(p0: Int): Any {
            return estrenos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var estreno = estrenos[p0]
            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflator.inflate(R.layout.estreno, null)

            var imagen = vista.findViewById(R.id.img_pelicula) as ImageView
            var titulo = vista.findViewById(R.id.tv_peli_titulo) as TextView
            var titulo_ingles = vista.findViewById(R.id.tv_peli_titulo_ingles) as TextView
            var sinopsis = vista.findViewById(R.id.tv_sinopsis) as TextView

            imagen.setImageResource(estreno.image)
            titulo.text = estreno.titulo
            titulo_ingles.text = estreno.tituloIngles
            sinopsis.text = estreno.sinopsis

//            for(item in estreno.genero){
//                val tv_genero = TextView(this.context)
//                tv_genero.text = item
//                tv_genero.setPadding(5,5,5,5)
//                tv_genero.setTextColor(Color.BLACK)
//                tv_genero.setBackgroundColor(Color.WHITE)
//                tv_genero.setSingleLine(true)
//                tv_genero.setTextSize(10.0f)
//                tv_genero.setTypeface(null, Typeface.BOLD)
//                val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
//                params.setMargins(0,0,10,0)
//                tv_genero.layoutParams = params
//                genero.addView(tv_genero)
//            }

            return vista
        }
    }
}