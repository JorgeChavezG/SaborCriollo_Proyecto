package pe.com.saborcriollo_proyecto.ui.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import pe.com.saborcriollo_proyecto.R
import pe.com.saborcriollo_proyecto.databinding.FragmentRegistroBinding
import pe.com.saborcriollo_proyecto.entity.Usuario
import pe.com.saborcriollo_proyecto.ui.viewmodel.ProductoViewModel
import pe.com.saborcriollo_proyecto.ui.viewmodel.UsuarioApplication
import pe.com.saborcriollo_proyecto.ui.viewmodel.UsuarioViewModel
import pe.com.saborcriollo_proyecto.ui.viewmodel.ViewModelFactory


class RegistroFragment : Fragment() {
    private var _binding : FragmentRegistroBinding? = null
    val binding get() = _binding !!

    private val usuarioViewModel : UsuarioViewModel by viewModels {
        val usuarioApp = requireActivity().application as UsuarioApplication
    ViewModelFactory(usuarioApp.repositorio)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistroBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegistrar.setOnClickListener {
            val correo = binding.txtCorreo.editText?.text.toString()
            if(correo.isEmpty()){
                binding.txtCorreo.error = "Campo Requerido"
                return@setOnClickListener
            }else if (correo.length <10){
                binding.txtCorreo.error = "Campo Incompleto"
                return@setOnClickListener
            }
            val nomusu = binding.txtNombreusuario.editText?.text.toString()
            if(nomusu.isEmpty()){
                binding.txtNombreusuario.error = "Campo requerido"
                return@setOnClickListener
            }
            val contraseña = binding.txtContrasena.editText?.text.toString()
            if(contraseña.isEmpty()){
                binding.txtContrasena.error = "Campo requerido"
                return@setOnClickListener

            }else if (contraseña.length < 3){
                binding.txtContrasena.error = "Contraseña muy corta"
                return@setOnClickListener
            }

        val usu = Usuario(correo= correo, nombre = nomusu, clave = contraseña)

            usuarioViewModel.inserta(usu)

            val directions = RegistroFragmentDirections.actionRegistroFragmentToListaFragment()
            findNavController().navigate(directions)
    }
        }
    }

