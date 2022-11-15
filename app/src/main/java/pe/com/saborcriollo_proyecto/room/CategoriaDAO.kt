package pe.com.saborcriollo_proyecto.room

import androidx.room.Dao
import androidx.room.Query
import pe.com.saborcriollo_proyecto.entity.Categoria

@Dao
interface CategoriaDAO {
    @Query("Select*from tb_Categoria")
    suspend fun obtenerCategia(): List<Categoria>


}