package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_Precio")
class Precio (

    @PrimaryKey
    @ColumnInfo(name = "idPrecio") val idPrecio: Int,
    @ColumnInfo(name = "idProducto") val idProducto: Int,
    @ColumnInfo(name = "idCategoria") val idCategoria: Int,
    @ColumnInfo(name = "precioUnitario") val precioUnitario: Int
    ):java.io.Serializable {
}