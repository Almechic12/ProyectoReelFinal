package gonzalez.edith.proyectofinalreel


import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import gonzalez.edith.proyectofinalreel.databinding.ActivityRegistrarseBinding
import java.util.regex.Pattern


class RegistrarseActivity: AppCompatActivity() {
    private lateinit var auth:FirebaseAuth
    private lateinit var  binding:ActivityRegistrarseBinding
    override fun onCreate(savedInstanceState: Bundle?) {

    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_registrarse)

        binding = ActivityRegistrarseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth
        binding.btnregist.setOnClickListener{
            val mEmail = binding.email.text.toString()
            val mPassword = binding.contra.text.toString()
            val mRepitePassword = binding.repiteContra.text.toString()
            val mNombreUsuario = binding.nombreusuarios.text.toString()
            val passwordRegex = Pattern.compile("^" + "(?=.*[-@#$%^&+=])"+".{6,}" + "$")

            if(mEmail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(mEmail).matches()){
                Toast.makeText(this, "Ingrese un email valido.", Toast.LENGTH_SHORT).show()
            } else if(mPassword.isEmpty() || !passwordRegex.matcher(mPassword).matches()){
                Toast.makeText(this, "La contraseña es debil.", Toast.LENGTH_SHORT).show()
            } else if(mPassword != mRepitePassword){
                Toast.makeText(this, "Confirma la contraseña.", Toast.LENGTH_SHORT).show()
            } else{
                createAccount(mEmail, mPassword)
            }

        }

    }

    private fun createAccount(email: String, password:String){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){ task ->
                if(task.isSuccessful){


                }else{
                    Log.w("TAG", "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT).show()

                }
            }
    }


}