package pe.com.saborcriollo_proyecto.repository

import pe.com.saborcriollo_proyecto.entity.Usuario
import pe.com.saborcriollo_proyecto.room.UsuarioDAO

class UsuarioRepositorio  (private val objUsuario : UsuarioDAO){

    val todosLosUsuarios = objUsuario.obtenerUsuario()

    suspend fun insertar (usuario:Usuario){
        objUsuario.RegistrarUsuario(usuario)
    }
    suspend fun obtener (usuario: Usuario){
        objUsuario.obtenerCorreoAndClave("","")
    }

}
