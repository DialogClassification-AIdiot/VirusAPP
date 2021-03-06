package com.example.virusapp.ui.scholar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.virusapp.R;

public class ScholarFragment extends Fragment {

    private ScholarViewModel scholarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        scholarViewModel =
                ViewModelProviders.of(this).get(ScholarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_scholar, container, false);
        final TextView textView = root.findViewById(R.id.text_scholar);
        scholarViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}