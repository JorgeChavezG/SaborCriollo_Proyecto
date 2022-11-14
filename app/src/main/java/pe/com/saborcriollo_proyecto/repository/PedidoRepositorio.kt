package pe.com.saborcriollo_proyecto.repository

import pe.com.saborcriollo_proyecto.entity.Pedido
import pe.com.saborcriollo_proyecto.room.PedidoDAO

class PedidoRepositorio (private val dao: PedidoDAO){

    val todosLosPedidos = dao.obtenerPedido()

  /*  suspend fun insertar(producto:PedidoDAO ){
        dao.RegistrarPedido(idTipoPedido = 1, fechaHoraPedido = "19", totalPedido = 1, idMetodoPago = 1,
        cod_Ubigeo = "10", direccionPedido = "19", estado = 1)



    }*/
}