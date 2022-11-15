package pe.com.saborcriollo_proyecto.repository

import pe.com.saborcriollo_proyecto.entity.Usuario
import pe.com.saborcriollo_proyecto.room.UsuarioDAO

class UsuarioRepositorio  (private val objUsuario : UsuarioDAO){

    suspend fun insertar (usuario:Usuario){
        objUsuario.RegistrarUsuario("jorge10009@hotmail.com"," 123456")
    }
    suspend fun obtener (usuario: Usuario){
        objUsuario.obtenerUsuario("")
    }

}
