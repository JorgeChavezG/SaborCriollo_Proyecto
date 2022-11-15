package pe.com.saborcriollo_proyecto.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import pe.com.saborcriollo_proyecto.databinding.FragmentDetallePedidoBinding
import pe.com.saborcriollo_proyecto.entity.Pedido
import pe.com.saborcriollo_proyecto.ui.viewmodel.PedidoApplication
import pe.com.saborcriollo_proyecto.ui.viewmodel.PedidoViewModel
import pe.com.saborcriollo_proyecto.ui.viewmodel.ViewModelFactory

class DetallePedidoFragment : Fragment() {
    private var _binding: FragmentDetallePedidoBinding? = null
    val binding get() = _binding!!

    private val pedidoViewModel: PedidoViewModel by viewModels {
        val saborcriolloApp = requireActivity().application as PedidoApplication

        ViewModelFactory(saborcriolloApp.repository)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetallePedidoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pedidoViewModel.todoPedidos.observe(viewLifecycleOwner) { lista ->
            println("CAMBIA LA INFORMACION")
            for (obj in lista) {
                println(obj.toString())
            }
        }

        binding.btnRetorno1.setOnClickListener {
        }

        binding.btnCarrito1.setOnClickListener {
            val pedido = Pedido(idCliente = 1, idTipoPedido = 1, fechaHoraPedido = "2022-09-05 12:30:00",
                totalPedido = 60.80, idMetodoPago = 1, cod_Ubigeo = "001", direccionPedido = "Calle Los Alhelies 341", estado = 1)
            pedidoViewModel.inserta(pedido)
        }

        binding.btnCarrito2.setOnClickListener {
            val pedido = Pedido(idCliente = 2, idTipoPedido = 2, fechaHoraPedido = "2022-08-04 11:35:00",
                totalPedido = 37.80, idMetodoPago = 2, cod_Ubigeo = "002", direccionPedido = "Calle Los Geranios 221", estado = 2)
            pedidoViewModel.inserta(pedido)
        }

        binding.btnComprar.setOnClickListener {
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}