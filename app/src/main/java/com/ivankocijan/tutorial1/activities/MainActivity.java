package com.ivankocijan.tutorial1.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.ivankocijan.tutorial1.R;

public class MainActivity extends ActionBarActivity {

    private static final String JOPA_URL = "http://natjecanje.tvz.hr/";

    private Button relativeLayoutEx;
    private Button linearLayoutEx;
    private Button textViewEx;
    private Button imageViewEx;
    private Button editTextEx;
    private Button activityExample;
    private ImageView jopa;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayoutEx = (Button) findViewById(R.id.button_relative_layout_ex);
        linearLayoutEx = (Button) findViewById(R.id.button_liner_layout_ex);
        textViewEx = (Button) findViewById(R.id.button_text_view_ex);
        imageViewEx = (Button) findViewById(R.id.button_image_view_ex);
        editTextEx = (Button) findViewById(R.id.button_edit_text_ex);
        activityExample = (Button) findViewById(R.id.button_activity_ex);
        jopa = (ImageView) findViewById(R.id.image_jopa);

        relativeLayoutEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity(new Intent(MainActivity.this, RelativeLayoutEgActivity.class));
            }
        });

        editTextEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                startActivity(new Intent(MainActivity.this, EditTextEgActivity.class));

            }
        });

        linearLayoutEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity(new Intent(MainActivity.this, LinearLayoutEgActivity.class));
            }
        });

        imageViewEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity(new Intent(MainActivity.this, ImageViewEgActivity.class));
            }
        });

        activityExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity(new Intent(MainActivity.this, ActivityEgActivity.class));
            }
        });

        textViewEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity(new Intent(MainActivity.this, TextViewEgActivity.class));
            }
        });

        jopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(JOPA_URL));
                startActivity(intent);

            }
        });

    }

}
