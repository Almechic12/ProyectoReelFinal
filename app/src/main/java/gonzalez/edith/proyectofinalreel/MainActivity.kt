package gonzalez.edith.proyectofinalreel

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import gonzalez.edith.proyectofinalreel.databinding.ActivityLoginBinding
import gonzalez.edith.proyectofinalreel.databinding.ActivityMainBinding
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel


class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
   // private lateinit var binding: ActivityLoginBinding
    private lateinit var binding: ActivityMainBinding
    val list= mutableListOf<CarouselItem>()

    //private val userRef = FirebaseDatabase.getInstance().getReference("Users")
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth


        //carrusel de imagenes
        val carousel: ImageCarousel = findViewById(R.id.img_carrousel)
        list.add(CarouselItem(imageDrawable = R.drawable.godzillavskong, "King Kong vs GodZilla"))
        list.add(CarouselItem(imageDrawable = R.drawable.carousel_1, null))
        carousel.addData(list)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_inicio, R.id.navigation_cartelera, R.id.navigation_estrenos, R.id.navigation_cines, R.id.navigation_perfil
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    private fun signOut(){
        Firebase.auth.signOut()
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}