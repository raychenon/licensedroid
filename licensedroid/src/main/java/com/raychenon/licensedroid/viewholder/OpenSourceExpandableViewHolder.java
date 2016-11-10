package com.raychenon.licensedroid.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.raychenon.licensedroid.OpenSourceModel;
import com.raychenon.licensedroid.R;

/**
 * @author Raymond Chenon
 */
public class OpenSourceExpandableViewHolder extends OpenSourceViewHolder {

    private final int DURATION = 150;
    private final int ROTATION = 180;
    private final int TRANSLATION_Y = 80;

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
        // TODO set clickable url
        // Html.fromHtml(item.extras.gitRepoUrl);
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
        animate(-ROTATION,-TRANSLATION_Y);
    }

    private void expand(){
        animate(ROTATION,TRANSLATION_Y);
    }

    private void animate(int endRotation, int translationY){

        arrow.animate().rotationBy(endRotation).setDuration(DURATION).start();
        tvLicense.animate().translationYBy(translationY).setDuration(DURATION).start();

    }

}
