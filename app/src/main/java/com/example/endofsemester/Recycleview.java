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
        public void onBindViewHolder(@NonNull ViewHoledr viewHoledr, int i) {
           viewHoledr.price.setText(""+SearchByfilters.resaultUlaml.get(i).getPrice());
            viewHoledr.muzmanim.setText(""+SearchByfilters.resaultUlaml.get(i).getMuzmanim());
            viewHoledr.type.setText(""+SearchByfilters.resaultUlaml.get(i).getType());
            viewHoledr.image.setImageResource(SearchByfilters.resaultUlaml.get(i).getImage());
            viewHoledr.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context,UlamDetails.class));
                }
            });
         //   viewHoledr.city.setText(SearchByfilters.ulamArrayList.get(i).getCity());
        }



        @Override
        public int getItemCount() {
            return SearchByfilters.resaultUlaml.size();
        }

        public  class ViewHoledr extends RecyclerView.ViewHolder {

             TextView price;
            TextView muzmanim;
            TextView type;
           // public TextView city;
              ImageView image;
              CardView cardView;



            public ViewHoledr(@NonNull View itemView) {
                super(itemView);
                price=itemView.findViewById(R.id.textView_price);
                muzmanim=itemView.findViewById(R.id.textView_muzmanim);
               type=itemView.findViewById(R.id.textView_type);
                image=itemView.findViewById(R.id.image);
                cardView=itemView.findViewById(R.id.cardView);
               // city=itemView.findViewById(R.id.textView16);
               // city=itemView.findViewById(R.id.image);
            }
        }


}
