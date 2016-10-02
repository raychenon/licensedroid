package com.raychenon.licensedroid.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.raychenon.licensedroid.OpenSourceDialogFragment;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Raymond Chenon
 */
public class StartActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.activity_button)
    public void redirectActivity() {
        redirect(OpenSourceActivity.class);
    }

    @OnClick(R.id.dialog_button)
    public void showDialog() {
        OpenSourceDialogFragment dialog = OpenSourceDialogFragment.newInstance(new ArrayList<>(OpenSourceData.getLicenseData()));
        dialog.show(getSupportFragmentManager(), "dialog");
    }

    @OnClick(R.id.fragment_button)
    public void redirectFragment() {
        redirect(OpenSourceFragActivity.class);
    }

    @OnClick(R.id.custom_viewholder_button)
    public void redirectCustom() {
        redirect(CustomViewHolderActivity.class);
    }

    @OnClick(R.id.expandable_viewholder_button)
    public void redirectExpandble() {
        redirect(ExpandableViewHolderActivity.class);
    }

    private void redirect(final Class<?> cls) {
        startActivity(new Intent(this, cls));
    }

}
