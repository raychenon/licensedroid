package com.raychenon.licensedroid.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import com.raychenon.licensedroid.SimpleDividerItemDecoration;

/**
 * @author Raymond Chenon
 */
public class DividerRecyclerView extends RecyclerView {

    public DividerRecyclerView(Context context) {
        super(context);

        init();
    }

    public DividerRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    public DividerRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        init();
    }

    private void init() {
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        setLayoutManager(llm);

        addItemDecoration(new SimpleDividerItemDecoration(getContext())); // for the line divider
    }
}
