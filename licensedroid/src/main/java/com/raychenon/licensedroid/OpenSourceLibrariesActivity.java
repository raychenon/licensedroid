package com.raychenon.licensedroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.raychenon.licensedroid.viewholder.OpenSourceViewHolder;

import java.util.ArrayList;

/**
 * @author Raymond Chenon
 */

public class OpenSourceLibrariesActivity extends AppCompatActivity {

    private static String INTENT_EXTRA_LIBS = "intent_extra_libs";

    private static OpenSourceViewHolder.Factory holderFactory;

    private RecyclerView recyclerView;

    private ArrayList<OpenSource> libsList;  // List cannot be put in Bundle, but ArrayList can

    public static Intent createIntent(final Context context, final ArrayList<OpenSource> libs) {
        Intent intent = new Intent(context, OpenSourceLibrariesActivity.class);
        intent.putExtra(INTENT_EXTRA_LIBS, libs);

        return intent;
    }

    public static Intent createIntent(final Context context, final ArrayList<OpenSource> libs, final OpenSourceViewHolder.Factory vhFactory) {
        Intent intent = new Intent(context, OpenSourceLibrariesActivity.class);
        intent.putExtra(INTENT_EXTRA_LIBS, libs);
        holderFactory = vhFactory; // cannot be save in the Intent bundle

        return intent;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opensource_activity);

        initFromIntent(getIntent());

        recyclerView = (RecyclerView) findViewById(R.id.licenseRecyclerView);

        initRecyclerView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        holderFactory = null;
    }

    private void initRecyclerView() {

        OpenSourceAdapter<OpenSourceViewHolder> adapter;
        if (holderFactory == null) {
            adapter = new OpenSourceAdapter<OpenSourceViewHolder>(libsList);
        } else {
            adapter = new OpenSourceAdapter<OpenSourceViewHolder>(libsList, holderFactory);
        }
        recyclerView.setAdapter(adapter);
    }


    private void initFromIntent(@NonNull final Intent intent) {
        if (intent.hasExtra(INTENT_EXTRA_LIBS)) {
            libsList = (ArrayList<OpenSource>) intent.getSerializableExtra(INTENT_EXTRA_LIBS);
        }
    }
}
