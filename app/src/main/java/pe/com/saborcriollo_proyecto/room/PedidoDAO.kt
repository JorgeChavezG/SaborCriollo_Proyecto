package pe.com.saborcriollo_proyecto.room

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import pe.com.saborcriollo_proyecto.entity.Pedido


@Dao
interface PedidoDAO {
    @Query("select * from tb_Pedido order by idCliente")
    suspend fun obtenerPedido(): Flow<List<Pedido>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
<<<<<<< HEAD
=======
<<<<<<< HEAD
    suspend fun RegistrarPedido(idTipoPedido: Int,
=======
<<<<<<< HEAD
>>>>>>> 309933037c3092a0d3b2a08db2b6b544586c2629
    suspend fun RegistrarPedido()

    fun RegistrarPedido(idTipoPedido: Int,
>>>>>>> 686856386230eda75fe4e70f7a7e508b02e2d711
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