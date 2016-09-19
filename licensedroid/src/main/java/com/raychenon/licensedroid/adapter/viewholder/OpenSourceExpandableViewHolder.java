package com.raychenon.licensedroid.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.raychenon.licensedroid.OpenSourceModel;
import com.raychenon.licensedroid.R;

/**
 * @author Raymond Chenon
 */
public class OpenSourceExpandableViewHolder extends OpenSourceViewHolder {

    private TextView tvName;
    private TextView tvAuthor;
    private TextView tvLicense;

    private boolean isExpanded = false;

    public OpenSourceExpandableViewHolder(final View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.licenseName);
        tvAuthor = (TextView) itemView.findViewById(R.id.licenseAuthor);
        tvLicense = (TextView) itemView.findViewById(R.id.licenseType);
    }

    @Override
    public void bindData(final OpenSourceModel item) {

        tvName.setText(item.libraryName);
        tvAuthor.setText(item.author);
        tvLicense.setText(item.license.name);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isExpanded = !isExpanded;
                if (isExpanded) {
                    tvLicense.setText(item.license.fullDescription);
                } else {
                    tvLicense.setText(item.license.name);
                }
            }
        });
    }

    public static class Factory implements OpenSourceViewHolder.Factory {
        @Override
        public OpenSourceViewHolder createViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.license_expendable_item, parent, false);
            return new OpenSourceExpandableViewHolder(v);
        }
    }

}
