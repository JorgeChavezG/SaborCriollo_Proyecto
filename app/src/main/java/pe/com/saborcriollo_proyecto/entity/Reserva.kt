package pe.com.saborcriollo_proyecto.entity

import androidx.room.*

@Entity(tableName = "tb_Reserva",
    foreignKeys = [
        ForeignKey( entity = Local::class,
                    parentColumns = ["name"],
                    childColumns = ["idLocal"]),
        ForeignKey( entity = Usuario::class,
                    parentColumns = ["name"],
                    childColumns = ["idUsuario"])],
    indices = [
        Index(value = ["idLocal"])])
class Reserva (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idReserva")
    val idReserva: Int,
    @ColumnInfo(name = "idLocal") /*foreign key*/
    val idLocal: Int,
    @ColumnInfo(name = "idUsuario") /*foreign key*/
    val idUsuario: Int,
    @ColumnInfo(name = "fechaReserva")
    val fechaReserva: String,
    @ColumnInfo(name = "horaReserva")
    val horaReserva: Int,
    @ColumnInfo(name = "cantidadPersonas")
    val cantidadPersonas: Int,
    @ColumnInfo(name = "observacion")
    val observacion: String,
    @ColumnInfo(name = "estado")
    val estado: Int
):java.io.Serializable {
}