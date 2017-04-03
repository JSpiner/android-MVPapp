package net.jspiner.weather;

import android.support.v4.app.Fragment;

/**
 * Copyright 2017 JSpiner. All rights reserved.
 *
 * @author jspiner (jspiner@naver.com)
 * @project Weather
 * @since 17. 4. 1
 */

public class MainFragment extends Fragment implements MainView {

    public MainFragment() {
        super();
    }

    public MainFragment getInstance(){
        return this;
    }

    @Override
    public void setPresenter(MainPresenter presenter) {

    }
}
