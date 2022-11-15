package pe.com.saborcriollo_proyecto.room

import androidx.room.*
import pe.com.saborcriollo_proyecto.entity.Usuario

@Dao
interface UsuarioDAO {

    @Query("select *from TB_USUARIO")
     fun obtenerUsuario():List<Usuario>

    @Query ("select * from tb_Usuario where correo= :correo and clave=:clave")
    suspend fun obtenerCorreoAndClave(correo:String,clave:String): Usuario

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun RegistrarUsuario (usuario: Usuario)

    @Update
    suspend fun ActualizarUsuario(correo: String,clave: String)
}