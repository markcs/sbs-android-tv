package io.github.nextux.sbs;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

import io.github.nextux.sbs.IApplication;
import io.github.nextux.sbs.content.ContentManager;

public class MainApplication extends Application implements IApplication {
    private static final String TAG = "MainApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        new ContentManager(this).fetchShowList(true);
        FlowManager.init(this);
    }

    @Override
    public int getImageCardViewContentTextResId() {
        return android.support.v17.leanback.R.id.content_text;
    }

    @Override
    public int getImageCardViewInfoFieldResId() {
        return android.support.v17.leanback.R.id.info_field;
    }

    @Override
    public int getImageCardViewTitleTextResId() {
        return android.support.v17.leanback.R.id.title_text;
    }
}