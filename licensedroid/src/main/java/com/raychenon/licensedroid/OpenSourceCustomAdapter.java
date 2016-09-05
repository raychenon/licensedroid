package com.raychenon.licensedroid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Raymond Chenon
 */
public  class OpenSourceCustomAdapter extends RecyclerView.Adapter<OpenSourceCustomViewHolder> {

    private final List<OpenSource> openSources;
    private final OpenSourceTransformer transformer;
    private OpenSourceCustomViewHolder viewHolder;
    private final OpenSourceCustomViewHolder.Factory factory;

    public OpenSourceCustomAdapter(final List<OpenSource> openSourceList, final OpenSourceCustomViewHolder.Factory factory){
        this.openSources = openSourceList;
        this.transformer = new OpenSourceTransformer();
        this.factory = factory;
    }

    @Override
    public OpenSourceCustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return factory.createViewHolder(parent,viewType);
    }

    @Override
    public void onBindViewHolder(OpenSourceCustomViewHolder holder, int position) {
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
