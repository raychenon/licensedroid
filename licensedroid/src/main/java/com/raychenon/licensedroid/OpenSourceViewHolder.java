package com.raychenon.licensedroid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * @author Raymond Chenon
 */
public class OpenSourceViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public TextView tvLicense;
    public TextView tvAuthor;

    public OpenSourceViewHolder(View itemView) {
        super(itemView);
        tvAuthor = (TextView) itemView.findViewById(R.id.licenseAuthor);
        tvName = (TextView) itemView.findViewById(R.id.licenseName);
        tvLicense = (TextView) itemView.findViewById(R.id.licenseType);
    }
}
