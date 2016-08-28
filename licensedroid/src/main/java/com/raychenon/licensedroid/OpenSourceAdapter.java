package com.raychenon.licensedroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * @author Raymond Chenon
 */
public class OpenSourceAdapter extends RecyclerView.Adapter<OpenSourceViewHolder>{

    private List<OpenSource> openSources;
    private OpenSourceTransformer transformer;

    public OpenSourceAdapter(final List<OpenSource> openSourceList){
        this.openSources = openSourceList;
        transformer = new OpenSourceTransformer();
    }

    @Override
    public OpenSourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.license_item,parent,false);
        return new OpenSourceViewHolder(v);
    }

    @Override
    public void onBindViewHolder(OpenSourceViewHolder holder, int position) {
        OpenSource openSource = getItem(position);

        OpenSourceUIModel item = transformer.transform(openSource);

        holder.tvName.setText(item.getLibraryName());
        holder.tvLicense.setText(item.getLicense());
    }

    @Override
    public int getItemCount() {
        return openSources != null ? openSources.size() : 0;
    }

    private OpenSource getItem(final int position){
        return openSources.get(position);
    }
}
