package com.ivankocijan.tutorial1.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ivankocijan.tutorial1.R;

public class EditTextEgActivity extends ActionBarActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_eg);

        editText = (EditText) findViewById(R.id.eg_edit_text);
        button = (Button) findViewById(R.id.eg_button_get_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                if (editText.getText() != null) {

                    String text = editText.getText().toString();

                    Toast.makeText(EditTextEgActivity.this, text, Toast.LENGTH_SHORT).show();

                }

            }
        });

    }

}
