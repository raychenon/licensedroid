package com.raychenon.licensedroid.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.raychenon.licensedroid.OpenSourceAdapter;
import com.raychenon.licensedroid.viewholder.OpenSourceExpandableViewHolder;
import com.raychenon.licensedroid.viewholder.OpenSourceViewHolder;

/**
 * the advantage of creating your own own Activity over using {@link com.raychenon.licensedroid.OpenSourceLibrariesActivity} :
 * - the list<>OpenSource> doesn't have to be an ArrayList
 *
 * @author Raymond Chenon
 */

public class ExpandableViewHolderActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_recyclerview);

        recyclerView = (RecyclerView) findViewById(R.id.libsRecyclerView);

        initRecyclerView();
    }

    private void initRecyclerView() {

        OpenSourceAdapter<OpenSourceViewHolder> adapter = new OpenSourceAdapter<OpenSourceViewHolder>(OpenSourceData.getLibrariesData(), new OpenSourceExpandableViewHolder.Factory());
        recyclerView.setAdapter(adapter);
    }
}

