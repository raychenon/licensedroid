package com.raychenon.licensedroid.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.raychenon.licensedroid.OpenSource;
import com.raychenon.licensedroid.OpenSourceDialogFragment;
import com.raychenon.licensedroid.OpenSourceLibrariesActivity;
import com.raychenon.licensedroid.sample.viewholder.CustomViewHolder;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Raymond Chenon
 */
public class StartActivity extends AppCompatActivity {

    private ArrayList<OpenSource> librariesList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        ButterKnife.bind(this);

        librariesList=new ArrayList<>(OpenSourceData.getLibrariesData());
    }

    @OnClick(R.id.activity_button)
    public void redirectActivity() {
        startActivity(OpenSourceLibrariesActivity.createIntent(this, librariesList));
    }

    @OnClick(R.id.dialog_button)
    public void showDialog() {
        OpenSourceDialogFragment dialog = OpenSourceDialogFragment.newInstance(librariesList);
        dialog.show(getSupportFragmentManager(), "dialog");
    }

    @OnClick(R.id.fragment_button)
    public void redirectFragment() {
        redirect(OpenSourceFragActivity.class);
    }

    @OnClick(R.id.custom_viewholder_button)
    public void redirectCustom() {
        startActivity(OpenSourceLibrariesActivity.createIntent(this, librariesList,new CustomViewHolder.Factory()));
        // redirect(CustomViewHolderActivity.class);
    }

    @OnClick(R.id.expandable_viewholder_button)
    public void redirectExpandble() {
        redirect(ExpandableViewHolderActivity.class);
    }

    private void redirect(final Class<?> cls) {
        startActivity(new Intent(this, cls));
    }

}
