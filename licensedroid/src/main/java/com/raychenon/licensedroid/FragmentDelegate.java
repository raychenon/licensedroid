package com.raychenon.licensedroid;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raychenon.licensedroid.viewholder.OpenSourceViewHolder;

import java.util.ArrayList;

/**
 * @author Raymond Chenon
 */
class FragmentDelegate {

    private View view;

    public ArrayList<OpenSource> onCreate(final Bundle args, final String KEY_ARG) {
        if (args != null) {
            return (ArrayList<OpenSource>) args.getSerializable(KEY_ARG);
        }

        return null;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.opensource_dialog, container, false);
        return view;
    }

    public void bindDataToRecyclerView(final ArrayList<OpenSource> openSourceList) {
        RecyclerView recyclerView = getRecyclerView();
        OpenSourceAdapter<OpenSourceViewHolder> adapter = new OpenSourceAdapter<OpenSourceViewHolder>(openSourceList);
        recyclerView.setAdapter(adapter);
    }

    private RecyclerView getRecyclerView() {
        return (RecyclerView) view.findViewById(R.id.licensedroidOpenSourceRecyclerView);
    }

}
