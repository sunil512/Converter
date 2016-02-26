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
import com.sun.suni.converter.converter.AreaConverter;

public class Area extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner tspa,tspb;
    EditText aip,aop;
    String afrom,ato;
    AreaConverter aCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area);
        aip =(EditText) findViewById(R.id.ed1);
        aop = (EditText) findViewById(R.id.ed2);
        aCon = new AreaConverter();

        tspa = (Spinner) findViewById(R.id.asp1);
        tspb = (Spinner) findViewById(R.id.asp2);

        tspa.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.areaform), "" + "Hectares"));
        tspb.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.areaform), "SquareMeters"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        aip.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (!aip.getText().toString().equals("")){

                    afrom = (String) tspa.getSelectedItem();
                    ato = (String) tspb.getSelectedItem();
                    Double inp = Double.valueOf(aip.getText().toString());
                    AreaConverter.Area fromArea = AreaConverter.Area.fromString(afrom);
                    AreaConverter.Area toArea = AreaConverter.Area.fromString(ato);

                    double resu = aCon.AreaConvert(fromArea,toArea,inp);
                    aop.setText(String.valueOf(resu));
                }
                else {
                    aop.setText("");
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
