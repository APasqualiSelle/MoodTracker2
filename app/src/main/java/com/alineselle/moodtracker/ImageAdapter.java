package com.alineselle.moodtracker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {


    private Context mContext;
    private int[] mImageIds = new int []{R.drawable.smiley_super_happy,R.drawable.smiley_happy,R.drawable.smiley_normal
    ,R.drawable.smiley_disappointed,R.drawable.smiley_sad};
    private int [] mBackgroundColorsIds = new int[] {R.color.banana_yellow,R.color.light_sage,R.color.cornflower_blue_65,
    R.color.warm_grey,R.color.faded_red};

    //Creating the constructor using the Type Context: this is used for passing as a parameter a context, i.e. an Activity
    ImageAdapter(Context context) {

        mContext = context;
    }

    //getCount corresponds to the length of the image's array
    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view== o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(mImageIds[position]);
        //mContext is used below because getResources is a fonction that it is used only by an Activity
        //ImageAdapter is not an Activity, so I have to use mContext
        imageView.setBackgroundColor(mContext.getResources().getColor(mBackgroundColorsIds[position]));
        container.addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
