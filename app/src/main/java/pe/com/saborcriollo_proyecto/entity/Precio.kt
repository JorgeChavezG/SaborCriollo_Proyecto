package pe.com.saborcriollo_proyecto.entity

import androidx.room.*

@Entity(tableName = "tb_Precio",
    foreignKeys = [
        ForeignKey(entity = Producto::class,
            parentColumns = ["name"],
            childColumns = ["idProducto"]),
        ForeignKey(entity = Categoria::class,
        parentColumns = ["name"],
        childColumns = ["idCategoria"]),
    ],
    indices = [
        Index(value = ["idProducto"]),
        Index(value = ["idCategoria"])])
class Precio (
    @PrimaryKey
    @ColumnInfo(name = "idPrecio")
    val idPrecio: Int,
    @ColumnInfo(name = "idProducto") /*foreign key*/
    val idProducto: Int,
    @ColumnInfo(name = "idCategoria") /*foreign key*/
    val idCategoria: Int,
    @ColumnInfo(name = "precioUnitario")
    val precioUnitario: Int
    ):java.io.Serializable {
}