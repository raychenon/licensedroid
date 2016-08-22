package com.raychenon.licensedroid;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
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

    FragmentDelegate delegate;

    public static OpenSourceDialogFragment newInstance(final ArrayList<OpenSource> openSourceList) {

        OpenSourceDialogFragment openSourceFragmentDialog = new OpenSourceDialogFragment();

        Bundle args = openSourceFragmentDialog.getArguments();
        if (args == null) {
            args = new Bundle();
        }
        // Add parameters to the argument bundle
        args.putParcelableArrayList(KEY_ARG_LIST_OPENSOURCE, openSourceList);
        openSourceFragmentDialog.setArguments(args);

        return openSourceFragmentDialog;
    }

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (delegate == null){
            delegate = new FragmentDelegate();
        }

        openSourceList = delegate.onCreate(getArguments(), KEY_ARG_LIST_OPENSOURCE);

        setStyle(DialogFragment.STYLE_NORMAL, R.style.LicenseDroidDialog);
    }

    @Override
    public void onStart() {
        super.onStart();

        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.setTitle(getString(R.string.licensedroid_dialog_title));
        return dialog;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {

        return delegate.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        delegate.bindDataToRecyclerView(openSourceList);
    }


}
