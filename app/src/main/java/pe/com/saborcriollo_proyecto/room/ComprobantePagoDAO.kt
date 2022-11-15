package pe.com.saborcriollo_proyecto.room

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import pe.com.saborcriollo_proyecto.entity.ComprobantePago
import pe.com.saborcriollo_proyecto.entity.Pedido

interface  ComprobantePagoDAO {
    @Query("select *from tb_comprobantepago")
    fun obtenerComprobantePago():List<ComprobantePago>

    @Query("select * from tb_comprobantepago where TipoComprobante= :TipoComprobante")
    suspend fun obtenerPedidoById(TipoComprobante: String): ComprobantePago

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

    @Query("delete from tb_comprobantepago where idPedido= :idPedido")
    suspend fun EliminarPedido(idPedido:Int): Pedido
}