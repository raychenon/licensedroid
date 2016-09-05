package com.raychenon.licensedroid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.raychenon.licensedroid.R;

/**
 * @author Raymond Chenon
 */
public class OpenSourceDefaultViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public TextView tvLicense;


    public OpenSourceDefaultViewHolder(View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.licenseName);
        tvLicense = (TextView) itemView.findViewById(R.id.licenseType);
    }
}
