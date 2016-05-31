package cn.linksign.api.web;

import com.sun.jersey.api.client.GenericType;

 





import cn.linksign.api.model.SealSummary;
import cn.linksign.api.model.ApiError;
import cn.linksign.api.model.Seal;
import cn.linksign.api.model.SealFile;
import cn.linksign.client.ApiClient;
import cn.linksign.client.ApiException;
import cn.linksign.client.Configuration;
import cn.linksign.client.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T16:43:40.996+08:00")
public class SealApi {
  private ApiClient apiClient;

  public SealApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SealApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u521B\u5EFA\u4E00\u4E2A\u5370\u7AE0
   * \u521B\u5EFA\u4E00\u4E2A\u5370\u7AE0
   * @param clientId  (required)
   * @param body  (optional)
   * @return SealSummary
   * @throws ApiException if fails to make API call
   */
  public SealSummary createSeal(String clientId, Seal body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling createSeal");
    }
    
    // create path and map variables
    String localVarPath = "/clients/{clientId}/seals".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<SealSummary> localVarReturnType = new GenericType<SealSummary>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u83B7\u53D6\u4E00\u4E2A\u5370\u7AE0
   * \u83B7\u53D6\u4E00\u4E2A\u5370\u7AE0
   * @param clientId \u7CFB\u7EDF\u7F16\u53F7 (required)
   * @param sealId \u5370\u7AE0\u7F16\u53F7 (required)
   * @return SealFile
   * @throws ApiException if fails to make API call
   */
  public SealFile getSeal(String clientId, String sealId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getSeal");
    }
    
    // verify the required parameter 'sealId' is set
    if (sealId == null) {
      throw new ApiException(400, "Missing the required parameter 'sealId' when calling getSeal");
    }
    
    // create path and map variables
    String localVarPath = "/clients/{clientId}/seals/{sealId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
      .replaceAll("\\{" + "sealId" + "\\}", apiClient.escapeString(sealId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<SealFile> localVarReturnType = new GenericType<SealFile>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
