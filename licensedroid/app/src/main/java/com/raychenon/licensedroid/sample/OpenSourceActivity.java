package com.raychenon.licensedroid.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.raychenon.licensedroid.SimpleDividerItemDecoration;
import com.raychenon.licensedroid.sample.R;

import com.raychenon.licensedroid.OpenSourceAdapter;

/**
 * Created by Raymond Chenon
 */
public class OpenSourceActivity extends Activity {


    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opensource_activity);

        recyclerView = (RecyclerView) findViewById(R.id.licenseRecyclerView);

        initRecyclerView();

    }

    private void initRecyclerView(){
        OpenSourceAdapter adapter = new OpenSourceAdapter(OpenSourceData.getLicenseData());

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(llm);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(this)); // for the line divider
        recyclerView.setAdapter(adapter);
    }


}
