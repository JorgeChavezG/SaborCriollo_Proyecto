package pe.com.saborcriollo_proyecto.ui.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import pe.com.saborcriollo_proyecto.databinding.FragmentPedidoBinding
import pe.com.saborcriollo_proyecto.entity.Producto

class PedidoViewHolder (val binding: FragmentPedidoBinding) : ViewHolder(binding.root){

    fun cargarPedidos(producto: Producto) {
        binding.txtPollobrasa.text = producto.descripcion
        binding.txtComidacriolla.text = producto.descripcion
    }
}