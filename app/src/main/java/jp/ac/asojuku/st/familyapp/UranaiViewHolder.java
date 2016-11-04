package jp.ac.asojuku.st.familyapp;

/**
 * Created by fukudomeryuga on 2016/10/07.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import jp.ac.asojuku.st.familyapp.R;


public class UranaiViewHolder extends RecyclerView.ViewHolder {

    View base;
    TextView textViewNumber;
    TextView textViewComment;

    public UranaiViewHolder(View v){
        super(v);
        this.base = v;
        this.textViewNumber = (TextView) v.findViewById(R.id.number);
        this.textViewComment = (TextView) v.findViewById(R.id.comment);
    }
}
