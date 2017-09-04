package com.lz.lzrecycle.recycle.view;

import android.support.v7.widget.GridLayoutManager;

import com.lz.lzrecycle.recycle.base.BaseAdapter;

/**
 * 作者 : 刘朝,
 * on 2017/9/2,
 * GitHub : https://github.com/liuzhao1006
 * 使用这个类来让角布局有填充整个宽度
 */

public class LzSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {

    private BaseAdapter adapter;
    private int mSpanSize = 1;

    public LzSpanSizeLookup(BaseAdapter adapter, int spanSize) {
        this.adapter = adapter;
        this.mSpanSize = spanSize;
    }

    @Override
    public int getSpanSize(int position) {
        boolean isHeaderOrFooter = adapter.isFooter(position) || adapter.isHeader(position);
        return isHeaderOrFooter ? mSpanSize : 1;
    }
}