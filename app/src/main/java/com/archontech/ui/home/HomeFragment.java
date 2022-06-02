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


        view.findViewById(R.id.botonNuevaVenta).setOnClickListener(this);
       // view.findViewById(R.id.btnNuevoProducto).setOnClickListener(this);
        //view.findViewById(R.id.button_registrar).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == v.findViewById(R.id.botonNuevaVenta)) {

            navController.navigate(R.id.nueva_venta);
        }
        //if(v == v.findViewById(R.id.btnNuevoProducto)) {

           // navController.navigate(R.id.nuevoProducto);
       // }
    }
}