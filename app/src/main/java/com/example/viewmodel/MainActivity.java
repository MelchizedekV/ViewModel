package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add;
    TextView textView;
    String value;
    AuthViewModel authViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        authViewModel = ViewModelProviders.of(this).get(AuthViewModel.class);
        add = findViewById(R.id.Add);
        textView =findViewById(R.id.textView);
        value =String.valueOf(authViewModel.addThreeNumbers());
        textView.setText(value);
        addListner();
    }

    private void addListner()
    {

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView.setText(String.valueOf(authViewModel.addThreeNumbers()));
            }
        });
    }
}
