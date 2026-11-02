package com.tamarack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.tamarack.databinding.ActivityMainBinding;
import com.tamarack.bridge.Native;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView tv = binding.eh;
        Button btn = binding.button;
        btn.setOnClickListener(v -> tv.setText(
                Native.stringFromJNI()
        ));
    }
}
