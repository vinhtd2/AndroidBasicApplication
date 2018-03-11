package com.example.jake.androidbasic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jake on 10/03/2018.
 */

public class CustomAdapter extends ArrayAdapter<UserAccount> {
    private ArrayList<UserAccount> dataSet;
    Context mContext;


    private static class ViewHolder {
        TextView txtName;
        TextView txtJob;
        ImageView img;
    }

    public CustomAdapter(ArrayList<UserAccount> data, Context context) {
        super(context, R.layout.list_view_item, data);
        this.dataSet = data;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        UserAccount userAccount = getItem(position);
        ViewHolder viewHolder;
        final View result;
        if(convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.list_view_item, parent, false);
            viewHolder.txtName = convertView.findViewById(R.id.text_1);
            viewHolder.txtJob = convertView.findViewById(R.id.job_1);
            viewHolder.img = convertView.findViewById(R.id.image_1);
            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.txtName.setText(userAccount.getUserName());
        viewHolder.txtJob.setText(userAccount.getUserJob());

        return convertView;
    }
}
