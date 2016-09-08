package com.raychenon.licensedroid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.raychenon.licensedroid.OpenSource;
import com.raychenon.licensedroid.OpenSourceTransformer;
import com.raychenon.licensedroid.OpenSourceUIModel;

import java.util.List;

/**
 * @author Raymond Chenon
 */
public  class CLicenseAdapter extends RecyclerView.Adapter<LicenseViewHolder> {

    private final List<OpenSource> openSources;
    private final OpenSourceTransformer transformer;
    private final LicenseViewHolder.Factory factory;

    public CLicenseAdapter(final List<OpenSource> openSourceList, final LicenseViewHolder.Factory factory){
        this.openSources = openSourceList;
        this.transformer = new OpenSourceTransformer();
        this.factory = factory;

        if (openSources == null || factory == null) {
            throw new NullPointerException("Neither data or factory can be null!");
        }
    }

    @Override
    public LicenseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return factory.createViewHolder(parent,viewType);
    }

    @Override
    public void onBindViewHolder(LicenseViewHolder holder, int position) {
        OpenSource openSource = getItem(position);
        OpenSourceUIModel item = transformer.transform(openSource);

        holder.bindData(item);
    }

    @Override
    public int getItemCount() {
        return openSources != null ? openSources.size() : 0;
    }

    private OpenSource getItem(final int position){
        return openSources.get(position);
    }
}
