package com.raychenon.licensedroid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Raymond Chenon
 */
public class LicenseViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public TextView tvLicense;

    public LicenseViewHolder(View itemView) {
        super(itemView);
        tvName = (TextView) itemView.findViewById(R.id.licenseName);
        tvLicense = (TextView) itemView.findViewById(R.id.licenseType);
    }
}
