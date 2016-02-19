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
import com.sun.suni.converter.converter.MagnetConverter;

public class Magnet extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner msp,msp1;
    EditText min,mou;
    Button mbu;
    String mfrom,mto;
    MagnetConverter mcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magnet);
        min = (EditText) findViewById(R.id.med);
        mou = (EditText) findViewById(R.id.med1);
        mbu =(Button) findViewById(R.id.button11);
        mcon = new MagnetConverter();

        msp = (Spinner) findViewById(R.id.mspinner);
        msp1 = (Spinner) findViewById(R.id.mspinner2);
        msp.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.magnetform), "GaussSquareCentimeter"));
        msp1.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.magnetform), "KiloLine"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void magn(View view)
    {
        if (!min.getText().toString().equals(""))
        {
            mfrom = (String) msp.getSelectedItem();
            mto = (String) msp1.getSelectedItem();
            Double mip = Double.valueOf(min.getText().toString());
            MagnetConverter.Magg fromMagg = MagnetConverter.Magg.fromString(mfrom);
            MagnetConverter.Magg toMagg = MagnetConverter.Magg.fromString(mto);
            Double mop = mcon.MagnetConvert(fromMagg,toMagg,mip);
            mou.setText(String.valueOf(mop));
        }
        else {
            mou.setText("");
        }
    }
}
