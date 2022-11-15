package pe.com.saborcriollo_proyecto.ui.viewmodel


import androidx.lifecycle.*
import kotlinx.coroutines.launch
import pe.com.saborcriollo_proyecto.entity.Pedido
import pe.com.saborcriollo_proyecto.entity.Usuario
import pe.com.saborcriollo_proyecto.repository.UsuarioRepositorio

class UsuarioViewModel (private val repositorio: UsuarioRepositorio ): ViewModel(){



    fun inserta (usuario: Usuario){
        viewModelScope.launch { repositorio.insertar(usuario) }
    }

}