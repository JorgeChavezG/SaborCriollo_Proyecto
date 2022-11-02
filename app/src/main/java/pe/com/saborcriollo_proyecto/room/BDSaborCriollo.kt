package pe.com.saborcriollo_proyecto.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase



abstract class BDSaborCriollo : RoomDatabase(){


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