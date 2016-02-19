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
import com.sun.suni.converter.converter.StorageConverter;

public class Storage extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner san,sam;
    EditText ra,ban;
    Button ed;
    StorageConverter scon;
    String sfrom,sto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storage);
        ra = (EditText) findViewById(R.id.sted);
        ban = (EditText) findViewById(R.id.sted1);
        ed =(Button) findViewById(R.id.button7);
        scon = new StorageConverter();

        san = (Spinner) findViewById(R.id.stspinner);
        sam = (Spinner) findViewById(R.id.stspinner2);
        san.setAdapter(new CustomSpinnerAdapter(this,R.layout.spinner_item, getResources().getStringArray(R.array.storageform), "bit"));
        sam.setAdapter(new CustomSpinnerAdapter(this,R.layout.spinner_item, getResources().getStringArray(R.array.storageform), "byte"));

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void stor(View view)
    {
        if (!ra.getText().toString().equals(""))
        {
            sfrom = (String) san.getSelectedItem();
            sto = (String) sam.getSelectedItem();
            Double sip = Double.valueOf(ra.getText().toString());
            StorageConverter.Store fromStore = StorageConverter.Store.fromString(sfrom);
            StorageConverter.Store toStore = StorageConverter.Store.fromString(sto);
            Double sop = scon.StorageCon(fromStore,toStore,sip);
            ban.setText(String.valueOf(sop));
        }
        else {
            ban.setText("");
        }
    }
}
