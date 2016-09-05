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

    public static class Factory implements OpenSourceCustomViewHolder.Factory {
        @Override
        public OpenSourceCustomViewHolder createViewHolder(ViewGroup parent, int viewType){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item, parent, false);
            return new CustomViewHolder(v);
        }
    };

    public CustomViewHolder(final View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.libraryName);
        tvAuthor = (TextView) itemView.findViewById(R.id.libraryAuthor);
        tvLicense = (TextView) itemView.findViewById(R.id.licenseText);
    }

    @Override
    public void bindData(OpenSourceUIModel item) {

        tvName.setText(item.getLibraryName());
        tvAuthor.setText(item.getAuthor());
        tvLicense.setText(item.getLicense());
    }

}
