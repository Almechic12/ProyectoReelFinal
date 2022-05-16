package gonzalez.edith.proyectofinalreel

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class AuthActivity: AppCompatActivity() {

   fun Oncreate(savedInstanceState: Bundle?){
       //Splash
       Thread.sleep( 2000)
      // setTheme(R.style.AppTheme)
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
    title= "Login"
    //btn_login.setOnCliclkListener{
      //if (et_nombreusuario.text.isNotEmpty()&& textContra.text.isNotEmpty())
      //  FirebaseAuth.getInstance().createUserWithEmailAndPassword(et_nombreusuario.text.toString(),
          //  textContra.text.toString()).addOnCompleteListener{
              //  if (it.isSuccessful){

              //  }else{
//ShowAlert()
              //  }
      //  }

   // }

}
    private fun ShowAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error autenticado al usuario")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog= builder.create()
        dialog.show()

    }

}