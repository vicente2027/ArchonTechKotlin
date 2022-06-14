package com.archontech

import androidx.navigation.NavController
import android.os.Bundle
import com.archontech.clientesAdeudo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.archontech.R
import com.archontech.clientesPorCobrar
import com.archontech.ClientesProveedores
import com.archontech.compraProveedor
import com.archontech.escanearProducto
import com.archontech.Inventario
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.NavController.OnDestinationChangedListener
import androidx.navigation.NavDestination
import androidx.navigation.Navigation
import com.archontech.modificarProducto
import com.archontech.notificarAdeudo
import com.archontech.nueva_venta
import com.archontech.nuevoProducto
import com.archontech.pagarAdeudo
import com.archontech.pantalla_inicioSesion
import com.archontech.pantalla_registrarNegocio
import com.archontech.pantallaBienvenida
import com.archontech.perfilDeUsuario
import com.archontech.Proveedores

/**
 * A simple [Fragment] subclass.
 * Use the [pantalla_inicioSesion.newInstance] factory method to
 * create an instance of this fragment.
 */
class pantalla_inicioSesion : Fragment(), View.OnClickListener {
    var navController: NavController? = null

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments!!.getString(ARG_PARAM1)
            mParam2 = arguments!!.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pantalla_inicio_sesion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<View>(R.id.buttonEntrar).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        navController!!.navigate(R.id.navigation_home)
    }

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment pantalla_inicioSesion.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String?, param2: String?): pantalla_inicioSesion {
            val fragment = pantalla_inicioSesion()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
}