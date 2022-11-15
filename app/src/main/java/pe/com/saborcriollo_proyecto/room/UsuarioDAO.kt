package pe.com.saborcriollo_proyecto.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import pe.com.saborcriollo_proyecto.entity.Usuario

@Dao
interface UsuarioDAO {

    @Query("select *from TB_USUARIO")
    suspend fun obtenerUsuario(s: String):List<Usuario>

    @Query ("select * from tb_Usuario where correo= :correo and clave=:clave")
    suspend fun obtenerCorreoAndClave(correo:String,clave:String): Usuario

    @Insert
    suspend fun RegistrarUsuario (correo: String,clave: String)

    @Update
    suspend fun ActualizarUsuario(correo: String,clave: String)
}