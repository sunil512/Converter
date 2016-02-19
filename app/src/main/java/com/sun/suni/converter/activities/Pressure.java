package com.sun.suni.converter.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.sun.suni.converter.R;
import com.sun.suni.converter.adapters.CustomSpinnerAdapter;
import com.sun.suni.converter.converter.PressureConverter;

public class Pressure extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner psa,psb;
    EditText pe,pee;
    Button pbu;
    String pfrom,pto;
    PressureConverter pcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pressure);
        pe = (EditText) findViewById(R.id.ped);
        pee = (EditText) findViewById(R.id.ped1);
        pbu =(Button) findViewById(R.id.button8);
        pcon = new PressureConverter();

        psa = (Spinner) findViewById(R.id.pspinner);
        psb = (Spinner) findViewById(R.id.pspinner2);
        psa.setAdapter(new CustomSpinnerAdapter(this,R.layout.spinner_item, getResources().getStringArray(R.array.pressureform), "atmosphere"));
        psb.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.pressureform), "bar"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public  void pres(View view)
    {
        if (!pe.getText().toString().equals(""))
        {
            pfrom = (String) psa.getSelectedItem();
            pto = (String) psb.getSelectedItem();
            Double pip = Double.valueOf(pe.getText().toString());
            PressureConverter.Press fromPress = PressureConverter.Press.fromString(pfrom);
            PressureConverter.Press toPress = PressureConverter.Press.fromString(pto);
            Double pop = pcon.PressureConvert(fromPress,toPress,pip);
            pee.setText(String.valueOf(pop));
        }
        else {
            pee.setText("");
        }
    }
}
