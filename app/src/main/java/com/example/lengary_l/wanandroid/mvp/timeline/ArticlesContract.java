package com.example.lengary_l.wanandroid.mvp.timeline;

import com.example.lengary_l.wanandroid.data.ArticleDetailData;
import com.example.lengary_l.wanandroid.data.BannerDetailData;
import com.example.lengary_l.wanandroid.mvp.BasePresenter;
import com.example.lengary_l.wanandroid.mvp.BaseView;

import java.util.List;

public interface ArticlesContract {

    interface Presenter extends BasePresenter{

        void autoLogin(String userName, String userPassword);

        void getArticles(int page, boolean forceUpdate, boolean clearCache);

        void getBanner();
    }

    interface View extends BaseView<Presenter>{

        boolean isActive();

        void setLoadingIndicator(boolean isActive);

        void showArticles(List<ArticleDetailData> list);

        void showEmptyView();

        void showBanner(List<BannerDetailData> list);

        void hideBanner();

        void navigateToLogin();
    }
}
