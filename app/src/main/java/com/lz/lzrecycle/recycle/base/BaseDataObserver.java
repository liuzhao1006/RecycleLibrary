package com.lz.lzrecycle.recycle.base;

import android.support.v7.widget.RecyclerView;

import com.lz.lzrecycle.recycle.view.LzRefreshView;

/**
 * 作者 : 刘朝,
 * on 2017/9/2,
 * GitHub : https://github.com/liuzhao1006
 */

public class BaseDataObserver extends RecyclerView.AdapterDataObserver {
    private BaseAdapter mAdapter;
    private LzRefreshView view;
    private boolean mAttached;
    private boolean hasData = true;

    public BaseDataObserver() {

    }

    public void setData(BaseAdapter adapter, LzRefreshView view) {
        mAdapter = adapter;
        this.view = view;
//        onChanged();
    }

    private void enableEmptyView(boolean enable) {
        if (view != null) {
            view.enableEmptyView(enable);
        }
    }

    @Override
    public void onChanged() {
        if (mAdapter == null) {
            return;
        }
        if (mAdapter.isEmpty()) {
            if (hasData) {
                enableEmptyView(true);
                hasData = false;
            }
        } else {
            if (!hasData) {
                enableEmptyView(false);
                hasData = true;
            }
        }
    }

    @Override
    public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
        onChanged();
    }

    @Override
    public void onItemRangeChanged(int positionStart, int itemCount) {
        onChanged();
    }

    @Override
    public void onItemRangeInserted(int positionStart, int itemCount) {
        onChanged();
    }

    @Override
    public void onItemRangeRemoved(int positionStart, int itemCount) {
        onChanged();
    }

    @Override
    public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
        onChanged();
    }


    public void attach() {
        mAttached = true;
    }

    public boolean hasAttached() {
        return mAttached;
    }
}
