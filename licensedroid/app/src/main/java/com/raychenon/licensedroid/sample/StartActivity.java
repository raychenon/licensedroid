package com.raychenon.licensedroid.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.raychenon.licensedroid.OpenSourceAdapter;
import com.raychenon.licensedroid.SimpleDividerItemDecoration;

/**
 * @author Raymond Chenon
 */
public class StartActivity extends Activity {

    Button activityBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        activityBtn = (Button) findViewById(R.id.activity_button);

        activityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirect();
            }
        });
    }

    private void redirect(){
        startActivity(new Intent(this,OpenSourceActivity.class));
    }


}
