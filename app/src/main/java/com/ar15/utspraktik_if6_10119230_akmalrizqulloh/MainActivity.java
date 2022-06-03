package com.ar15.utspraktik_if6_10119230_akmalrizqulloh;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private DataPickerDialog dataPickerDialog;
    private Button dataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDataPicker();
        dataButton = findViewById(R.id.dataPicekrButton);
    }

    private void initDataPicker()
    {
        DataPickerDialog.OnDataSetListener dataSetListener =
    }
    public void openDataPicker(View view) {
    }
}