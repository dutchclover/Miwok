package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mSoundResourceId;

    public Word(String MiwokTranslation, String DefaultTranslation, int ImageResourceId, int SoundResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mSoundResourceId = SoundResourceId;
    }

    public Word(String MiwokTranslation, String DefaultTranslation, int SoundResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mSoundResourceId = SoundResourceId;


    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public  int getmImageResourceId(){return mImageResourceId;}

    public int getmSoundResourceId (){return mSoundResourceId;}


}
