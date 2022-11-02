package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_Pedido")
class Pedido (

    @PrimaryKey @ColumnInfo(name = "idPedido") val idPedido: Int,
    @ColumnInfo(name = "idCliente") val idCliente: Int,
    @ColumnInfo(name = "idTipoPedido") val idTipoPedido: Int,
    @ColumnInfo(name = "fechaHoraPedido") val fechaHoraPedido: String,
    @ColumnInfo(name = "totalPedido") val totalPedido: Int,
    @ColumnInfo(name = "idMetodoPago") val idMetodoPago: Int,
    @ColumnInfo(name = "cod_Ubigeo") val cod_Ubigeo: String,
    @ColumnInfo(name = "direccionPedido") val direccionPedido: String,
    @ColumnInfo(name = "estado") val estado: Int
    ):java.io.Serializable {
}