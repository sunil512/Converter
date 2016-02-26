package com.sun.suni.converter.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

import com.sun.suni.converter.R;
import com.sun.suni.converter.adapters.CustomSpinnerAdapter;
import com.sun.suni.converter.converter.EnergyConverter;

public class Energy extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner esp,esp1;
    EditText ea,eb;
    String efrom,eto;
    EnergyConverter econ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.energy);
        ea = (EditText) findViewById(R.id.eed);
        eb = (EditText) findViewById(R.id.eed1);
        econ = new EnergyConverter();

        esp = (Spinner) findViewById(R.id.espinner);
        esp1 = (Spinner) findViewById(R.id.espinner2);
        esp.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.energyform), "BritishThermalUnit"));
        esp1.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.energyform), "calories"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ea.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (!ea.getText().toString().equals(""))
                {
                    efrom = (String) esp.getSelectedItem();
                    eto = (String) esp1.getSelectedItem();
                    Double eip = Double.valueOf(ea.getText().toString());
                    EnergyConverter.Ene fromEne = EnergyConverter.Ene.fromString(efrom);
                    EnergyConverter.Ene toEne = EnergyConverter.Ene.fromString(eto);
                    Double eop = econ.EnergyConvert(fromEne,toEne,eip);
                    eb.setText(String.valueOf(eop));
                }
                else {
                    eb.setText("");
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
