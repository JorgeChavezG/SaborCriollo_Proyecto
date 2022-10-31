package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_Cliente")
class Cliente (
    /*Pendiente foreign key cod_Ubigeo*/
    @PrimaryKey @ColumnInfo(name = "idCliente") val idCliente: Int,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "apellido") val apellido: String,
    @ColumnInfo(name = "correo") val correo: String,
    @ColumnInfo(name = "telefono") val telefono: String,
    @ColumnInfo(name = "idTipoDocumento") val idTipoDocumento: Int,
    @ColumnInfo(name = "documento") val documento: String,
    @ColumnInfo(name = "cod_Ubigeo") val cod_Ubigeo: String,
    @ColumnInfo(name = "direccion") val direccion:String

)