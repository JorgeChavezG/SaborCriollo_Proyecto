package pe.com.saborcriollo_proyecto.room

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import pe.com.saborcriollo_proyecto.entity.Pedido


@Dao
interface PedidoDAO {
    @Query("select * from tb_Pedido order by idPedido")
    fun obtenerPedido(): Flow<List<Pedido>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun RegistrarPedido(pedido: Pedido)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun ActualizarPedido(pedido: Pedido)

    @Query("delete from tb_Pedido where idPedido= :idPedido")
    suspend fun EliminarPedido(idPedido:Int)
}