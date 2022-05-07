package gonzalez.edith.proyectofinalreel.ui.cines

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CinesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Esta es la pantalla de cines"
    }
    val text: LiveData<String> = _text
}