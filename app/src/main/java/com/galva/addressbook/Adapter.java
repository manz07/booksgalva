package com.galva.addressbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{

    private List<Books> books;
    private Context context;

    public Adapter(List<Books> books, Context context) {
        this.books = books;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.firstname.setText(books.get(position).getName());
        holder.work.setText(books.get(position).getWork());
        holder.email.setText(books.get(position).getEmail());
    }

    @Override
    public int getItemCount()
    {
        return books.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView firstname, work, email;


        public MyViewHolder(View itemView) {
            super(itemView);
            firstname = itemView.findViewById(R.id.firstname);
            work = itemView.findViewById(R.id.work);
            email = itemView.findViewById(R.id.email);
        }
    }
}
