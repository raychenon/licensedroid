package com.raychenon.licensedroid.sample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.raychenon.licensedroid.OpenSourceCustomViewHolder;
import com.raychenon.licensedroid.OpenSourceUIModel;
import com.raychenon.licensedroid.sample.R;

/**
 * @author Raymond Chenon
 */
public class CustomViewHolder extends OpenSourceCustomViewHolder {

    private TextView tvName;
    private TextView tvAuthor;
    private TextView tvLicense;


    public CustomViewHolder(final ViewGroup parent, final int viewType) {
        super(parent);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.custom_list_item, parent);

//        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View itemView = inflater.inflate(R.layout.custom_list_item, null);

        tvName = (TextView) itemView.findViewById(R.id.libraryName);
        tvAuthor = (TextView) itemView.findViewById(R.id.libraryAuthor);
        tvLicense = (TextView) itemView.findViewById(R.id.licenseText);
    }

    @Override
    public void delegateOnBindViewHolder(OpenSourceUIModel item) {

        tvName.setText(item.getLibraryName());
        tvAuthor.setText(item.getAuthor());
        tvLicense.setText(item.getLicense());
    }
}
