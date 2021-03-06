package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    MediaPlayer mp;

    ArrayList<Word> words;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        words =  new ArrayList<>();

        words.add(new Word("lutti", "one", R.drawable.number_one,R.raw.number_one));
        words.add(new Word("otiiko", "two", R.drawable.number_two,R.raw.number_two));
        words.add(new Word("tolookosu", "three", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("oyyisa", "four", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("massokka", "five", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("temmokka", "six", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("kenekaku", "seven", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("kawinta", "eight", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("wo’e", "nine", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("na’aacha", "ten", R.drawable.number_ten, R.raw.number_ten));





       WordAdapter word= new WordAdapter(this, words, R.color.category_numbers);

        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(word);
        lv.setOnItemClickListener(this);




}

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        for (int j = 0; j <words.size() ; j++) {
            mp = MediaPlayer.create(NumbersActivity.this, words.get(i).getmSoundResourceId());
            mp.start();
        }
        mp.release();
    }
}
