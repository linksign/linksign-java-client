import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.linksign.api.model.App;
import cn.linksign.api.model.Company;
import cn.linksign.api.model.CustomFields;
import cn.linksign.api.model.Document;
import cn.linksign.api.model.DocumentDefinition;
import cn.linksign.api.model.DocumentStatus;
import cn.linksign.api.model.DocumentSummary;
import cn.linksign.api.model.ImageCustomField;
import cn.linksign.api.model.PersonAuth;
import cn.linksign.api.model.PersonAuthSummary;
import cn.linksign.api.model.Personal;
import cn.linksign.api.model.Seal;
import cn.linksign.api.model.SealSummary;
import cn.linksign.api.model.SignHere;
import cn.linksign.api.model.Signature;
import cn.linksign.api.model.SignatureSummary;
import cn.linksign.api.model.Signers;
import cn.linksign.api.model.Tabs;
import cn.linksign.api.model.TextCustomField;
import cn.linksign.api.web.DocumentApi;
import cn.linksign.api.web.SealApi;
import cn.linksign.api.web.SignatureApi;
import cn.linksign.api.web.UserApi;
import cn.linksign.client.ApiClient;
import cn.linksign.client.ApiException;
import cn.linksign.client.Configuration;

import com.migcomponents.migbase64.Base64;


public class SDKUnitTests {
	
	
	//LinkSign ClientId
	private static String clientId = "xxxx";
	  //LinkSign Client API cert  
	  private static String keyPassword = "xxxx";
	  //LinkSign Client API    Cert PIN
	  private static String keyPath = System.getProperty("user.dir") +"/res/LinksignClientAPI.pfx";
	  private static String testPdf = System.getProperty("user.dir") +"/res/sample.pdf";
	  private static String testSeal = System.getProperty("user.dir") +"/res/sample.bmp";
	  private static String testHtml =  System.getProperty("user.dir") +"/res/sample.html";

 
 	  public static String encodeBase64File(String path)   {
	    	FileInputStream inputFile = null;
	    	try{
	    		
			     File file = new File(path);
			     inputFile = new FileInputStream(file);
			     byte[] buffer = new byte[(int) file.length()];
			     inputFile.read(buffer);
			     inputFile.close();
			     return Base64.encodeToString(buffer, true);     
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	        	return null;

	    	}finally{
	    		if(inputFile!=null)
					try {
						inputFile.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
			        	return null;

					}

	    	}
	    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    
    @Test
    public void CreateSealByImageTest() {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn:443/v1");
		Configuration.setDefaultApiClient(apiClient);

  		SealApi resApi = new SealApi();
  		
		try {
			Company company = new Company();
			company.setOrgName("深圳小信科技");
			company.setOrgSealImageBase64(this.encodeBase64File(testSeal));
	  		Seal seal = new Seal(); 
	  		seal.setCompany(company);
//	  		seal.setRedirectUri("https://www.linksign.cn");
			SealSummary result = resApi.createSeal(clientId, seal);
 			Assert.assertNotNull(result);
 			Assert.assertNotNull(result.getSealFileUri());
			System.out.println(result.getSealId());
			System.out.println(result.getSealFileUri());

  			if(result.getImagePngBase64()!=null)
 			{
 					File tmp = File.createTempFile("SEAL", ".png");
					String b64 = result.getImagePngBase64();
 
 
  					decoderBase64File(b64, tmp.getPath());
 
 	                // show the PDF
	                Desktop.getDesktop().open(tmp);

 			} 
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);

		}  
    }
    
    @Test
    public void CreateSealTest() {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn:443/v1");
		Configuration.setDefaultApiClient(apiClient);

  		SealApi resApi = new SealApi();
  		
		
  	 
		try {
			Company company = new Company();
			company.setOrgName("深圳小信科技");
	  		Seal seal = new Seal(); 
	  		seal.setCompany(company);
	  		seal.setRedirectUri("https://www.linksign.cn");
			SealSummary result = resApi.createSeal(clientId, seal);
 			Assert.assertNotNull(result);
 			Assert.assertNotNull(result.getSealFileUri());
 			Assert.assertNotNull(result.getSealerRedirectUri());

		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);

		}  
    }
    
    public static boolean decoderBase64File(String base64Code, String targetPath)
	   {
			FileOutputStream out = null;
			try {
				byte[] buffer =  Base64.decode(base64Code.getBytes());
				out = new FileOutputStream(targetPath);
				out.write(buffer);
				out.close();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}finally{
				if (out != null)
					try {
						out.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	 	}
    @Test
    public void CreateSignatureTest() {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn/v1");
		Configuration.setDefaultApiClient(apiClient);
		

		
		SignatureApi resApi = new SignatureApi();
  		
		Personal personal = new Personal();
		personal.setPersonName("小X明");
		
		Signature signature = new Signature(); 
		signature.setPersonal(personal);
		signature.setRedirectUri("https://www.linksign.cn");
 
		try {
			 SignatureSummary result = resApi.createSignature(clientId, signature);
 			Assert.assertNotNull(result);
 			Assert.assertNotNull(result.getSignatureFileUri());
 			System.out.println(result.getSignerRedirectUri());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
			 
		}
    }
    
     
    @Test
    public void CreateDocumentTest()
    {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn:443/v1");
		
		Configuration.setDefaultApiClient(apiClient);
		
		DocumentApi resApi = new  DocumentApi();
		
		DocumentDefinition body = new DocumentDefinition();
 
		
		Document document = new Document();
		document.setDocumentBase64(this.encodeBase64File(testPdf));
		document.setName("测试文档");
		document.setFileExtension("pdf");
		List<Document> documents = new ArrayList<Document>();
		documents.add(document);
		body.setDocuments(documents);
		
		TextCustomField tf = new TextCustomField();
		tf.setFieldId("Text1");
		tf.setValue("Text1测试值");
		
		List<TextCustomField> textCustomFields = new ArrayList<TextCustomField>();

		textCustomFields.add(tf);
		
		tf = new TextCustomField();
		tf.setFieldId("Text2");
		tf.setValue("Text2测试值");
		textCustomFields.add(tf);
 
//		
		CustomFields customFields = new CustomFields();
		customFields.setTextCustomFields(textCustomFields);//文字
 //		
		body.setCustomFields(customFields);//自定义字段 
 		
		
		List<Company> companys = new ArrayList<Company>();
		Company company = new Company();
		company.setRecipientIndex("1");
		company.setOrgName("深圳小信科技有限公司");
		company.setOrgAuthorizerName("林X琼");
		company.setOrgAuthorizerEmail("35XXXX52@qq.com");
		company.setOrgAuthorizerPhone("138XXXXX452");
		companys.add(company);
		
 
		
		//SignHereTabs 签署区域设置
		Tabs tabs = new Tabs();
		List<SignHere> signHereTabs = new ArrayList<SignHere>();
		SignHere signHere = new SignHere();
		//公司签名区域
		signHere.setRecipientIndex("1");//签署人索引号，对应上面的单位索引号
		signHere.setTemplateSealFieldId("Signature3");
//		signHere.setTemplateSignatureFieldId("Signature4");
		signHere.setSealId("740449583942860800");//需调用采集印章接口提前生成
//		signHere.setSignatureId("733563068365144064");//需调用采集签名接口提前生成
		signHereTabs.add(signHere);

 
		tabs.setSignHereTabs(signHereTabs);
		
		
		Signers signers = new Signers();
		signers.setSignerCompanys(companys);//单位
//		signers.setSignerPersons(personals);//个人
		signers.setTabs(tabs);//签署区域设置
		
 		body.setSigners(signers);
		try {
			DocumentSummary summary = resApi.createDocument(clientId, body);
			Assert.assertNotNull(summary);
			Assert.assertNotNull(summary.getDocumentId());
			Assert.assertNotNull(summary.getDocumentStatus());
			Assert.assertNotNull(summary.getDocumentStatus().getCompanySignerStatus());
			Assert.assertNotNull(summary.getDocumentStatus().getPersonalSignerStatus());
 			System.out.println(summary.getDocumentId());//文档编号
 			System.out.println(summary.getUri());//文档编号

 			System.out.println(summary.getDocumentStatus().getStatus());//文档状态
			System.out.println(summary.getDocumentStatus().getCompanySignerStatus().get(0).getSignerUri());//公司授 权人签署URL			
			System.out.println(summary.getDocumentStatus().getPersonalSignerStatus().get(0).getSignerUri());//个人签署URL

		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
		}
    }
     
    
    @Test
    public void GetDocumentTest()
    {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn/v1");
		Configuration.setDefaultApiClient(apiClient);
		
		DocumentApi resApi = new  DocumentApi();
		try {
		String	documentId = "735763165094084608";
		 byte[] pdfBytes = 	resApi.getDocument(clientId, documentId);
			  try
	             {
	                 
	                File pdfFile = File.createTempFile("ds_", "pdf", null);
	                FileOutputStream fos = new FileOutputStream(pdfFile);
	                fos.write(pdfBytes);
	                
	                // show the PDF
	                Desktop.getDesktop().open(pdfFile);

	                
	             }
	             catch (Exception ex)
	             {
	                 Assert.fail("Could not create pdf File");

	             }
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
		}
    }
    
    @Test
    public void GetDocumentStatusTest()
    {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn:443/v1");
		Configuration.setDefaultApiClient(apiClient);
		
		DocumentApi resApi = new  DocumentApi();
		try {
		String	documentId = "a3a9d6d23a6f4fac9230125aab048494";
		DocumentStatus documentStatus = 	resApi.getDocumentStatus(clientId, documentId);
		Assert.assertNotNull(documentStatus);
		Assert.assertNotNull(documentStatus.getStatus());
		System.out.println(documentStatus.getStatus());
		System.out.println(documentStatus.getCompanySignerStatus().get(0).getStatus());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
		}
    }
    
    @Test
    public void CreatePersonAuth()
    {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn:443/v1");
		Configuration.setDefaultApiClient(apiClient);
		UserApi resApi = new UserApi();
		try {
			PersonAuth body = new PersonAuth();
			App app = new App();
			app.setRedirectUri("https://www.linksign.cn");
			body.setApp(app);
			
			Personal personal = new Personal();
			personal.setPersonName("林XX");//姓名（必填）
			personal.setPersonIdcardNumber("44XXXXXXXXXXXXXX");//身份证（必填）
			body.setPersonal(personal);
			
			PersonAuthSummary personAuthSummary = resApi.createPersonAuth(clientId, body);
			System.out.println(personAuthSummary.getPersonId());//认证用户编号
			System.out.println(personAuthSummary.getRedirectUri());//领签认证链接
			System.out.println(personAuthSummary.getWechatStatus());//微信认证状态
			System.out.println(personAuthSummary.getBankingStatus());//银行认证状态

		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
		}
    }
    
    @Test
    public void GetPersonAuthStatus()
    {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn:443/v1");
		Configuration.setDefaultApiClient(apiClient);
		UserApi resApi = new UserApi();
		try {
			  
			String personId = "xxxxxx";
			PersonAuthSummary personAuthSummary = resApi.getPersonAuthStatus(clientId, personId);
			System.out.println(personAuthSummary.getPersonId());//认证用户编号
			System.out.println(personAuthSummary.getRedirectUri());//领签认证链接
			System.out.println(personAuthSummary.getWechatStatus());//微信认证状态
			System.out.println(personAuthSummary.getBankingStatus());//银行认证状态

		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
		}
    }
	public static void main(String[] args) throws ApiException {
		// TODO Auto-generated method stub
		
		 
	}

}
