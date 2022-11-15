package pe.com.saborcriollo_proyecto.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import pe.com.saborcriollo_proyecto.entity.*


@Database(
    entities = [Categoria::class,
                Cliente::class,
                ComprobantePago::class,
                DetallePedido::class,
                Local::class,
                Pedido::class,
                Precio::class,
                Producto::class,
                Reserva::class,
                TipoComprobante::class,
                TipoPedido::class,
                TipoDocumento::class,
                MetodoPago::class,
                PrecioDelivery::class,
                Ubigeo::class,
                Usuario::class], version = 1
)
abstract class BDSaborCriollo : RoomDatabase(){
    abstract fun pedidoDao(): PedidoDAO
    abstract fun UsuarioDAO(): UsuarioDAO



    companion object{
        private var INSTANCE: BDSaborCriollo?=null
        fun getBaseDatos(context: Context):BDSaborCriollo{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(context, BDSaborCriollo::class.java, "saborcriollo").build()
                INSTANCE = instance
                instance
            }
        }
    }
}