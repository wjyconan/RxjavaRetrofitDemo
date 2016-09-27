// Generated code from Butter Knife. Do not modify!
package com.conan.rxjavaretrofitdemo;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.conan.rxjavaretrofitdemo.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427412, "field 'clickMeBN' and method 'onClick'");
    target.clickMeBN = finder.castView(view, 2131427412, "field 'clickMeBN'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick();
        }
      });
    view = finder.findRequiredView(source, 2131427413, "field 'resultTV'");
    target.resultTV = finder.castView(view, 2131427413, "field 'resultTV'");
  }

  @Override public void unbind(T target) {
    target.clickMeBN = null;
    target.resultTV = null;
  }
}
