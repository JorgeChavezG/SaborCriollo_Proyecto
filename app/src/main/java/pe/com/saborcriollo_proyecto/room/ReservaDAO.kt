package pe.com.saborcriollo_proyecto.room

import androidx.room.*
import pe.com.saborcriollo_proyecto.entity.Reserva


@Dao
interface ReservaDAO {
    @Query("select  tb_Reserva.idReserva, tb_Reserva.nombreCliente, " +
            "       tb_Local.nombre,tb_Reserva.fechaReserva,tb_Reserva.horaReserva," +
            "       tb_Reserva.cantidadPersonas " +
            "from tb_Reserva " +
            "join tb_Local " +
            "on tb_Reserva.idLocal = tb_Local.nombre where idReserva = :idReserva")
    suspend fun obtenerReserva(idReserva: Int):List<Reserva>

    /*@Query("select * from tb_Reserva where idReserva = :idReserva")
    suspend fun obtenerReservaById(idReserva: Int): Reserva*/

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun RegistrarReserva(   idReserva: Int,
                                    nombreCliente: String,
                                    idLocal: Int,
                                    fechaReserva: String,
                                    horaReserva: Int,
                                    cantidadPersonas: Int)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun ActualizarReserva(telefono: String,
                          fechaReserva: String,
                          horaReserva:Int,
                          cantidadPersonas:Int,
                          observacion:String,
                          estado:Int):Reserva

    @Query("delete from tb_reserva where idReserva= :idReserva")
    suspend fun EliminarReserva(idReserva:Int):Reserva
}