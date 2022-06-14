package com.archontech.ui.home

import androidx.navigation.NavController
import android.widget.Spinner
import android.widget.ArrayAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.archontech.ui.home.HomeViewModel
import androidx.lifecycle.ViewModelProvider
import com.archontech.R
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.navigation.Navigation
import com.archontech.databinding.FragmentHomeBinding

class HomeFragment : Fragment(), View.OnClickListener {
    private var binding: FragmentHomeBinding? = null
    var navController: NavController? = null
    private val spinnerVenta: Spinner? = null
    var adapter: ArrayAdapter<String>? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val homeViewModel = ViewModelProvider(this).get(
            HomeViewModel::class.java
        )
        binding =
            FragmentHomeBinding.inflate(inflater, container, false)

        //final TextView textView = binding.textViewCliente;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        // spinnerVenta = (Spinner) view.findViewById(R.id.spinner2);
        // String [] opciones = {"Seleccione una opción","Efectivo","Tarjeta","Fiado"};
        //ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, opciones);
        //spinnerVenta.setAdapter(adapter);
        view.findViewById<View>(R.id.btnNuevaVenta).setOnClickListener(this)
        //view.findViewById<View>(R.id.btnCompraProveedor).setOnClickListener(this)
        view.findViewById<View>(R.id.juanPerez).setOnClickListener(this)

        //view.findViewById(R.id.button_registrar).setOnClickListener(this);
    }

    override fun onClick(v: View) {
        if (v === v.findViewById<View>(R.id.btnNuevaVenta)) {
            navController!!.navigate(R.id.nueva_venta)
        }
       // if (v === v.findViewById<View>(R.id.btnCompraProveedor)) {
      //      navController!!.navigate(R.id.compraProveedor)
      //  }
        if (v === v.findViewById<View>(R.id.juanPerez)) {
            navController!!.navigate(R.id.perfilDeUsuario)
        }
    }
}