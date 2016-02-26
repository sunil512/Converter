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
import com.sun.suni.converter.converter.ImageConverter;

public class Image extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner isp,isp1;
    EditText inp,iop;
    String ifrom,ito;
    ImageConverter iconn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);

        inp = (EditText) findViewById(R.id.ied);
        iop = (EditText) findViewById(R.id.ied1);
        iconn = new ImageConverter();

        isp = (Spinner) findViewById(R.id.ispinner);
        isp1 = (Spinner) findViewById(R.id.ispinner2);
        isp.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.imageform), "twip"));
        isp1.setAdapter(new CustomSpinnerAdapter(this, R.layout.spinner_item, getResources().getStringArray(R.array.imageform), "meter"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        inp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

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
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
