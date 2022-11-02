package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_Usuario")
class Usuario (

    @PrimaryKey
    @ColumnInfo(name = "idUsuario") val idUsuario: Int,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "apellido") val apellido: String,
    @ColumnInfo(name = "telefono") val telefono: String,
    @ColumnInfo(name = "idTipoDocumento") val idTipoDocumento: Int,
    @ColumnInfo(name = "documento") val documento: String,
    @ColumnInfo(name = "correo") val correo: String,
    @ColumnInfo(name = "clave") val clave: String
):java.io.Serializable {
}