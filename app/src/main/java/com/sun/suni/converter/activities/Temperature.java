package com.sun.suni.converter.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.sun.suni.converter.adapters.CustomSpinnerAdapter;
import com.sun.suni.converter.R;
import com.sun.suni.converter.converter.TemperatureConverter;

public class Temperature extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp1,sp2;
    EditText input,result;
    Button conv;
    String ufrom,uto;
    TemperatureConverter con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);

        input = (EditText) findViewById(R.id.ip);
        result = (EditText) findViewById(R.id.res);
        result.setClickable(false);
        conv = (Button) findViewById(R.id.button);
        con = new TemperatureConverter();

        sp1 = (Spinner) findViewById(R.id.spinner);
        sp2 = (Spinner) findViewById(R.id.spinner2);
        sp1.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.temperatureform), "Celsius"));
        sp2.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.temperatureform), "Fahrenheit"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void convert(View view){


        if (!input.getText().toString().equals("")){

            ufrom = (String) sp1.getSelectedItem();
            uto = (String) sp2.getSelectedItem();
            Double ip = Double.valueOf(input.getText().toString());
            TemperatureConverter.Units fromUnit = TemperatureConverter.Units.fromString(ufrom);
            TemperatureConverter.Units toUnit = TemperatureConverter.Units.fromString(uto);
            double r = con.TemperatureConvert(fromUnit,toUnit,ip);
            result.setText(String.valueOf(r));

        }
        else {
            result.setText("");
        }

    }
}

