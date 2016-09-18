package com.raychenon.licensedroid.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.raychenon.licensedroid.OpenSourceModel;

/**
 * @author Raymond Chenon
 */
public abstract class OpenSourceViewHolder extends RecyclerView.ViewHolder {

    public OpenSourceViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindData(final OpenSourceModel item);

    public interface Factory {
        public abstract OpenSourceViewHolder createViewHolder(ViewGroup parent, int viewType);
    }

}
