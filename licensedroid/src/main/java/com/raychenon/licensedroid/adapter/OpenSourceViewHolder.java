package com.raychenon.licensedroid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.raychenon.licensedroid.OpenSourceUIModel;

/**
 * @author Raymond Chenon
 */
public abstract class OpenSourceViewHolder extends RecyclerView.ViewHolder{

    public interface Factory{
        public abstract OpenSourceViewHolder createViewHolder(ViewGroup parent, int viewType);
    }

    public OpenSourceViewHolder(View itemView){
        super(itemView);
    }

    public abstract void bindData(final OpenSourceUIModel item);

}
