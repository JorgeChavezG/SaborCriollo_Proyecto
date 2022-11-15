package pe.com.saborcriollo_proyecto.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import pe.com.saborcriollo_proyecto.entity.Pedido
import pe.com.saborcriollo_proyecto.repository.PedidoRepositorio

class PedidoViewModel (private val pedidorepositorio: PedidoRepositorio) : ViewModel() {

    val todoPedidos: LiveData<List<Pedido>> = pedidorepositorio.todosLosPedidos.asLiveData()

    fun inserta(pedido: Pedido) {
        viewModelScope.launch {
            pedidorepositorio.insertar(pedido)
        }
    }

    fun actualiza(pedido: Pedido) {
        viewModelScope.launch {
            pedidorepositorio.actualizar(pedido)
        }
    }

    fun elimina(idPedido:Int) {
        viewModelScope.launch {
            pedidorepositorio.eliminar(idPedido)
        }
    }
}

