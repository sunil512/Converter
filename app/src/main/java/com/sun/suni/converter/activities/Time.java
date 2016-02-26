package com.sun.suni.converter.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

import com.sun.suni.converter.adapters.CustomSpinnerAdapter;
import com.sun.suni.converter.R;
import com.sun.suni.converter.converter.TimeConverter;

public class Time extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spc,spd;
    EditText tip,top;
    String tfrom,tto;
    TimeConverter tcom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);
        tip = (EditText) findViewById(R.id.ted);
        top = (EditText) findViewById(R.id.ted1);
        top.setClickable(false);
        tcom = new TimeConverter();

        spc = (Spinner) findViewById(R.id.tsp);
        spd = (Spinner) findViewById(R.id.tsp2);
        spc.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.timeform), "Seconds"));
        spd.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.timeform), "Minutes"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tip.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (!tip.getText().toString().equals("")){

                    tfrom = (String) spc.getSelectedItem();
                    tto = (String) spd.getSelectedItem();
                    Double ipt = Double.valueOf(tip.getText().toString());
                    TimeConverter.Time fromTime = TimeConverter.Time.fromString(tfrom);
                    TimeConverter.Time toTime = TimeConverter.Time.fromString(tto);
                    double rp = tcom.TimeConv(fromTime,toTime,ipt);
                    top.setText(String.valueOf(rp));

                }
                else {
                    top.setText("");
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
