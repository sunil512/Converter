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
import com.sun.suni.converter.converter.ImageConverter;

public class Image extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner isp,isp1;
    EditText inp,iop;
    Button ibu;
    String ifrom,ito;
    ImageConverter iconn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);

        inp = (EditText) findViewById(R.id.med);
        iop = (EditText) findViewById(R.id.med1);
        ibu =(Button) findViewById(R.id.button11);
        iconn = new ImageConverter();

        isp = (Spinner) findViewById(R.id.mspinner);
        isp1 = (Spinner) findViewById(R.id.mspinner2);
        isp.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.imageform), "twip"));
        isp1.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.imageform), "meter"));

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
        if (!inp.getText().toString().equals(""))
        {
            ifrom = (String) isp.getSelectedItem();
            ito = (String) isp1.getSelectedItem();
            Double iin = Double.valueOf(inp.getText().toString());
            ImageConverter.Img fromImg = ImageConverter.Img.fromString(ifrom);
            ImageConverter.Img toImg = ImageConverter.Img.fromString(ito);
            Double ipo = iconn.ImageConvert(fromImg,toImg,iin);
            iop.setText(String.valueOf(ipo));
        }
        else {
            iop.setText("");
        }
    }
}
