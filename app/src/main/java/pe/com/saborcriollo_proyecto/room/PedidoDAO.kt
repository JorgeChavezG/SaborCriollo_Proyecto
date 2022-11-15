package pe.com.saborcriollo_proyecto.room

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import pe.com.saborcriollo_proyecto.entity.Pedido


@Dao
interface PedidoDAO {
    @Query("select * from tb_Pedido order by idCliente")
    suspend fun obtenerPedido(): Flow<List<Pedido>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun RegistrarPedido()

    fun RegistrarPedido(idTipoPedido: Int,
                        fechaHoraPedido: String,
                        totalPedido:Int,
                        idMetodoPago:Int,
                        cod_Ubigeo:String,
                        direccionPedido:String,
                        estado:Int): Pedido


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