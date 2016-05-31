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

import com.sun.jersey.core.util.Base64;

import cn.linksign.api.model.App;
import cn.linksign.api.model.Company;
import cn.linksign.api.model.CustomFields;
import cn.linksign.api.model.Document;
import cn.linksign.api.model.DocumentDefinition;
import cn.linksign.api.model.DocumentStatus;
import cn.linksign.api.model.DocumentSummary;
import cn.linksign.api.model.ImageCustomField;
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
import cn.linksign.client.ApiClient;
import cn.linksign.client.ApiException;
import cn.linksign.client.Configuration;


public class SDKUnitTests {
	
	//LinkSign ClientId
	private static String clientId = "xxxxxxxxxxxxxxxxxxxxx";
	  //LinkSign Client API cert  
	  private static String keyPassword = "xxxxxx";
	  //Cert PIN
	  private static String keyPath = "C:\\Users\\lam\\work\\LinkSign\\LinkSignClientAPI.pfx";
	  private static String testPdf = "C:\\Users\\lam\\work\\test.pdf";


	  public static String encodeBase64File(String path)   {
	    	FileInputStream inputFile = null;
	    	try{
	    		
			     File file = new File(path);
			     inputFile = new FileInputStream(file);
			     byte[] buffer = new byte[(int) file.length()];
			     inputFile.read(buffer);
			     inputFile.close();
			     return new String(Base64.encode(buffer));     
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
    public void CreateSealTest() {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn/v1");
		Configuration.setDefaultApiClient(apiClient);

  		SealApi resApi = new SealApi();
  		
		Company company = new Company();
		company.setOrgName("����С�ſƼ�");
		
  		Seal seal = new Seal(); 
  		seal.setCompany(company);
  		seal.setRedirectUri("https://www.linksign.cn");
 
		try {
			SealSummary result = resApi.createSeal(clientId, seal);
 			Assert.assertNotNull(result);
 			Assert.assertNotNull(result.getSealFileUri());
 			System.out.println(result.getSealFileUri());
 			System.out.println(result.getSealerRedirectUri());
 			System.out.println(result.getSealId());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
		}
    }
    
    @Test
    public void CreateSignatureTest() {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn/v1");
		Configuration.setDefaultApiClient(apiClient);
		

		
		SignatureApi resApi = new SignatureApi();
  		
		Personal personal = new Personal();
		personal.setPersonName("С��");
		
		Signature signature = new Signature(); 
		signature.setPersonal(personal);
		signature.setRedirectUri("https://www.linksign.cn");
 
		try {
			 SignatureSummary result = resApi.createSignature(clientId, signature);
 			Assert.assertNotNull(result);
 			Assert.assertNotNull(result.getSignatureFileUri());
 	
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
			 
		}
    }
    
    
    @Test
    public void CreateHtmlDocumentTest()
    {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn:443/v1");
		
		Configuration.setDefaultApiClient(apiClient);
		
		DocumentApi resApi = new  DocumentApi();
		
		DocumentDefinition body = new DocumentDefinition();
		
	
		Document document = new Document();
		document.setDocumentBase64(this.encodeBase64File(""));
		document.setName("Html�ĵ�");
		document.setFileExtension("html");
		List<Document> documents = new ArrayList<Document>();
		documents.add(document);
		body.setDocuments(documents);
		
		try {
			DocumentSummary summary = resApi.createDocument(clientId, body);
			Assert.assertNotNull(summary);

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
		
	
		App app = new App();
		//ҵ�񷵻�URL
		app.setRedirectUri("https://www.baidu.com");//����ʱ����� &documentId={documentId}&recipientIndex={recipientIndex}&signType={personal | company}
		body.setApp(app);
		
		Document document = new Document();
		document.setDocumentBase64(this.encodeBase64File(testPdf));
		document.setName("�����ĵ�");
		document.setFileExtension("pdf");
		List<Document> documents = new ArrayList<Document>();
		documents.add(document);
		body.setDocuments(documents);
		
		TextCustomField tf = new TextCustomField();
		tf.setFieldId("Text1");
		tf.setValue("Text1����ֵ");
		
		List<TextCustomField> textCustomFields = new ArrayList<TextCustomField>();

		textCustomFields.add(tf);
		
		tf = new TextCustomField();
		tf.setFieldId("Text2");
		tf.setValue("Text2����ֵ");
		textCustomFields.add(tf);
		//����Զ���ͼƬ
		ImageCustomField imageField = new ImageCustomField();
		imageField.setFieldId("Text3");
		imageField.setSealId("734950196248576000");//734950196248576000 733563068365144064
		List<ImageCustomField> imageFields = new ArrayList<ImageCustomField>();
		imageFields.add(imageField);
		
		CustomFields customFields = new CustomFields();
		customFields.setTextCustomFields(textCustomFields);//����
		customFields.setImageCustomFields(imageFields);//ͼƬ
		
		body.setCustomFields(customFields);//�Զ����ֶ� 
 		
		
		List<Company> companys = new ArrayList<Company>();
		Company company = new Company();
		company.setRecipientIndex("1");
		company.setOrgName("����С�ſƼ����޹�˾");
		company.setOrgAuthorizerName("������");
		company.setOrgAuthorizerEmail("35081452@qq.com");
		company.setOrgAuthorizerPhone("13828737452");
		companys.add(company);
		
		List<Personal> personals = new ArrayList<Personal>();
		Personal personal = new Personal();
		personal.setRecipientIndex("1");
		personal.setPersonName("������"); 
		personal.setPersonEmail("35081452@qq.com");
		personal.setPersonPhone("13828737452");
		personals.add(personal);
		
		//SignHereTabs ǩ����������
		Tabs tabs = new Tabs();
		List<SignHere> signHereTabs = new ArrayList<SignHere>();
		SignHere signHere = new SignHere();
		//��˾ǩ������
		signHere.setRecipientIndex("1");//ǩ���������ţ���Ӧ����ĵ�λ������
		signHere.setTemplateSealFieldId("Signature4");
		signHere.setTemplateSignatureFieldId("Signature3");
		signHereTabs.add(signHere);

		//����ǩ������
		signHere = new SignHere();
		signHere.setRecipientIndex("1");//ǩ���������ţ���Ӧ����ĸ���������
 		signHere.setTemplateSignatureFieldId("Signature1");		
		signHereTabs.add(signHere);
		
		
		tabs.setSignHereTabs(signHereTabs);
		
		
		Signers signers = new Signers();
		signers.setSignerCompanys(companys);//��λ
		signers.setSignerPersons(personals);//����
		signers.setTabs(tabs);//ǩ����������
		
 		body.setSigners(signers);
		try {
			DocumentSummary summary = resApi.createDocument(clientId, body);
			Assert.assertNotNull(summary);
			Assert.assertNotNull(summary.getDocumentId());
			Assert.assertNotNull(summary.getDocumentStatus());
			Assert.assertNotNull(summary.getDocumentStatus().getCompanySignerStatus());
			Assert.assertNotNull(summary.getDocumentStatus().getPersonalSignerStatus());
 			System.out.println(summary.getDocumentId());//�ĵ����
			System.out.println(summary.getDocumentStatus().getCompanySignerStatus().get(0).getSignerUri());//��˾�� Ȩ��ǩ��URL			
			System.out.println(summary.getDocumentStatus().getPersonalSignerStatus().get(0).getSignerUri());//����ǩ��URL

		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(null, e);
		}
    }
    /**
     * ��ģ����ǩ���ļ�
     */
    @Test
    public void CreateDocumentByTemplateTest()
    {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://tools.linksign.cn:1443/api");
		
		Configuration.setDefaultApiClient(apiClient);
		
		DocumentApi resApi = new  DocumentApi();
		
		DocumentDefinition body = new DocumentDefinition();
		
	
		App app = new App();
		//ҵ�񷵻�URL
		app.setRedirectUri("https://www.baidu.com");//����ʱ����� &documentId={documentId}&recipientIndex={recipientIndex}&signType={personal | company}
		body.setApp(app);
		
		TextCustomField tf = new TextCustomField();
		tf.setFieldId("Text1");
		tf.setValue("Text1����ֵ");
		
		List<TextCustomField> textCustomFields = new ArrayList<TextCustomField>();

		textCustomFields.add(tf);
		
		tf = new TextCustomField();
		tf.setFieldId("Text2");
		tf.setValue("Text2����ֵ");
		textCustomFields.add(tf);
		//����Զ���ͼƬ
		ImageCustomField imageField = new ImageCustomField();
		imageField.setFieldId("Text3");
		imageField.setSealId("734950196248576000");
		List<ImageCustomField> imageFields = new ArrayList<ImageCustomField>();
		imageFields.add(imageField);
		
		CustomFields customFields = new CustomFields();
		customFields.setTextCustomFields(textCustomFields);//����
		customFields.setImageCustomFields(imageFields);//ͼƬ
		
		body.setCustomFields(customFields);//�Զ����ֶ� 
		//ģ����
		body.setTemplateId("1");
		
		
		List<Company> companys = new ArrayList<Company>();
		Company company = new Company();
		company.setRecipientIndex("1");
		company.setOrgName("����С�ſƼ����޹�˾");
		company.setOrgAuthorizerName("������");
		company.setOrgAuthorizerEmail("35081452@qq.com");
		company.setOrgAuthorizerPhone("13828737452");
		companys.add(company);
		
		List<Personal> personals = new ArrayList<Personal>();
		Personal personal = new Personal();
		personal.setRecipientIndex("1");
		personal.setPersonName("������"); 
		personal.setPersonEmail("35081452@qq.com");
		personal.setPersonPhone("13828737452");
		personals.add(personal);
		
		//SignHereTabs ǩ����������
		Tabs tabs = new Tabs();
		List<SignHere> signHereTabs = new ArrayList<SignHere>();
		SignHere signHere = new SignHere();
		//��˾ǩ������
		signHere.setRecipientIndex("1");//ǩ���������ţ���Ӧ����ĵ�λ������
		signHere.setTemplateSealFieldId("Signature4");
		signHere.setTemplateSignatureFieldId("Signature1");
		signHereTabs.add(signHere);

		//����ǩ������
		signHere = new SignHere();
		signHere.setRecipientIndex("1");//ǩ���������ţ���Ӧ����ĸ���������
 		signHere.setTemplateSignatureFieldId("Signature3");		
		signHereTabs.add(signHere);
		
		
		tabs.setSignHereTabs(signHereTabs);
		
		
		Signers signers = new Signers();
		signers.setSignerCompanys(companys);//��λ
		signers.setSignerPersons(personals);//����
		signers.setTabs(tabs);//ǩ����������
		
 		body.setSigners(signers);
		try {
			DocumentSummary summary = resApi.createDocument(clientId, body);
			Assert.assertNotNull(summary);
			Assert.assertNotNull(summary.getDocumentId());
			Assert.assertNotNull(summary.getDocumentStatus());
			Assert.assertNotNull(summary.getDocumentStatus().getCompanySignerStatus());
			Assert.assertNotNull(summary.getDocumentStatus().getPersonalSignerStatus());

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
	public static void main(String[] args) throws ApiException {
		// TODO Auto-generated method stub
		
		 
	}

}
