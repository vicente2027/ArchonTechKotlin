package com.archontech.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.archontech.R;
import com.archontech.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements View.OnClickListener{

    private FragmentHomeBinding binding;
    public NavController navController;
    private Spinner spinnerVenta;
    ArrayAdapter <String> adapter;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       //final TextView textView = binding.textViewCliente;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
       // spinnerVenta = (Spinner) view.findViewById(R.id.spinner2);
       // String [] opciones = {"Seleccione una opción","Efectivo","Tarjeta","Fiado"};
        //ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, opciones);
        //spinnerVenta.setAdapter(adapter);
        view.findViewById(R.id.btnNuevaVenta).setOnClickListener(this);
        view.findViewById(R.id.btnCompraProveedor).setOnClickListener(this);
        view.findViewById(R.id.juanPerez).setOnClickListener(this);

        //view.findViewById(R.id.button_registrar).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == v.findViewById(R.id.btnNuevaVenta)) {

            navController.navigate(R.id.nueva_venta);
        }
        if(v == v.findViewById(R.id.btnCompraProveedor)) {

            navController.navigate(R.id.compraProveedor);
        }
        if(v == v.findViewById(R.id.juanPerez)) {

            navController.navigate(R.id.perfilDeUsuario);
        }
    }
}