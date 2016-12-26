package cn.yhq.http.core;

import retrofit2.Response;

/**
 * Created by Yanghuiqiang on 2016/12/26.
 */

public interface ICallResponse<T> extends ICancelable {
    T getResponseBody();

    Response getResponse();

}
