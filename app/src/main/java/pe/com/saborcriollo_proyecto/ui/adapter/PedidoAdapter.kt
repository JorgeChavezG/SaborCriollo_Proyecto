package pe.com.saborcriollo_proyecto.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import pe.com.saborcriollo_proyecto.databinding.FragmentPedidoBinding
import pe.com.saborcriollo_proyecto.entity.Pedido

class PedidoAdapter (val onclick: (Pedido) -> Unit): Adapter<PedidoViewHolder>() {

    private var lista = ArrayList<Pedido>()

    fun cargarLista(list : List<Pedido>){
        lista.addAll(list)
        notifyDataSetChanged()
    }

    fun cargarPedido(pedido: Pedido){
        lista.add(pedido)
        notifyItemInserted(lista.size - 1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PedidoViewHolder {
        val binding = FragmentPedidoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PedidoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PedidoViewHolder, position: Int) {
        val pedido = lista[position]
        holder.cargarPedidos(pedido)
        holder.itemView.setOnClickListener{
            onClick(pedido)
        }
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}
