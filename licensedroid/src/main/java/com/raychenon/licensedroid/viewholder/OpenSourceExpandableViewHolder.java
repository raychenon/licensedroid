package com.raychenon.licensedroid.viewholder;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.raychenon.licensedroid.OpenSourceModel;
import com.raychenon.licensedroid.R;

/**
 * @author Raymond Chenon
 */
public class OpenSourceExpandableViewHolder extends OpenSourceViewHolder {

    private final int DURATION = 250;

    private TextView tvName;
    private TextView tvAuthor;
    private TextView tvLicense;
    private ImageView arrow;

    private boolean isExpanded = false;

    public OpenSourceExpandableViewHolder(final View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.licenseName);
        tvAuthor = (TextView) itemView.findViewById(R.id.licenseAuthor);
        tvLicense = (TextView) itemView.findViewById(R.id.licenseType);
        arrow = (ImageView) itemView.findViewById(R.id.expandIcon);
    }

    @Override
    public void bindData(final OpenSourceModel item) {

        tvName.setText(item.libraryName);
        tvAuthor.setText(item.author);
        tvLicense.setText(item.license.name);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isExpanded = !isExpanded;
                if (isExpanded) {
                    expand();
                    tvLicense.setText(item.license.fullDescription);
                } else {
                    collapse();
                    tvLicense.setText(item.license.name);
                }
                fadeIn(tvLicense);
            }
        });
    }

    private void fadeIn(final TextView textView){
        final Animation in = new AlphaAnimation(0.0f, 1.0f);
        in.setDuration(DURATION);
        textView.setAnimation(in);
        in.start();
    }

    public static class Factory implements OpenSourceViewHolder.Factory {
        @Override
        public OpenSourceViewHolder createViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.license_expendable_item, parent, false);
            return new OpenSourceExpandableViewHolder(v);
        }
    }

    private void collapse(){
        animate(-180);
    }

    private void expand(){
        animate(180);
    }

    private void animate(int endRotation){

        arrow.animate().rotationBy(endRotation).setDuration(DURATION).start();

    }

}
