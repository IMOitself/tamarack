package com.tamarack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tamarack.databinding.ActivityMainBinding;
//import com.tamarack.bridge.Native;
import com.tamarack.CodeEditorView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CodeEditorView codeEditor = binding.codeEditor;
    }
}
