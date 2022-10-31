package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "tb_ComprobantePago")
class ComprobantePago (
    /*Pendiente crear primary key con dos variables*/
    /*Pendiente foreign key TippoComprobante + idPedido + idTipoPedido*/
    @ColumnInfo(name = "TipoComprobante") val TipoComprobante: String,
    @ColumnInfo(name = "NumComprobante") val NumComprobante: Int,
    @ColumnInfo(name = "idPedido") val idPedido: Int,
    @ColumnInfo(name = "idTipoPedido") val idTipoPedido: Int,
    @ColumnInfo(name = "subtotal") val subtotal: Double,
    @ColumnInfo(name = "igv") val igv: Double,
    @ColumnInfo(name = "ImporteTotal") val ImporteTotal: Double,
    /*primary key (TipoComprobante,NumComprobante)*/
)