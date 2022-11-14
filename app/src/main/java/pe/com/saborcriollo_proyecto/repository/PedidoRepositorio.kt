package pe.com.saborcriollo_proyecto.repository

import pe.com.saborcriollo_proyecto.entity.Pedido
import pe.com.saborcriollo_proyecto.room.PedidoDAO

class PedidoRepositorio (private val dao: PedidoDAO){

    val todosLosPedidos = dao.obtenerPedido()

    /*suspend fun insertar(pedido: Pedido) {
        dao.RegistrarPedido(pedido)
    }*/
}