package com.example.endofsemester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UlamDetails extends AppCompatActivity {


    private TextView price;
    private TextView muzmanim;
    private String city;
    private  int image;
    private int type;
    private Ulam ulam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulam_details);
        int index= (int) this.getIntent().getExtras().get("index");
        ulam=SearchByfilters.resaultUlaml.get(index);

        price=findViewById(R.id.textView_price);
        price.setText(""+ulam.getPrice());

        muzmanim=findViewById(R.id.textView_muzmanim);
        muzmanim.setText(""+ulam.getMuzmanim());
    }


}
