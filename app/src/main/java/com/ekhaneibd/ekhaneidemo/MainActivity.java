package com.ekhaneibd.ekhaneidemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {
    private Context mContext;
    public String imageArray[];
    private ImageAdapter mImageAdapter;
    private GridView grid_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        initUI();
    }

    private void initUI() {
        imageArray = mContext.getResources().getStringArray(R.array.image_array);
        grid_view=(GridView)findViewById(R.id.grid_view);
        mImageAdapter= new ImageAdapter(this, imageArray);
        grid_view.setAdapter(mImageAdapter);
        grid_view.deferNotifyDataSetChanged();

    }


}
