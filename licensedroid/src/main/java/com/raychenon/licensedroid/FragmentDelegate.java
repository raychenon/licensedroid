package com.raychenon.licensedroid;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * @author Raymond Chenon
 */
class FragmentDelegate {

    public ArrayList<OpenSource> onCreate(final Bundle args, final String KEY_ARG) {
        // Set incoming parameters
        if (args != null) {
            return (ArrayList<OpenSource>) args.getSerializable(KEY_ARG);
        }

        return null;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.opensource_dialog, container,false);
    }

    public void onViewCreated(final RecyclerView recyclerView, final ArrayList<OpenSource> openSourceList) {
        OpenSourceAdapter adapter = new OpenSourceAdapter(openSourceList);
        recyclerView.setAdapter(adapter);
    }

}
