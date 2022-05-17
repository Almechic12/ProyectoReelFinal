package gonzalez.edith.proyectofinalreel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import gonzalez.edith.proyectofinalreel.databinding.ActivityRegistrarseBinding

import java.util.regex.Pattern


class RegistrarseActivity: AppCompatActivity() {
    private lateinit var aut:FirebaseAuth
    private lateinit var  binding:ActivityRegistrarseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
   // Splash
        binding = ActivityRegistrarseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Thread.sleep( 2000)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)

    //Analytics Event
    val analytics = FirebaseAnalytics.getInstance(this)
    val bundle = Bundle()
    bundle.putString("message","Integracion de Firebase completa")
    analytics.logEvent("InitScreen",bundle)

    setUp()
    }
    private fun setUp(){
        title= "Registro"
       var btnG: Button = findViewById(R.id.btnregist) as Button
        var email: EditText= findViewById(R.id.email) as EditText
        var contra: EditText= findViewById(R.id.contra) as EditText
        btnG.setOnClickListener(){
        if (email.text.isNotEmpty()&& contra.text.isNotEmpty())
         FirebaseAuth.getInstance().createUserWithEmailAndPassword(email.text.toString(),
          contra.text.toString()).addOnCompleteListener{
         if (it.isSuccessful){
             binding.btnregist.setOnClickListener {
                 val intent = Intent(this, LoginActivity::class.java)
                 startActivity(intent)
             }
         }else{
            ShowAlert()
             }
         }
        }

    }
    private fun ShowAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error autenticado al usuario")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()

    }

}