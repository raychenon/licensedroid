package com.raychenon.licensedroid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.raychenon.licensedroid.OpenSource;
import com.raychenon.licensedroid.OpenSourceUIModel;
import com.raychenon.licensedroid.R;

/**
 * @author Raymond Chenon
 */
public class OpenSourceDefaultViewHolder extends OpenSourceViewHolder {

    public TextView tvName;
    public TextView tvLicense;

    static public OpenSourceDefaultViewHolder createViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.license_item,parent,false);
        return new OpenSourceDefaultViewHolder(v);
    }

    public OpenSourceDefaultViewHolder(View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.licenseName);
        tvLicense = (TextView) itemView.findViewById(R.id.licenseType);
    }

    @Override
    public void bindData(OpenSourceUIModel item) {
        tvName.setText(item.getLibraryName());
        tvLicense.setText(item.getLicense());
    }
}
