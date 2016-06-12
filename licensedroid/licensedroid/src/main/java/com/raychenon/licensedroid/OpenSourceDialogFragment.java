package com.raychenon.licensedroid;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * @author Raymond Chenon
 */
public class OpenSourceDialogFragment extends DialogFragment {

    private static final String KEY_ARG_LIST_OPENSOURCE = "opensourceList";
    private ArrayList<OpenSource> openSourceList;

    private RecyclerView recyclerView;

    public static OpenSourceDialogFragment newInstance(final ArrayList<OpenSource> openSourceList) {

        OpenSourceDialogFragment openSourceFragmentDialog = new OpenSourceDialogFragment();

        // Get arguments passed in, if any
        Bundle args = openSourceFragmentDialog.getArguments();
        if (args == null) {
            args = new Bundle();
        }
        // Add parameters to the argument bundle
        args.putSerializable(KEY_ARG_LIST_OPENSOURCE, openSourceList);
        openSourceFragmentDialog.setArguments(args);

        return openSourceFragmentDialog;
    }

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set incoming parameters
        Bundle args = getArguments();
        if (args != null) {
            openSourceList = (ArrayList<OpenSource>) args.getSerializable(KEY_ARG_LIST_OPENSOURCE);
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.opensource_dialog, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) view.findViewById(R.id.licensedroidOpenSourceRecyclerView);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        OpenSourceAdapter adapter = new OpenSourceAdapter(openSourceList);

        recyclerView.setLayoutManager(llm);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getContext())); // for the line divider
        recyclerView.setAdapter(adapter);
    }


}
