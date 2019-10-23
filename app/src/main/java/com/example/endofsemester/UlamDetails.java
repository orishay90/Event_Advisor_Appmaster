package com.example.endofsemester;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UlamDetails extends AppCompatActivity {


    private TextView price;
    private TextView muzmanim;
    private TextView city;
    private TextView link;
    private ImageView image;
    private ImageView imageView;
    private Ulam ulam;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulam_details);
        int index= (int) this.getIntent().getExtras().get("index");
        ulam=SearchByfilters.resaultUlaml.get(index);

        price=findViewById(R.id.textView_price);
        price.setText("מחיר :"+ulam.getPrice());

        muzmanim=findViewById(R.id.textView_muzmanim);
        muzmanim.setText("מוזמנים :"+ulam.getMuzmanim());

        city=findViewById(R.id.textView_city);
        city.setText("עיר :"+ulam.getCity());

        link=findViewById(R.id.textViewLink);
        link.setText("דף הבית :"+ulam.getLink());

        image=findViewById(R.id.image_logo);
        image.setImageResource(Integer.parseInt(""+ulam.getImage()));

    }
}
