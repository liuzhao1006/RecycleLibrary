package com.lz.lzrecycle.recycle.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * 作者 : 刘朝,
 * on 2017/9/2,
 * GitHub : https://github.com/liuzhao1006
 */

public class LzWebView extends WebView {
    public LzWebView(Context context) {
        super(context);
    }

    public LzWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LzWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public boolean isBottom() {
        return computeVerticalScrollRange() == getHeight() + getScrollY();
    }

    @Override
    public int computeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }
}
