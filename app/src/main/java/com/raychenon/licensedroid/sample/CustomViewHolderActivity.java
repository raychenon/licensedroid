package com.raychenon.licensedroid.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.raychenon.licensedroid.adapter.OpenSourceAdapter;
import com.raychenon.licensedroid.ui.SimpleDividerItemDecoration;
import com.raychenon.licensedroid.sample.viewholder.CustomViewHolder;

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

        OpenSourceAdapter adapter = new OpenSourceAdapter(OpenSourceData.getLicenseData(), new CustomViewHolder.Factory());
        recyclerView.setAdapter(adapter);
    }
}
