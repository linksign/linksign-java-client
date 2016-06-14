package cn.linksign.api.web;

import com.sun.jersey.api.client.GenericType;

import cn.linksign.client.ApiClient;
import cn.linksign.client.ApiException;
import cn.linksign.client.Configuration;
import cn.linksign.client.Pair;

import cn.linksign.api.model.SignatureSummary;
import cn.linksign.api.model.ApiError;
import cn.linksign.api.model.Signature;
import cn.linksign.api.model.SignatureFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T14:36:43.079+08:00")
public class SignatureApi {
  private ApiClient apiClient;

  public SignatureApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SignatureApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u65B0\u5EFA\u4E00\u4E2A\u7B7E\u540D\u6536\u96C6\u8BF7\u6C42
   * \u65B0\u5EFA\u4E00\u4E2A\u7B7E\u540D\u6536\u96C6\u8BF7\u6C42
   * @param clientId \u5BA2\u6237\u7F16\u53F7 (required)
   * @param body  (optional)
   * @return SignatureSummary
   * @throws ApiException if fails to make API call
   */
  public SignatureSummary createSignature(String clientId, Signature body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling createSignature");
    }
    
    // create path and map variables
    String localVarPath = "/clients/{clientId}/signatures".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<SignatureSummary> localVarReturnType = new GenericType<SignatureSummary>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u83B7\u53D6\u7B7E\u7F72\u56FE\u7247
   * \u83B7\u53D6\u7B7E\u7F72\u56FE\u7247
   * @param clientId \u5E94\u7528\u7CFB\u7EDF\u7F16\u53F7 (required)
   * @param signatureId \u7B7E\u540D\u7F16\u53F7 (required)
   * @return SignatureFile
   * @throws ApiException if fails to make API call
   */
  public SignatureFile getSignature(String clientId, String signatureId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling getSignature");
    }
    
    // create path and map variables
    String localVarPath = "/clients/{clientId}/signatures/{signatureId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<SignatureFile> localVarReturnType = new GenericType<SignatureFile>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
