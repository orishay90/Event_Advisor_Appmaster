package com.example.endofsemester;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainPage extends AppCompatActivity {
    private ImageView showImageMeniu;
    private ImageButton filters;
    private ImageButton gps;
    private Intent goTonextPage;
    private ArrayList<Drawable> images;
    private ImageView pizzaImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        setTheImageView();
        setImageButtens();
        klickFiltersBuutten();
        klickGpsBuutten();
        addArrayListImages();
        setTheImageThread();


    }
    private void nextGoToPage(Class classType) {
        goTonextPage =new Intent(this,classType);
        startActivity(goTonextPage);
    }



    public void setTheImageView() {
        showImageMeniu =findViewById(R.id.logo_id_main_meniu);
        showImageMeniu.setImageDrawable(getDrawable(R.drawable.eventadvisor_logo_footer));
    }
public void setImageButtens(){
        filters = findViewById(R.id.filters_butten);
        gps=findViewById(R.id.gps_butten);

}



    public void klickFiltersBuutten() {
        filters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextGoToPage(SearchByfilters.class);

            }
        });
    }
    public void klickGpsBuutten() {
        gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextGoToPage(MapsActivity.class);

            }
        });
    }


    private void setTheImageThread() {
        final Animation in  = AnimationUtils.loadAnimation(this, R.anim.anima);


        pizzaImage=findViewById(R.id.pizza_image);
        pizzaImage.setAnimation(in);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                {

                    for (int i = 0; i <images.size() ; i++) {
                        try {
                            try {
                                Thread.sleep(3200);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            final int finalI = i;
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    pizzaImage.setImageDrawable(images.get(finalI));

                                }
                            });
                            Thread.sleep(160);



                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    pizzaImage.startAnimation(in);
                                }
                            });
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }).start();



    }
    private void addArrayListImages() {
        images=new ArrayList<>();
        images.add(getDrawable(R.drawable.adia));
        images.add(getDrawable(R.drawable.ulam1));
        images.add(getDrawable(R.drawable.aatsula));
        images.add(getDrawable(R.drawable.ulam5));
        images.add(getDrawable(R.drawable.oforia));
        images.add(getDrawable(R.drawable.ulam3));
        images.add(getDrawable(R.drawable.nnn1));
        images.add(getDrawable(R.drawable.ulam4));
       images.add(getDrawable(R.drawable.doria_ulam));
        // );


    }
}
