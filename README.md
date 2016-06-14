# 运行环境要求
Java 1.7 或更新.

# 导入领签的接口CA根证书
在调用API之前，需要将领签的CA根证书导入到JDK运行环境
//进入到jre\lib\security目录下 
敲入如下命令回车执行 :
```
keytool -import -alias api.linksign.cn -keystore cacerts -file rootca.cer -trustcacerts 
```

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
* [linksign-java-client-1.0.0](https://github.com/linksign/linksign-java-client/blob/master/target/linksign-java-client-1.0.0.jar)JAR包
* [相关依赖包](https://github.com/linksign/linksign-java-client/tree/master/target/lib)目录

# 使用

```
@Test
    public void CreateSealByImageTest() {
    	ApiClient apiClient = new ApiClient(keyPath, keyPassword);
		apiClient.setBasePath("https://api.linksign.cn:443/api");
		Configuration.setDefaultApiClient(apiClient);

  		SealApi resApi = new SealApi();
  		
		try {
			Company company = new Company(); //创建公司基本信息
			company.setOrgName("深圳小信科技");//公司名称必填
			company.setOrgSealImageBase64(this.encodeBase64File(testSeal));//用户上传的印章图片（Base64编码）
	  		Seal seal = new Seal(); 
	  		seal.setCompany(company);
			SealSummary result = resApi.createSeal(clientId, seal);
 			Assert.assertNotNull(result);
 			Assert.assertNotNull(result.getSealFileUri());
			System.out.println(result.getSealId());
			System.out.println(result.getSealFileUri());

  			if(result.getImagePngBase64()!=null)//处理后的图片文件（Base64编码）
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

```
## 更多示例
* [示例文件](https://github.com/linksign/linksign-java-client/tree/master/src/test/java/SDKUnitTests.java)
# 调试工具
访问此链接需要先安装领签的客户端数字证书。
* https://api.linksign.cn/v1/debug

# 详细的接口文档和技术支持,请联系我们

* https://www.linksign.cn
