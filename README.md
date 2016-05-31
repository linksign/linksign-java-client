# 运行环境要求
Java 1.7 或更新.

# 安装
##Maven开发者
```
<dependency>
   <groupId>cn.linksign</groupId>
   <artifactId>linksign-java-client</artifactId>
   <version>1.0.0</version>
</dependency>
```
##Gradle开发者
```
compile "com.linksign:linksign-java-client:1.0.0"
```
##Android开发者
如果编译时发生重复定义错误，请在 build.gradle 加入以下模块
```
android {
   packagingOptions {
      pickFirst 'META-INF/services/javax.ws.rs.ext.MessageBodyReader’
      pickFirst 'META-INF/services/javax.ws.rs.ext.MessageBodyWriter’
      pickFirst 'META-INF/services/com.sun.jersey.spi.inject.InjectableProvider’
      pickFirst 'META-INF/jersey-module-version' pickFirst 'META-INF/NOTICE’
      pickFirst 'META-INF/LICENSE’
      pickFirst 'META-INF/services/com.fasterxml.jackson.databind.Module’
      pickFirst 'META-INF/services/com.fasterxml.jackson.core.ObjectCodec’
      pickFirst 'META-INF/services/com.fasterxml.jackson.core.JsonFactory’
   }
}
```
##其它
可以下载编译好的JAR包导入你的项目
* linksign-java-client-1.0.0
* 依赖包
#使用
```
@Test
    public void CreateDocumentTest()
    {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn:443/v1");
		
		Configuration.setDefaultApiClient(apiClient);
		
		DocumentApi resApi = new  DocumentApi();
		
		DocumentDefinition body = new DocumentDefinition();
		
	
		App app = new App();
		//业务返回URL
		app.setRedirectUri("https://api.cmbchina.com/response/callback"); 
		body.setApp(app);
		
		Document document = new Document();
		document.setDocumentBase64(this.encodeBase64File(testPdf));
		document.setName("对帐单");
		document.setFileExtension("pdf");
		List<Document> documents = new ArrayList<Document>();
		documents.add(document);
		body.setDocuments(documents);
		
		TextCustomField tf = new TextCustomField();
		tf.setFieldId("Text1");
		tf.setValue("小信科技");
		
		List<TextCustomField> textCustomFields = new ArrayList<TextCustomField>();

		textCustomFields.add(tf);
		
		tf = new TextCustomField();
		tf.setFieldId("Text2");
		tf.setValue("2016年1月");
		textCustomFields.add(tf);
		//填充自定义图片
		ImageCustomField imageField = new ImageCustomField();
		imageField.setFieldId("Text3");
		imageField.setSealId("734950196248576000");
		List<ImageCustomField> imageFields = new ArrayList<ImageCustomField>();
		imageFields.add(imageField);
		
		CustomFields customFields = new CustomFields();
		customFields.setTextCustomFields(textCustomFields);
		customFields.setImageCustomFields(imageFields);
		
		body.setCustomFields(customFields);
 		
		
		List<Company> companys = new ArrayList<Company>();
		Company company = new Company();
		company.setRecipientIndex("1");
		company.setOrgName("深圳小信科技有限公司");
		company.setOrgAuthorizerName("林永X");
		company.setOrgAuthorizerEmail("35xxx452@qq.com");
		company.setOrgAuthorizerPhone("138xxxxxxxx");
		companys.add(company);
		
		List<Personal> personals = new ArrayList<Personal>();
		Personal personal = new Personal();
		personal.setRecipientIndex("1");
		personal.setPersonName("林永X"); 
		personal.setPersonEmail("35XXX452@qq.com");
		personal.setPersonPhone("138XXXXXXXX");
		personals.add(personal);
		
		//SignHereTabs 签署区域设置
		Tabs tabs = new Tabs();
		List<SignHere> signHereTabs = new ArrayList<SignHere>();
		SignHere signHere = new SignHere();
		//公司签名区域
		signHere.setRecipientIndex("1");
		signHere.setTemplateSealFieldId("Signature4");
		signHere.setTemplateSignatureFieldId("Signature3");
		signHereTabs.add(signHere);

		//个人签名区域
		signHere = new SignHere();
		signHere.setRecipientIndex("1");
 		signHere.setTemplateSignatureFieldId("Signature1");		
		signHereTabs.add(signHere);
		
		
		tabs.setSignHereTabs(signHereTabs);
		
		
		Signers signers = new Signers();
		signers.setSignerCompanys(companys);//单位
		signers.setSignerPersons(personals);//个人
		signers.setTabs(tabs);//签署区域设置
		
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
```
