/*
 * hotmart-challenge
 * Especificação da API Hotmart Challenge
 *
 * OpenAPI spec version: 1.0.0
 * Contact: bismarck@ufmg.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ErrorReturn;
import io.swagger.client.model.ProductReturn;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductApi {
    private ApiClient apiClient;

    public ProductApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deletarProduto
     * @param productCode Código do produto (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletarProdutoCall(Integer productCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Product"
            .replaceAll("\\{" + "productCode" + "\\}", apiClient.escapeString(productCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletarProdutoValidateBeforeCall(Integer productCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling deletarProduto(Async)");
        }
        

        com.squareup.okhttp.Call call = deletarProdutoCall(productCode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletar produto
     * Deletar produto
     * @param productCode Código do produto (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deletarProduto(Integer productCode) throws ApiException {
        deletarProdutoWithHttpInfo(productCode);
    }

    /**
     * Deletar produto
     * Deletar produto
     * @param productCode Código do produto (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deletarProdutoWithHttpInfo(Integer productCode) throws ApiException {
        com.squareup.okhttp.Call call = deletarProdutoValidateBeforeCall(productCode, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletar produto (asynchronously)
     * Deletar produto
     * @param productCode Código do produto (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletarProdutoAsync(Integer productCode, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletarProdutoValidateBeforeCall(productCode, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getConsultarProdutoId
     * @param idProduct  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getConsultarProdutoIdCall(Integer idProduct, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Product/{idProduct}"
            .replaceAll("\\{" + "idProduct" + "\\}", apiClient.escapeString(idProduct.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getConsultarProdutoIdValidateBeforeCall(Integer idProduct, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'idProduct' is set
        if (idProduct == null) {
            throw new ApiException("Missing the required parameter 'idProduct' when calling getConsultarProdutoId(Async)");
        }
        

        com.squareup.okhttp.Call call = getConsultarProdutoIdCall(idProduct, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Buscar informações de produtos por Id
     * Buscar informações de produtos por Id
     * @param idProduct  (required)
     * @return ProductReturn
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProductReturn getConsultarProdutoId(Integer idProduct) throws ApiException {
        ApiResponse<ProductReturn> resp = getConsultarProdutoIdWithHttpInfo(idProduct);
        return resp.getData();
    }

    /**
     * Buscar informações de produtos por Id
     * Buscar informações de produtos por Id
     * @param idProduct  (required)
     * @return ApiResponse&lt;ProductReturn&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProductReturn> getConsultarProdutoIdWithHttpInfo(Integer idProduct) throws ApiException {
        com.squareup.okhttp.Call call = getConsultarProdutoIdValidateBeforeCall(idProduct, null, null);
        Type localVarReturnType = new TypeToken<ProductReturn>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Buscar informações de produtos por Id (asynchronously)
     * Buscar informações de produtos por Id
     * @param idProduct  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getConsultarProdutoIdAsync(Integer idProduct, final ApiCallback<ProductReturn> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getConsultarProdutoIdValidateBeforeCall(idProduct, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProductReturn>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getConsultarProdutos
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getConsultarProdutosCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Product";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getConsultarProdutosValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getConsultarProdutosCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Recupera a lista geral de produtos
     * Recupera a lista de produtos
     * @return ProductReturn
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProductReturn getConsultarProdutos() throws ApiException {
        ApiResponse<ProductReturn> resp = getConsultarProdutosWithHttpInfo();
        return resp.getData();
    }

    /**
     * Recupera a lista geral de produtos
     * Recupera a lista de produtos
     * @return ApiResponse&lt;ProductReturn&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProductReturn> getConsultarProdutosWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getConsultarProdutosValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ProductReturn>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Recupera a lista geral de produtos (asynchronously)
     * Recupera a lista de produtos
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getConsultarProdutosAsync(final ApiCallback<ProductReturn> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getConsultarProdutosValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProductReturn>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postCadastrarProduto
     * @param productCode Código do produto (required)
     * @param product Nome do produto (required)
     * @param description Descricao do produto (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postCadastrarProdutoCall(Integer productCode, String product, String description, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Product"
            .replaceAll("\\{" + "productCode" + "\\}", apiClient.escapeString(productCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (product != null)
        localVarHeaderParams.put("product", apiClient.parameterToString(product));
        if (description != null)
        localVarHeaderParams.put("description", apiClient.parameterToString(description));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postCadastrarProdutoValidateBeforeCall(Integer productCode, String product, String description, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling postCadastrarProduto(Async)");
        }
        
        // verify the required parameter 'product' is set
        if (product == null) {
            throw new ApiException("Missing the required parameter 'product' when calling postCadastrarProduto(Async)");
        }
        
        // verify the required parameter 'description' is set
        if (description == null) {
            throw new ApiException("Missing the required parameter 'description' when calling postCadastrarProduto(Async)");
        }
        

        com.squareup.okhttp.Call call = postCadastrarProdutoCall(productCode, product, description, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Faz cadastro de produto
     * Faz cadastro de produto
     * @param productCode Código do produto (required)
     * @param product Nome do produto (required)
     * @param description Descricao do produto (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postCadastrarProduto(Integer productCode, String product, String description) throws ApiException {
        postCadastrarProdutoWithHttpInfo(productCode, product, description);
    }

    /**
     * Faz cadastro de produto
     * Faz cadastro de produto
     * @param productCode Código do produto (required)
     * @param product Nome do produto (required)
     * @param description Descricao do produto (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postCadastrarProdutoWithHttpInfo(Integer productCode, String product, String description) throws ApiException {
        com.squareup.okhttp.Call call = postCadastrarProdutoValidateBeforeCall(productCode, product, description, null, null);
        return apiClient.execute(call);
    }

    /**
     * Faz cadastro de produto (asynchronously)
     * Faz cadastro de produto
     * @param productCode Código do produto (required)
     * @param product Nome do produto (required)
     * @param description Descricao do produto (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCadastrarProdutoAsync(Integer productCode, String product, String description, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postCadastrarProdutoValidateBeforeCall(productCode, product, description, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for putAlterarProduto
     * @param productCode Código do produto (required)
     * @param product Nome do produto (required)
     * @param description Descricao do produto (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putAlterarProdutoCall(Integer productCode, String product, String description, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Product"
            .replaceAll("\\{" + "productCode" + "\\}", apiClient.escapeString(productCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (product != null)
        localVarHeaderParams.put("product", apiClient.parameterToString(product));
        if (description != null)
        localVarHeaderParams.put("description", apiClient.parameterToString(description));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putAlterarProdutoValidateBeforeCall(Integer productCode, String product, String description, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'productCode' is set
        if (productCode == null) {
            throw new ApiException("Missing the required parameter 'productCode' when calling putAlterarProduto(Async)");
        }
        
        // verify the required parameter 'product' is set
        if (product == null) {
            throw new ApiException("Missing the required parameter 'product' when calling putAlterarProduto(Async)");
        }
        
        // verify the required parameter 'description' is set
        if (description == null) {
            throw new ApiException("Missing the required parameter 'description' when calling putAlterarProduto(Async)");
        }
        

        com.squareup.okhttp.Call call = putAlterarProdutoCall(productCode, product, description, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Alterar cadastro de um produto
     * Alterar cadastro de um produto
     * @param productCode Código do produto (required)
     * @param product Nome do produto (required)
     * @param description Descricao do produto (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putAlterarProduto(Integer productCode, String product, String description) throws ApiException {
        putAlterarProdutoWithHttpInfo(productCode, product, description);
    }

    /**
     * Alterar cadastro de um produto
     * Alterar cadastro de um produto
     * @param productCode Código do produto (required)
     * @param product Nome do produto (required)
     * @param description Descricao do produto (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putAlterarProdutoWithHttpInfo(Integer productCode, String product, String description) throws ApiException {
        com.squareup.okhttp.Call call = putAlterarProdutoValidateBeforeCall(productCode, product, description, null, null);
        return apiClient.execute(call);
    }

    /**
     * Alterar cadastro de um produto (asynchronously)
     * Alterar cadastro de um produto
     * @param productCode Código do produto (required)
     * @param product Nome do produto (required)
     * @param description Descricao do produto (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putAlterarProdutoAsync(Integer productCode, String product, String description, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putAlterarProdutoValidateBeforeCall(productCode, product, description, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}