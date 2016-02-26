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
import com.sun.suni.converter.converter.LengthConverter;

public class Length extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spa,spb;
    EditText input,result;
    String lfrom,lto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);
        input = (EditText) findViewById(R.id.led);
        result = (EditText) findViewById(R.id.led1);

        spa = (Spinner) findViewById(R.id.lsp1);
        spb = (Spinner) findViewById(R.id.lsp2);
        spa.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.lengthform), "Kilometers"));
        spb.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.lengthform), "Miles"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (!input.getText().toString().equals("")){
                    lfrom = (String) spa.getSelectedItem();
                    lto = (String) spb.getSelectedItem();
                    double in = Double.valueOf(input.getText().toString());
                    LengthConverter.Leng fromLeng = LengthConverter.Leng.fromString(lfrom);
                    LengthConverter.Leng toLeng = LengthConverter.Leng.fromString(lto);

                    LengthConverter lengthConverter = new LengthConverter(fromLeng,toLeng);
                    double rr = lengthConverter.convert(in);
                    result.setText(String.valueOf(rr));
                }
                else {
                    result.setText("");
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
