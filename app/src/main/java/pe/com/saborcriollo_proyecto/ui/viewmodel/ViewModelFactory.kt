package pe.com.saborcriollo_proyecto.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import pe.com.saborcriollo_proyecto.repository.PedidoRepositorio

class ViewModelFactory (private val repositorio: PedidoRepositorio) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PedidoViewModel::class.java)) {
            return PedidoViewModel(repositorio) as T
        }

        throw  IllegalArgumentException("ViewModel no encontrado")
    }
}