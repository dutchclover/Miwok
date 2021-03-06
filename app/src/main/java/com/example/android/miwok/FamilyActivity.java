package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    MediaPlayer mp;

    ArrayList<Word> words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        words =  new ArrayList<>();

        words.add(new Word("әpә", "father", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("әṭa", "mother", R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("angsi", "son", R.drawable.family_son,R.raw.family_son));
        words.add(new Word("tune", "daughter", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word("taachi", "older brother", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("chalitti", "younger brother", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word("teṭe", "older sister", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word("kolliti", "younger sister", R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("ama", "grandmother", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word("paapa", "grandfather", R.drawable.family_grandfather, R.raw.family_grandfather));





        WordAdapter word= new WordAdapter(this, words, R.color.category_family);

        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(word);
        lv.setOnItemClickListener(this);




    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        for (int j = 0; j <words.size() ; j++) {
            mp = MediaPlayer.create(FamilyActivity.this, words.get(i).getmSoundResourceId());
            mp.start();
        }
            mp.release();
        }

    }