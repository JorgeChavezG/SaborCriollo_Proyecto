package pe.com.saborcriollo_proyecto.room

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import pe.com.saborcriollo_proyecto.entity.Pedido


@Dao
interface PedidoDAO {
    @Query("select *from tb_Pedido")
    fun obtenerPedido(): Flow<List<Pedido>>

    @Query("select * from tb_Pedido where idPedido= :idPedido")
    fun obtenerPedidoById(idPedido: Int): Pedido

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun RegistrarPedido(idTipoPedido: Int,
                        fechaHoraPedido: String,
                        totalPedido:Int,
                        idMetodoPago:Int,
                        cod_Ubigeo:String,
                        direccionPedido:String,
                        estado:Int): Pedido

    @Update(onConflict = OnConflictStrategy.IGNORE)
    fun ActualizarPedido(idTipoPedido: Int,
                         fechaHoraPedido: String,
                         totalPedido:Int,
                         idMetodoPago:Int,
                         cod_Ubigeo:String,
                         direccionPedido:String,
                         estado:Int): Pedido

    @Query("delete from tb_pedido where idPedido= :idPedido")
    fun EliminarPedido(idPedido:Int): Pedido
}