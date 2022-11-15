package pe.com.saborcriollo_proyecto.room

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import pe.com.saborcriollo_proyecto.entity.Pedido
import pe.com.saborcriollo_proyecto.entity.Reserva

interface PedidoDAO {
    @Query("select *from tb_Pedido")
    suspend fun obtenerPedido():List<Pedido>

    @Query("select * from tb_Pedido where idPedido= :idPedido")
    suspend fun obtenerPedidoById(idPedido: Int): Pedido

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun RegistrarPedido()

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun ActualizarPedido(idTipoPedido: Int,
                         fechaHoraPedido: String,
                         totalPedido:Int,
                         idMetodoPago:Int,
                         cod_Ubigeo:String,
                         direccionPedido:String,
                         estado:Int): Pedido

    @Query("delete from tb_pedido where idPedido= :idPedido")
    suspend fun EliminarPedido(idPedido:Int): Pedido
}