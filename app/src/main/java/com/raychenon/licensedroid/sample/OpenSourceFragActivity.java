package com.raychenon.licensedroid.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.raychenon.licensedroid.OpenSourceFragment;

import java.util.ArrayList;

/**
 * @author Raymond Chenon
 */
public class OpenSourceFragActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity);

        recyclerView = (RecyclerView) findViewById(R.id.licenseRecyclerView);

        commitFragment();
    }

    private void commitFragment() {
        OpenSourceFragment fragment = OpenSourceFragment.newInstance(new ArrayList<>(OpenSourceData.getLicenseData()));
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragment).commit();
    }


}
