package pe.com.saborcriollo_proyecto.repository

import pe.com.saborcriollo_proyecto.entity.Pedido
import pe.com.saborcriollo_proyecto.room.PedidoDAO

class PedidoRepositorio (private val dao: PedidoDAO){

    val todosLosPedidos = dao.obtenerPedido()

<<<<<<< HEAD
    suspend fun insertar(pedido: Pedido){
        dao.RegistrarPedido(pedido)
    }
=======
   suspend fun insertar(producto:Pedido ){
        dao.RegistrarPedido(idTipoPedido = 1, fechaHoraPedido = "19", totalPedido = 1, idMetodoPago = 1,
        cod_Ubigeo = "10", direccionPedido = "19", estado = 1)
>>>>>>> 309933037c3092a0d3b2a08db2b6b544586c2629

    suspend fun actualizar(pedido: Pedido){
        dao.ActualizarPedido(pedido)
    }

<<<<<<< HEAD
    suspend fun eliminar(pedido: Pedido){
        dao.EliminarPedido(pedido)
=======

>>>>>>> 309933037c3092a0d3b2a08db2b6b544586c2629
    }
}