package com.raychenon.licensedroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.raychenon.licensedroid.OpenSourceModel;
import com.raychenon.licensedroid.R;

/**
 * @author Raymond Chenon
 */
public class OpenSourceDefaultViewHolder extends OpenSourceViewHolder {

    public TextView tvName;
    public TextView tvLicense;

    public OpenSourceDefaultViewHolder(View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.licenseName);
        tvLicense = (TextView) itemView.findViewById(R.id.licenseType);
    }

    static public OpenSourceDefaultViewHolder createViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.license_item, parent, false);
        return new OpenSourceDefaultViewHolder(v);
    }

    @Override
    public void bindData(OpenSourceModel item) {
        tvName.setText(item.getLibraryName());
        tvLicense.setText(item.getLicense());
    }
}
