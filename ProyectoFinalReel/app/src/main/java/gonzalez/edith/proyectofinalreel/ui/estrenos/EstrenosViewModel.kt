package gonzalez.edith.proyectofinalreel.ui.estrenos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EstrenosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Esta es la pantalla de Estrenos"
    }
    val text: LiveData<String> = _text
}