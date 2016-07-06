package com.raychenon.licensedroid.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.raychenon.licensedroid.OpenSourceDialogFragment;

import java.util.ArrayList;

/**
 * @author Raymond Chenon
 */
public class StartActivity extends AppCompatActivity {

    Button activityBtn;
    Button dialogBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        activityBtn = (Button) findViewById(R.id.activity_button);
        dialogBtn = (Button) findViewById(R.id.dialog_button);

        activityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirect();
            }
        });

        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    private void redirect(){
        startActivity(new Intent(this,OpenSourceActivity.class));
    }

    private void showDialog() {
        OpenSourceDialogFragment dialog = OpenSourceDialogFragment.newInstance(new ArrayList<>(OpenSourceData.getLicenseData()));
        dialog.show(getSupportFragmentManager(), "dialog");
    }


}
