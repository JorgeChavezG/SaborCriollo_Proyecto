package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_DetallePedido")
class DetallePedido (
    /*Pendiente foreign key idPedido + idProducto + idPrecio*/
    @PrimaryKey @ColumnInfo(name = "idDetallePedido") val idDetallePedido: Int,
    @ColumnInfo(name = "idPedido") val idPedido: Int,
    @ColumnInfo(name = "idProducto") val idProducto: Int,
    @ColumnInfo(name = "cantidad") val cantidad: Int,
    @ColumnInfo(name = "idPrecio") val idPrecio: Int,

    )