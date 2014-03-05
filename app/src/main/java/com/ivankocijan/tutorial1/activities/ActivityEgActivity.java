package com.ivankocijan.tutorial1.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.ivankocijan.tutorial1.R;

/**
 * Created by ivankocijan on 05.03.2014..
 */
public class ActivityEgActivity extends Activity {

    private static final String TAG = "example";

    private ImageView jopa;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eg);

        jopa = (ImageView) findViewById(R.id.jopa_ends_misery);

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate");

        jopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                finish();
            }
        });

    }

    @Override
    protected void onStart () {
        super.onStart();


        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume () {
        super.onResume();


        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause () {
        super.onPause();


        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop () {
        super.onStop();

        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop");

    }


    @Override
    protected void onDestroy () {
        super.onDestroy();

        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onBackPressed () {
        Toast.makeText(this, "Only Jopa can end this misery", Toast.LENGTH_SHORT).show();
    }
}
