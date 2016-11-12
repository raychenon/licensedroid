package com.raychenon.licensedroid.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.raychenon.licensedroid.OpenSourceModel;

/**
 *
 * The solution was given by "lionscribe"
 * http://stackoverflow.com/questions/39238674/recyclerview-viewholder-oncreateviewholder-view-binding-and-onbindviewholder
 * @author lionscribe, Raymond Chenon
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
