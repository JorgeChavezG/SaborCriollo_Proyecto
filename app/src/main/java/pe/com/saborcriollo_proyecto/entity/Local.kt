package pe.com.saborcriollo_proyecto.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_Local")
class Local (
    /*Pendiente foreign key cod_Ubigeo*/
    @PrimaryKey @ColumnInfo(name = "idLocal") val idLocal: Int,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "cod_Ubigeo") val cod_Ubigeo: String,
    @ColumnInfo(name = "direccion") val direccion: String,
    @ColumnInfo(name = "telefono") val telefono: String,
    @ColumnInfo(name = "horarioAtencion") val horarioAtencion: String
)