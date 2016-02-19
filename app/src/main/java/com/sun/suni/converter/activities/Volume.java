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
import com.sun.suni.converter.converter.VolumeConverter;

public class Volume extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner as,ass;
    EditText giv,tak;
    Button bee;
    String vfro,vto;
    VolumeConverter vvon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume);
        giv = (EditText) findViewById(R.id.ved);
        tak = (EditText) findViewById(R.id.ved1);
        bee =(Button) findViewById(R.id.button6);
        vvon = new VolumeConverter();

        as = (Spinner) findViewById(R.id.vspinner);
        ass = (Spinner) findViewById(R.id.vspinner2);
        as.setAdapter(new CustomSpinnerAdapter(this,R.layout.spinner_item, getResources().getStringArray(R.array.volumeform), "Liters"));
        ass.setAdapter(new CustomSpinnerAdapter(this,R.layout.spinner_item, getResources().getStringArray(R.array.volumeform), "Centiliters"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void Voll(View view)
    {
        if (!giv.getText().toString().equals(""))
        {
            vfro = (String) as.getSelectedItem();
            vto = (String) ass.getSelectedItem();
            Double yip = Double.valueOf(giv.getText().toString());
            VolumeConverter.Vol fromVol = VolumeConverter.Vol.fromString(vfro);
            VolumeConverter.Vol toVol = VolumeConverter.Vol.fromString(vto);
            Double yop = vvon.VolConvert(fromVol,toVol,yip);
            tak.setText(String.valueOf(yop));
        }
        else {
            tak.setText("");
        }
    }
}
