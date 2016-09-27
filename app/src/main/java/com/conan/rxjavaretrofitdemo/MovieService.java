package com.conan.rxjavaretrofitdemo;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MovieService{

    @GET("Faq/lists")
    Observable<HttpResult<List<MovieEntity.DataBean>>> getTopMovie(@Query("type") int type);
}
