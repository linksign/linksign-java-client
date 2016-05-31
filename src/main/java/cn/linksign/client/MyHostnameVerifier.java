package cn.linksign.client;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class MyHostnameVerifier  implements HostnameVerifier {  
  
    @Override  
    public boolean verify(String hostname, SSLSession session) {  
        if("127.0.0.1".equals(hostname) || "localhost".equals(hostname) )  
            return true;  
        else  
            return false;  
    }  
}  