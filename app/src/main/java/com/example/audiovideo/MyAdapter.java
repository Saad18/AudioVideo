package com.example.audiovideo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
   public int contact ;

    public MyAdapter(int contact) {
        this.contact = contact;
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder{
        public TextView txtName;
        public TextView txtNumber;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );
            txtName = itemView.findViewById( R.id.txtName );
            txtNumber = itemView.findViewById( R.id.txtNumber );
        }
    }


    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from( context );
        View v = inflater.inflate( R.layout.row,parent,false);
        MyViewHolder vh = new MyViewHolder( v );
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.txtName.setText("Engineer Saad");
        holder.txtNumber.setText( "01781520001" );

    }

    @Override
    public int getItemCount() {
        return contact;
    }


}
