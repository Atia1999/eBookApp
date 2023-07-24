package com.example.eshoboiporiapp;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.viewholder> {
    Context context;
    ArrayList<subjectModel> list ;




    public SubjectAdapter(Context context,ArrayList<subjectModel> list) {
        this.context = context;
        this.list = list;
    }



    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.item_subject,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        subjectModel model=list.get(position);
        holder.subjectName.setText(model.getSubjectname());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,PdfActivity.class);
                intent.putExtra("name",model.getSubjectname());
                intent.putExtra("position",position);
                context.startActivity(intent);
            }
        });

    }



    @Override
    public int getItemCount() {
        int size = list.size();
        return size;
    }

    public class viewHolder {
    }
    public class viewholder extends RecyclerView.ViewHolder {
        TextView subjectName;
        public viewholder(@NonNull View itemView) {

            super(itemView);
            subjectName=itemView.findViewById(R.id.chapName);
        }
    }
}
