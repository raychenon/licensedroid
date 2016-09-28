package com.raychenon.licensedroid.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.raychenon.licensedroid.adapter.OpenSourceAdapter;
import com.raychenon.licensedroid.adapter.viewholder.OpenSourceExpandableViewHolder;
import com.raychenon.licensedroid.adapter.viewholder.OpenSourceViewHolder;

/**
 * @author Raymond Chenon
 */

public class ExpandableViewHolderActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opensource_activity);

        recyclerView = (RecyclerView) findViewById(R.id.licenseRecyclerView);

        initRecyclerView();
    }

    private void initRecyclerView() {

        OpenSourceAdapter<OpenSourceViewHolder> adapter = new OpenSourceAdapter<OpenSourceViewHolder>(OpenSourceData.getLicenseData(), new OpenSourceExpandableViewHolder.Factory());
        recyclerView.setAdapter(adapter);
    }
}

