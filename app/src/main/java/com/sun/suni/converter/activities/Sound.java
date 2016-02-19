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
import com.sun.suni.converter.converter.SoundConverter;

public class Sound extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner ssa,ssb;
    EditText sed,sad;
    Button sbu;
    String sufrom,suto;
    SoundConverter sucon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound);
        sed = (EditText) findViewById(R.id.sued);
        sad = (EditText) findViewById(R.id.sued1);
        sbu =(Button) findViewById(R.id.button9);
        sucon = new SoundConverter();

        ssa = (Spinner) findViewById(R.id.suspinner);
        ssb = (Spinner) findViewById(R.id.suspinner2);
        ssa.setAdapter(new CustomSpinnerAdapter(this,R.layout.spinner_item, getResources().getStringArray(R.array.soundform), "bel"));
        ssb.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.soundform), "decibel"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public  void sunn(View view)
    {
        if (!sed.getText().toString().equals(""))
        {
            sufrom = (String) ssa.getSelectedItem();
            suto = (String) ssb.getSelectedItem();
            Double suip = Double.valueOf(sed.getText().toString());
            SoundConverter.Sund fromSund = SoundConverter.Sund.fromString(sufrom);
            SoundConverter.Sund toSund = SoundConverter.Sund.fromString(suto);
            Double suop = sucon.SoundConvert(fromSund,toSund,suip);
            sad.setText(String.valueOf(suop));
        }
        else {
            sad.setText("");
        }
    }
}
