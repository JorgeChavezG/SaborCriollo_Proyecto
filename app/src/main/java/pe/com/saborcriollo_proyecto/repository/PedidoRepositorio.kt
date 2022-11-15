package pe.com.saborcriollo_proyecto.repository

import pe.com.saborcriollo_proyecto.entity.Pedido
import pe.com.saborcriollo_proyecto.room.PedidoDAO

class PedidoRepositorio (private val dao: PedidoDAO){

    val todosLosPedidos = dao.obtenerPedido()

    suspend fun insertar(pedido: Pedido){
        dao.RegistrarPedido(pedido)
    }

    suspend fun actualizar(pedido: Pedido){
        dao.ActualizarPedido(pedido)
    }

<<<<<<< HEAD
    suspend fun eliminar(idPedido:Int){
        dao.EliminarPedido(idPedido)
=======
    suspend fun eliminar(pedido: Pedido){
        dao.EliminarPedido(idPedido = 1)
>>>>>>> 466801f5ff407775f30d686f5ac329c01dcff912
    }
}