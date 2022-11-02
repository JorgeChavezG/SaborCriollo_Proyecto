package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class TipoDocumento (
    @PrimaryKey
    @ColumnInfo(name = "idTipoDocumento")
    val idTipoDocumento: Int,
    @ColumnInfo(name = "descripcion")
    val descripcion: String
)