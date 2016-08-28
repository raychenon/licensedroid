package com.raychenon.licensedroid.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.raychenon.licensedroid.OpenSourceAdapter;
import com.raychenon.licensedroid.OpenSourceCustomAdapter;
import com.raychenon.licensedroid.SimpleDividerItemDecoration;
import com.raychenon.licensedroid.sample.adapter.CustomViewHolder;

/**
 * @author Raymond Chenon
 */
public class CustomViewHolderActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opensource_activity);

        recyclerView = (RecyclerView) findViewById(R.id.licenseRecyclerView);

        initRecyclerView();
    }

    private void initRecyclerView(){

        OpenSourceCustomAdapter adapter = new OpenSourceCustomAdapter(OpenSourceData.getLicenseData(), CustomViewHolder.class);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(llm);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(this)); // for the line divider
        recyclerView.setAdapter(adapter);
    }
}