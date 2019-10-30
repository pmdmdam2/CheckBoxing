package com.ejemplo.checkboxing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Actividad de ejemplo para CheckBoxes. Por cada CheckBox en el que se toque aparecerá un mensaje
 * de tipo Toast con el texto correspondiente y el estado del CheckBox
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        checkBox4 = findViewById(R.id.checkbox4);
        checkBox5 = findViewById(R.id.checkbox5);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()){
                    Toast.makeText(MainActivity.this, checkBox1.getText()+" checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, checkBox1.getText()+" Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox2.isChecked()){
                    Toast.makeText(MainActivity.this, checkBox2.getText()+" checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, checkBox2.getText()+" Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox3.isChecked()){
                    Toast.makeText(MainActivity.this, checkBox3.getText()+" checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, checkBox3.getText()+" Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox4.isChecked()){
                    Toast.makeText(MainActivity.this, checkBox4.getText()+" checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, checkBox4.getText()+" Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox5.isChecked()){
                    Toast.makeText(MainActivity.this, checkBox5.getText()+" checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, checkBox5.getText()+" Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
