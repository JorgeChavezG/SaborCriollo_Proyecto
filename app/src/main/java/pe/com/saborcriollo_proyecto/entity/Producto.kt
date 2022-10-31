package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_Producto")
class Producto (

    @PrimaryKey
    @ColumnInfo(name = "idProducto") val idProducto: Int,
    @ColumnInfo(name = "descripcion") val descripcion: String,
    @ColumnInfo(name = "idCategoria") val idCategoria: Int,
    @ColumnInfo(name = "stock") val stock: Int
):java.io.Serializable {
}