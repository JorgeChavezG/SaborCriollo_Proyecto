package pe.com.saborcriollo_proyecto.room

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update
import pe.com.saborcriollo_proyecto.entity.Usuario

@Dao
interface UsuarioDAO {
    @Query("select *from TB_USUARIO")
    fun obtenerUsuario():List<Usuario>

    @Query ("select * from tb_Usuario where correo= :correo and clave=:clave")
    fun obtenerCorreoAndClave(correo:String,clave:String): Usuario

    @Update
    fun ActualizarUsuario(correo: String,clave: String)
}