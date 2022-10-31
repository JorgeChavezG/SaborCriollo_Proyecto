package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_Reserva")
class Reserva (

    @PrimaryKey
    @ColumnInfo(name = "idReserva") val idReserva: Int,
    @ColumnInfo(name = "idLocal") val idLocal: Int,
    @ColumnInfo(name = "nombreCliente") val nombreCliente: String,
    @ColumnInfo(name = "apellidoCliente") val apellidoCliente: String,
    @ColumnInfo(name = "documento") val documento: String,
    @ColumnInfo(name = "correoCliente") val correoCliente: String,
    @ColumnInfo(name = "telefono") val telefono: String,
    @ColumnInfo(name = "fechaReserva") val fechaReserva: String,
    @ColumnInfo(name = "horaReserva") val horaReserva: Int,
    @ColumnInfo(name = "cantidadPersonas") val cantidadPersonas: Int,
    @ColumnInfo(name = "observacion") val observacion: String,
    @ColumnInfo(name = "estado") val estado: Int
):java.io.Serializable {
}