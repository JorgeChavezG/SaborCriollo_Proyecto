package pe.com.saborcriollo_proyecto.room

import androidx.room.*
import pe.com.saborcriollo_proyecto.entity.Reserva


@Dao
interface ReservaDAO {
    @Query("select *from tb_Reserva")
    suspend  fun obtenerReserva():List<Reserva>

    @Query("select * from tb_Reserva where idReserva= :idReserva")
    suspend fun obtenerReservaById(idReserva: Int): Reserva

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun RegistrarReserva()

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