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
        peliculas.add(Pelicula("Godzilla vs Kong", "Godzilla vs Kong", R.drawable.king_kong, arrayListOf("Acción"), 4.5f, R.drawable.trailer_godzilla, "Godzilla y Kong, dos de las fuerzas más poderosas de un planeta habitado por aterradoras criaturas, se enfrentan en un espectacular combate que sacude los cimientos de la humanidad. Monarch se embarca en una misión de alto riesgo y pone rumbo hacia territorios inexplorados para descubrir los orígenes de estos dos titanes, en un último esfuerzo por tratar de salvar a dos bestias que parecen tener las horas contadas sobre la faz de la Tierra."))
        peliculas.add(Pelicula("Caos: El Inicio", "Chaos Walking", R.drawable.caos_el_inicio, arrayListOf("Aventura", "Ciencia Ficción"), 4.0f, R.drawable.trailer_caos_el_inicio, "Todd ha crecido creyendo que la Masilla fue la responsable de liberar un germen que asesinó a todas las mujeres y contagió con ruido al resto de los hombres. Tras descubrir un remanso de silencio en un pantano, sus padres adoptivos le obligan a huir, dejando todo atrás salvo un mapa del Nuevo Mundo y un mensaje, así como un sinfín de preguntas sin responder. Pronto descubre la fuente del silencio: una chica llamada Viola."))
        peliculas.add(Pelicula("El Protector", "The Marksman", R.drawable.el_protector, arrayListOf("Acción"), 3.5f, R.drawable.trailer_protector, "Su amada esposa acaba de fallecer y el banco está a punto de quitarle su casa. Su vida tranquila se ve repentinamente perturbada por la llegada inesperada de dos inmigrantes ilegales que cruzan la frontera hacia su tierra: una madre y su hijo pequeño, que huyen desesperadamente de un brutal cartel mexicano."))

        peliculas.add(Pelicula("UUUPS! 2: La Aventura Continúa", "Ooops! The Adventure Continues", R.drawable.uuups, arrayListOf("Animación"), 4.5f, R.drawable.trailer_uups2,  "Se acerca el diluvio universal y Noé ha construido un arca para salvar a una pareja de cada animal. Todos los animales tienen un sitio en el arca menos Dave y Finny, dos Nestrians padre e hijo que no son admitidos al entrar. Entonces, con la ayuda de dos Grymps, se disfrazan y consiguen entrar en el arca. Sin embarco, Finny y Leah, la niña Grymp, acaban cayéndose del arca y deberán aprender a sobrevivir y trabajar en equipo para llegar a la cima del monte mientras sus padres intentan salvarlos."))
        peliculas.add(Pelicula("El Día del Fin del Mundo", "Greenland", R.drawable.el_dia_del_fin_del_mundo, arrayListOf("Acción", "Thriller"), 4.0f, R.drawable.trailer_fin_del_mundo, "Una familia se embarca en un peligroso viaje mientras un cometa se lanza hacia la Tierra. A medida que el apocalipsis global se acerca, su increíble viaje culmina en un vuelo desesperado y de última hora a un posible refugio seguro."))
        peliculas.add(Pelicula("El Túnel", "The Tunnel", R.drawable.el_tunel, arrayListOf("Thriller", "Acción"), 3.5f, R.drawable.trailer_el_tunel, "Un horrible accidente deja atrapadas a un grupo de personas en un túnel provocando un gran incendio en la víspera de Navidad. Con una ventisca afuera y pocas posibilidades de rescate, cada persona tendrá que luchar por sobrevivir. Basado en una historia real."))

        peliculas.add(Pelicula("Tom y Jerry", "Tom & Jerry", R.drawable.tom_y_jerry, arrayListOf("Animación"), 4.5f, R.drawable.trailer_tom_jerry, "Jerry se registra en un hotel de Nueva York el día de una boda importante. Esto obliga al dueño a contratar a Tom para deshacerse de Jerry. Su rivalidad comienza y el jugo del gato y el ratón amenaza la estabilidad del hotel y la boda."))
        peliculas.add(Pelicula("Pinocho", "Pinocchio", R.drawable.pinocho, arrayListOf("Fantasía", "Drama") , 4.0f, R.drawable.trailer_pinocho, "Adaptación en vivo de la clásica historia de una marioneta de madera llamada Pinocho que cobra vida y se convierte en un niño de verdad."))
        peliculas.add(Pelicula("Juega Conmigo", "Come Play with Me", R.drawable.juega_conmigo, arrayListOf("Terror"), 3.5f, R.drawable.trailer_juega_conmigo, "La historia gira en torno a Sofía (Liz Dieppa), una joven insegura que es contratada para ayudar en una casa en el cuidando de los dos pequeños hermanos de carácter problemático, que le harán su estancia sumamente difícil."))

        peliculas.add(Pelicula("Mujer Maravilla 1984", "Wonder Woman 1984", R.drawable.mujer_maravilla, arrayListOf("Acción"), 4.5f, R.drawable.trailer_mujer_maravilla, "En 1984, durante la Guerra Fría, Diana Prince entra en conflicto con dos formidables enemigos: el hombre de negocios de medios de comunicación Maxwell Lord y su amiga convertida en enemiga Bárbara Ann Minerva, mientras se reencuentra con su interés amoroso Steve Trevor."))
        peliculas.add(Pelicula("El Cazador de Monstruos", "The Headhunter", R.drawable.cazador_de_mostruos, arrayListOf("Terror", "Fantasía") , 4.0f, R.drawable.trailer_el_cazador_de_monstruos, "Un guerrero recorre parajes salvajes montado a caballo, persiguiendo al monstruo que asesinó a su hija. Su sed de venganza es la fuerza motriz de una película construida con muy pocos elementos, minimalista y épica al mismo tiempo, donde la fantasía y el horror encuentran sus encarnaciones más físicas y cruentas."))
        peliculas.add(Pelicula("Dime Cuando Tú", "Tell Me When", R.drawable.dime_cuando_tu, arrayListOf("Drama", "Comedia") , 3.5f, R.drawable.trailer_dime_cuando_tu, "Tras la muerte de su abuelo, Will, un joven mexicano-americano, descubre los planes que éste tenía de mandarlo a México para conocer sus raíces. Will, harto de su vida rutinaria, decide tomar el reto y visitar la Ciudad de México, sin imaginar que probablemente será ahí dónde encontrará al amor de su vida."))
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
                intent.putExtra("nombre_ingles", pelicula.tituloIngles)
                intent.putExtra("image", pelicula.image)
                intent.putExtra("estrellas", pelicula.estrellas)
                intent.putExtra("trailer", pelicula.trailer)
                intent.putExtra("sinopsis", pelicula.sinopsis)

                context!!.startActivity(intent)
            }
            return vista
        }
    }
}