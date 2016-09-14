package com.raychenon.licensedroid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raychenon.licensedroid.OpenSource;
import com.raychenon.licensedroid.OpenSourceTransformer;
import com.raychenon.licensedroid.OpenSourceUIModel;
import com.raychenon.licensedroid.R;

import java.util.List;

/**
 * @author Raymond Chenon
 */
public class ObsoleteOpenSourceAdapter extends RecyclerView.Adapter<OpenSourceDefaultViewHolder> {

    private List<OpenSource> openSources;
    private OpenSourceTransformer transformer;

    public ObsoleteOpenSourceAdapter(final List<OpenSource> openSourceList) {
        this.openSources = openSourceList;
        transformer = new OpenSourceTransformer();
    }

    @Override
    public OpenSourceDefaultViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.license_item, parent, false);
        return new OpenSourceDefaultViewHolder(v);
    }

    @Override
    public void onBindViewHolder(OpenSourceDefaultViewHolder holder, int position) {
        OpenSource openSource = getItem(position);

        OpenSourceUIModel item = transformer.transform(openSource);

        holder.tvName.setText(item.getLibraryName());
        holder.tvLicense.setText(item.getLicense());
    }

    @Override
    public int getItemCount() {
        return openSources != null ? openSources.size() : 0;
    }

    private OpenSource getItem(final int position) {
        return openSources.get(position);
    }
}
