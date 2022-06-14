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
import com.archontech.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        supportActionBar!!.hide()
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration.Builder(
            R.id.navigation_home,
            R.id.navigation_dashboard,
            R.id.navigation_inventario,
            R.id.navigation_clientesProveedores
        )
            .build()
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main)
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        NavigationUI.setupWithNavController(binding!!.navView, navController)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            if (destination.id == R.id.pantallaBienvenida || destination.id == R.id.pantalla_inicioSesion || destination.id == R.id.pantalla_registrarNegocio) {
                navView.visibility = View.GONE
            } else {
                navView.visibility = View.VISIBLE
            }
        }
    }
}