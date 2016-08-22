package com.raychenon.licensedroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * @author Raymond Chenon
 */
public class OpenSourceFragment extends Fragment {

    private static final String KEY_ARG_LIST_OPENSOURCE = "opensourceList";
    private ArrayList<OpenSource> openSourceList;

    private RecyclerView recyclerView;

    FragmentDelegate delegate;

    public static OpenSourceFragment newInstance(final ArrayList<OpenSource> openSourceList) {

        OpenSourceFragment fragment = new OpenSourceFragment();

        Bundle args = fragment.getArguments();
        if (args == null) {
            args = new Bundle();
        }
        // Add parameters to the argument bundle
        args.putParcelableArrayList(KEY_ARG_LIST_OPENSOURCE, openSourceList);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set incoming parameters
        Bundle args = getArguments();

        if (delegate == null){
            delegate = new FragmentDelegate();
        }

        openSourceList = delegate.onCreate(args, KEY_ARG_LIST_OPENSOURCE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return delegate.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        delegate.bindDataToRecyclerView(openSourceList);
    }
}
