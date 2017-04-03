package net.jspiner.weather;

/**
 * Copyright 2017 JSpiner. All rights reserved.
 *
 * @author jspiner (jspiner@naver.com)
 * @project Weather
 * @since 17. 3. 31
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
}
