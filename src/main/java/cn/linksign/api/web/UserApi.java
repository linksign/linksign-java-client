package cn.linksign.api.web;

import com.sun.jersey.api.client.GenericType;








import cn.linksign.api.model.CompanyAuthSummary;
import cn.linksign.api.model.ApiError;
import cn.linksign.api.model.PersonAuth;
import cn.linksign.api.model.PersonAuthSummary;
import cn.linksign.api.model.Company;
import cn.linksign.api.model.Bank;
import cn.linksign.api.model.Personal;
import cn.linksign.client.ApiClient;
import cn.linksign.client.ApiException;
import cn.linksign.client.Configuration;
import cn.linksign.client.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-13T18:23:01.698+08:00")
public class UserApi {
  private ApiClient apiClient;

  public UserApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * PostPersonaAuth
   * 
   * @param clientId  (required)
   * @param body  (optional)
   * @return PersonAuthSummary
   * @throws ApiException if fails to make API call
   */
  public PersonAuthSummary createPersonAuth(String clientId, PersonAuth body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling createPersonAuth");
    }
    
    // create path and map variables
    String localVarPath = "/clients/{clientId}/persons/auth".replaceAll("\\{format\\}","json")
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

    
    GenericType<PersonAuthSummary> localVarReturnType = new GenericType<PersonAuthSummary>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * getCompanyAuthStatus
   * 
   * @param clientId ClientId (required)
   * @param companyId Company Id (required)
   * @return CompanyAuthSummary
   * @throws ApiException if fails to make API call
   */
  public CompanyAuthSummary getClientsClientIdCompanysCompanyIdAuth(String clientId, String companyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getClientsClientIdCompanysCompanyIdAuth");
    }
    
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(400, "Missing the required parameter 'companyId' when calling getClientsClientIdCompanysCompanyIdAuth");
    }
    
    // create path and map variables
    String localVarPath = "/clients/{clientId}/companys/{companyId}/auth".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
      .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()));

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

    
    GenericType<CompanyAuthSummary> localVarReturnType = new GenericType<CompanyAuthSummary>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * getPersonAuthStatus
   * 
   * @param clientId  (required)
   * @param personId  (required)
   * @return PersonAuthSummary
   * @throws ApiException if fails to make API call
   */
  public PersonAuthSummary getPersonAuthStatus(String clientId, String personId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getPersonAuthStatus");
    }
    
    // verify the required parameter 'personId' is set
    if (personId == null) {
      throw new ApiException(400, "Missing the required parameter 'personId' when calling getPersonAuthStatus");
    }
    
    // create path and map variables
    String localVarPath = "/clients/{clientId}/persons/{personId}/auth".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
      .replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

    
    GenericType<PersonAuthSummary> localVarReturnType = new GenericType<PersonAuthSummary>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * PostCompanyAuth
   * 
   * @param clientId Client Id (required)
   * @param body  (optional)
   * @return CompanyAuthSummary
   * @throws ApiException if fails to make API call
   */
  public CompanyAuthSummary postClientsClientIdCompanysAuth(String clientId, Company body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling postClientsClientIdCompanysAuth");
    }
    
    // create path and map variables
    String localVarPath = "/clients/{clientId}/companys/auth".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

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

    
    GenericType<CompanyAuthSummary> localVarReturnType = new GenericType<CompanyAuthSummary>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * PostBankInfo
   * 
   * @param clientId clientId (required)
   * @param companyId companyId (required)
   * @param body  (optional)
   * @return CompanyAuthSummary
   * @throws ApiException if fails to make API call
   */
  public CompanyAuthSummary postClientsClientIdCompanysCompanyIdAuthBank(String clientId, String companyId, Bank body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling postClientsClientIdCompanysCompanyIdAuthBank");
    }
    
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      throw new ApiException(400, "Missing the required parameter 'companyId' when calling postClientsClientIdCompanysCompanyIdAuthBank");
    }
    
    // create path and map variables
    String localVarPath = "/clients/{clientId}/companys/{companyId}/auth/bank".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()))
      .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()));

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

    
    GenericType<CompanyAuthSummary> localVarReturnType = new GenericType<CompanyAuthSummary>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
