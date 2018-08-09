package com.sharvesh.flick.moviesflix.Videos;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.sharvesh.flick.moviesflix.R;

import java.util.List;


public class VideoAdapter extends ArrayAdapter<Video> {

    public VideoAdapter(@NonNull Context context, @NonNull List<Video> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listitemView = convertView;
        if(listitemView == null){
            listitemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout,parent,false
            );

        }

        Video currentVideo = getItem(position);

        TextView dateView = listitemView.findViewById(R.id.v_name);
        dateView.setText(currentVideo.getmVideoName());

        return listitemView;
    }

}
