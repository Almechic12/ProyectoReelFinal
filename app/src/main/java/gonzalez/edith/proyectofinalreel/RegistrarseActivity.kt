package gonzalez.edith.proyectofinalreel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityRegistrarseBinding
    private val userRef = FirebaseDatabase.getInstance().getReference("Users")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        binding = ActivityRegistrarseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        var btnSave: Button =findViewById(R.id.btnregist) as Button
        btnSave.setOnClickListener { saveMarkFromForm() }
        userRef.addChildEventListener(object : ChildEventListener {
            override fun onCancelled(databaseError: DatabaseError) {}
            override fun onChildMoved(dataSnapshot: DataSnapshot, previousName: String?) {}
            override fun onChildChanged(dataSnapshot: DataSnapshot, previousName: String?) {}
            override fun onChildRemoved(dataSnapshot: DataSnapshot) {}

            override fun onChildAdded(dataSnapshot: DataSnapshot, p1: String?) {
                val usuario = dataSnapshot.getValue(User::class.java)
                if (usuario != null) writeMark(usuario)
            }
        })
    }
    private fun saveMarkFromForm() {
        var name: EditText =findViewById(R.id.nombreusuarios) as EditText
        var contra: EditText =findViewById(R.id.contra) as EditText
        var repContra: EditText =findViewById(R.id.repiteContra) as EditText
        var email: EditText = findViewById(R.id.email) as EditText


        val usuario = User(
            name.text.toString(),
            contra.text.toString(),
            repContra.text.toString(),
            email.text.toString()
        )
        userRef.push().setValue(usuario)
    }
    private fun writeMark(mark: User) {
        var listV: TextView = findViewById(R.id.list_textView) as TextView
        val text = listV.text.toString() + mark.toString() + "\n"
        listV.text = text
    }

}