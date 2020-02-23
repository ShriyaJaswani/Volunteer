package com.gdg.volunteer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VolunteerAdapter extends RecyclerView.Adapter<VolunteerAdapter.VolunteerViewHolder> {

    ArrayList<VolunteerList> gdgVolunteerList;
    Context context;
    public VolunteerAdapter(Context context,ArrayList<VolunteerList>volunteer){
        gdgVolunteerList = volunteer;
        VolunteerList g =
                new VolunteerList("riyajaswani1991@gmail.com","Shriya",19,"Oriental College of tech","2nd","6263095195","Female","Writing,Programmig","Python,React","App Development,Data Science");
        volunteer.add(g);
    }

    class VolunteerViewHolder extends RecyclerView.ViewHolder{

        TextView email,name,age,college,yostudy,number,gender,expertise,technologies,specialisations;

        public VolunteerViewHolder(View itemView){
            super(itemView);
            email = (TextView)itemView.findViewById(R.id.emailTV);
            name = (TextView)itemView.findViewById(R.id.nameTV);
            age=(TextView)itemView.findViewById(R.id.ageTV);
            college= (TextView)itemView.findViewById(R.id.collegeTV);
            yostudy=(TextView)itemView.findViewById(R.id.yostudyTV);
            number = (TextView)itemView.findViewById(R.id.numberTV);
            gender = (TextView)itemView.findViewById(R.id.genderTV);
            expertise = (TextView)itemView.findViewById(R.id.expertiseTV);
            technologies = (TextView)itemView.findViewById(R.id.technologiesTV);
            specialisations = (TextView)itemView.findViewById(R.id.specialisationsTV);

        }
    }

    @NonNull
    @Override
    public VolunteerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent, false);

        return new VolunteerViewHolder(itemView);
    }

    @Override

    public void onBindViewHolder(VolunteerViewHolder holder, int position) {
        VolunteerList gf = gdgVolunteerList.get(position);
        if(gf!=null) {
            holder.email.setText(gf.email );
            holder.name.setText(gf.name );
            holder.age.setText(gf.age+"");
            holder.college.setText(gf.college);
            holder.yostudy.setText(gf.yostudy);
            holder.number.setText(gf.number );
            holder.gender.setText(gf.Gender );
            holder.expertise.setText(gf.expertise );
            holder.specialisations.setText(gf.specialisations );
            holder.technologies.setText(gf.technologies);


        }

    }

    @Override
    public int getItemCount() {
        return gdgVolunteerList.size();
    }
}
