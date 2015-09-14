package com.filreas.gosthlm.slapi.operations;

/**
 * Created by Andreas on 9/10/2015.
 */
public interface ISLRequestHandler<TRequest extends SLApiRequest, TResponse> {
    TResponse get(TRequest request);
}
