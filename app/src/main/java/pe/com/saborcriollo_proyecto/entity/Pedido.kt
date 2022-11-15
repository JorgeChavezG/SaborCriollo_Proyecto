package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "tb_Pedido",
    foreignKeys = [
        ForeignKey(entity = Usuario::class,
            parentColumns = ["name"],
            childColumns = ["idUsuario"]),
        ForeignKey(entity = TipoPedido::class,
            parentColumns = ["name"],
            childColumns = ["idTipoPedido"]),
        ForeignKey(entity = MetodoPago::class,
            parentColumns = ["name"],
            childColumns = ["idMetodoPago"]),
        ForeignKey(entity = Ubigeo::class,
            parentColumns = ["name"],
            childColumns = ["cod_Ubigeo"])
    ])
 class Pedido(
    @PrimaryKey
    @ColumnInfo(name = "idPedido")
    val idPedido: Int = 0,
    @ColumnInfo(name = "idUsuario") /*foreign key*/
    val idUsuario: Int,
    @ColumnInfo(name = "idTipoPedido") /*foreign key*/
    val idTipoPedido: Int,
    @ColumnInfo(name = "fechaHoraPedido")
    val fechaHoraPedido: String,
    @ColumnInfo(name = "totalPedido")
    val totalPedido: Double,
    @ColumnInfo(name = "idMetodoPago") /*foreign key*/
    val idMetodoPago: Int,
    @ColumnInfo(name = "cod_Ubigeo") /*foreign key*/
    val cod_Ubigeo: String,
    @ColumnInfo(name = "direccionPedido")
    val direccionPedido: String,
    @ColumnInfo(name = "estado")
    val estado: Int
):java.io.Serializable {
}
