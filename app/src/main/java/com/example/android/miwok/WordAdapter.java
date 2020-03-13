package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    MediaPlayer mp;


    public WordAdapter(@NonNull Context context,   ArrayList<Word> words, int colorResourceId) {
            super(context, 0, words);
            mColorResourceId = colorResourceId;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;

        if(row == null){
            row = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord =  getItem(position);

        TextView miwTrans = (TextView) row.findViewById(R.id.miwok_tv);
        miwTrans.setText(currentWord.getMiwokTranslation());
        TextView defTrans = (TextView) row.findViewById(R.id.english_tv);
        defTrans.setText(currentWord.getDefaultTranslation());
        ImageView image = (ImageView)row.findViewById(R.id.miwokImage);
        if (currentWord.getmImageResourceId()!=0){
        image.setImageResource(currentWord.getmImageResourceId());}
        else image.setVisibility(View.GONE);
        View layout = row.findViewById(R.id.layout);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        layout.setBackgroundColor(color);


        return row;

    }




}
