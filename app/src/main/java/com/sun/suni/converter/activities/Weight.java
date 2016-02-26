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
import com.sun.suni.converter.converter.WeightConverter;

public class Weight extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner wsp1,wsp2;
    EditText ip,res;
    String wfrom,wto;
    WeightConverter wcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight);

        ip = (EditText) findViewById(R.id.weditTexta);
        res = (EditText) findViewById(R.id.wedd);
        res.setClickable(false);
        wcon = new WeightConverter();

        wsp1 = (Spinner) findViewById(R.id.wspinnera);
        wsp2 = (Spinner) findViewById(R.id.wspinnerb);
        wsp1.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.weightform), "Kilograms"));
        wsp2.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.weightform), "Grams"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ip.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (!ip.getText().toString().equals("")){

                    wfrom = (String) wsp1.getSelectedItem();
                    wto = (String) wsp2.getSelectedItem();
                    double inp = Double.valueOf(ip.getText().toString());
                    WeightConverter.Inus fromInus = WeightConverter.Inus.fromString(wfrom);
                    WeightConverter.Inus toInus = WeightConverter.Inus.fromString(wto);
                    double rs = wcon.WeightConvert(fromInus,toInus,inp);
                    res.setText(String.valueOf(rs));
                }
                else {
                    res.setText("");
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
