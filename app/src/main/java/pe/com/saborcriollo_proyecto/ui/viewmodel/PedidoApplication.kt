package pe.com.saborcriollo_proyecto.ui.viewmodel

import android.app.Application
import pe.com.saborcriollo_proyecto.repository.PedidoRepositorio
import pe.com.saborcriollo_proyecto.room.BDSaborCriollo

class PedidoApplication : Application() {

    val basededatos by lazy {BDSaborCriollo.getBaseDatos(this)}

    val repository by lazy {PedidoRepositorio(basededatos.pedidoDao())}

}