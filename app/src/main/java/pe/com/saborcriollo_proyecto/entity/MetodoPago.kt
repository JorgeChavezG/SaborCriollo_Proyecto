package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_MetodoPago")
class MetodoPago (
    @PrimaryKey
    @ColumnInfo(name = "idMetodoPago")
    val idMetodoPago: Int,
    @ColumnInfo(name = "descripcion")
    val descripcion: String
)