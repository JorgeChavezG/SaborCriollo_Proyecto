package pe.com.saborcriollo_proyecto.ui.viewmodel

import android.app.Application
import pe.com.saborcriollo_proyecto.repository.UsuarioRepositorio
import pe.com.saborcriollo_proyecto.room.BDSaborCriollo

class UsuarioApplication: Application(){

    val bd by lazy { BDSaborCriollo.getBaseDatos(this) }

    val repositorio by lazy {UsuarioRepositorio(bd.UsuarioDAO())}
}