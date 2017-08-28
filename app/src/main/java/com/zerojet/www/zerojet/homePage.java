package com.zerojet.www.zerojet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

/**
 * Created by munyaradzihove on 2017-08-26.
 */

public class homePage extends AppCompatActivity {


    TextView pageTitle;

    private FeatureCoverFlow bottomNavigationCategoryFlow;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        pageTitle = (TextView) findViewById(com.zerojet.www.zerojet.R.id.pageTitle);
        pageTitle.setText(com.zerojet.www.zerojet.R.string.categoryHome);

        bottomNavigationCategoryFlow = (FeatureCoverFlow)findViewById(R.id.bottomNavigationCategoryFlow);
    }
}
