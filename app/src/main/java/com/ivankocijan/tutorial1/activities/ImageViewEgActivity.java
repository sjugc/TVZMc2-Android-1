package com.ivankocijan.tutorial1.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

import com.ivankocijan.tutorial1.R;

public class ImageViewEgActivity extends ActionBarActivity {

    private ImageView image;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_eg);

        image = (ImageView) findViewById(R.id.eg_launcher_icon);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                image.setBackgroundResource(R.drawable.jopac);

            }
        });


    }

}
