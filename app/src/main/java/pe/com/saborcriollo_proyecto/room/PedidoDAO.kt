package pe.com.saborcriollo_proyecto.room

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import pe.com.saborcriollo_proyecto.entity.Pedido


@Dao
interface PedidoDAO {
    @Query("select *from tb_Pedido")
<<<<<<< HEAD
    suspend fun obtenerPedido():List<Pedido>
=======
    fun obtenerPedido(): Flow<List<Pedido>>
>>>>>>> bf728291d3ce95a088e49deb82ca69f3569dd678

    @Query("select * from tb_Pedido where idPedido= :idPedido")
    suspend fun obtenerPedidoById(idPedido: Int): Pedido

    @Insert(onConflict = OnConflictStrategy.IGNORE)
<<<<<<< HEAD
    suspend fun RegistrarPedido(idTipoPedido: Int,
=======
<<<<<<< HEAD
    suspend fun RegistrarPedido()
=======
    fun RegistrarPedido(idTipoPedido: Int,
>>>>>>> 686856386230eda75fe4e70f7a7e508b02e2d711
                        fechaHoraPedido: String,
                        totalPedido:Int,
                        idMetodoPago:Int,
                        cod_Ubigeo:String,
                        direccionPedido:String,
                        estado:Int): Pedido
>>>>>>> bf728291d3ce95a088e49deb82ca69f3569dd678

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