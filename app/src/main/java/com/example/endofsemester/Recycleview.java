package com.example.endofsemester;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.endofsemester.SearchByfilters.resaultUlaml;


public class Recycleview extends android.support.v7.widget.RecyclerView.Adapter<Recycleview.ViewHoledr>
    {


        private Context context;

        public Recycleview(Context context)
        {
            this.context=context;
        }
        @NonNull
        @Override
        public ViewHoledr onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler,viewGroup,false);

            return new ViewHoledr(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHoledr viewHoledr, final int i) {
           viewHoledr.price.setText("מחיר :"+ resaultUlaml.get(i).getPrice());
            viewHoledr.muzmanim.setText("מוזמנים :"+ resaultUlaml.get(i).getMuzmanim());
            viewHoledr.image.setImageResource(resaultUlaml.get(i).getImage());
            viewHoledr.city.setText("עיר :"+ resaultUlaml.get(i).getCity());
            viewHoledr.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,UlamDetails.class);
                    intent.putExtra("index",i);
                    context.startActivity(intent);
                }
            });
         //   viewHoledr.city.setText(SearchByfilters.ulamArrayList.get(i).getCity());
        }





        @Override
        public int getItemCount() {
            return resaultUlaml.size();
        }

        public  class ViewHoledr extends RecyclerView.ViewHolder {

             TextView price;
            TextView muzmanim;
            TextView city;
              ImageView image;
              CardView cardView;



            public ViewHoledr(@NonNull View itemView) {
                super(itemView);
                price=itemView.findViewById(R.id.textView_price);
                muzmanim=itemView.findViewById(R.id.textView_muzmanim);
                city=itemView.findViewById(R.id.textView_city);
                image=itemView.findViewById(R.id.image_logo);
                cardView=itemView.findViewById(R.id.cardView);
               // city=itemView.findViewById(R.id.textView16);
               // city=itemView.findViewById(R.id.image);
            }
        }


}
