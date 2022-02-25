package com.example.aula02;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoTexto = (Button) findViewById(R.id.button1);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.sexo);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(radioButtonId);


        View.OnClickListener clickListener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Olá mundo!", Toast.LENGTH_SHORT);

                // Toast toast = Toast.makeText(getApplicationContext(), radioButton.getText(), Toast.LENGTH_SHORT);

                toast.show();

            }
        };

        botaoTexto.setOnClickListener(clickListener);

    }
}