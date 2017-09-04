package com.lz.lzrecycle.recycle.view;

/**
 * 作者 : 刘朝,
 * on 2017/9/2,
 * GitHub : https://github.com/liuzhao1006
 */

public class LzRefreshHolder {
    public int mOffsetY;

    public void move(int deltaY) {
        mOffsetY += deltaY;
    }

    public boolean hasHeaderPullDown() {
        return mOffsetY > 0;
    }

    public boolean hasFooterPullUp() {
        return mOffsetY < 0;
    }
    public boolean isOverHeader(int deltaY){
        return mOffsetY<-deltaY;

    }
}
