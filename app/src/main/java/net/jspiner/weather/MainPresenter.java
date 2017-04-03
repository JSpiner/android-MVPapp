package net.jspiner.weather;

/**
 * Copyright 2017 JSpiner. All rights reserved.
 *
 * @author jspiner (jspiner@naver.com)
 * @project Weather
 * @since 17. 4. 1
 */

public class MainPresenter implements BasePresenter {

    public MainPresenter(MainView view){
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
