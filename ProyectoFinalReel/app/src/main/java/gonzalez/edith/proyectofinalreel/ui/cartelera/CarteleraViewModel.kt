package gonzalez.edith.proyectofinalreel.ui.cartelera

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CarteleraViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Esta es la pantalla de Cartelera"
    }
    val text: LiveData<String> = _text
}