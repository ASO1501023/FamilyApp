package jp.ac.asojuku.st.familyapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/*
 * Created by fukudomeryuga on 2016/10/07.
 */
public class UranaiAdapter extends  RecyclerView.Adapter<UranaiViewHolder>{

    private ArrayList<MyData>UranaiDataSet;
    private Activity activity;

    public  UranaiAdapter(ArrayList<MyData> uranai, Activity activity){
        this.UranaiDataSet = uranai;
        this.activity = activity;

    }

    @Override
    public UranaiViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout,parent,false);
        return new UranaiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final UranaiViewHolder holder,final int listPosition){

        holder.textViewNumber.setText(UranaiDataSet.get(listPosition).getUranai());
        holder.base.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext(),"コメント"+
                        UranaiDataSet.get(listPosition).getComent(),Toast.LENGTH_SHORT).show();
            }

        });
        holder.base.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                Uri uri = Uri.parse("mailto:");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra(Intent.EXTRA_SUBJECT, "占い結果");
                intent.putExtra(Intent.EXTRA_TEXT, "占いの結果、今日は" + UranaiDataSet.get(listPosition).getComent() + "で、" + UranaiDataSet.get(listPosition).getUranai() + "です！");
                activity.startActivity(intent);
                return true;
            }
        });
    }
    @Override
    public int getItemCount(){
        return UranaiDataSet.size();
    }
}