package com.bawei.yikezhong.base;

import android.view.View;

interface IBase {
    int getContentLayout();
    void initView(View view);
    void inject();
}
