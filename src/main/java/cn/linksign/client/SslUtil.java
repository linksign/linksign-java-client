package cn.linksign.client;

import javax.net.ssl.SSLContext;

import org.glassfish.jersey.SslConfigurator;

public class SslUtil {
	private static SslConfigurator sslConfig;

	// LinkSign SSL Config
	public static SSLContext getSSLContext() {
		if (sslConfig == null) {
//			sslConfig = SslConfigurator.newInstance();
//			sslConfig.keyStoreType(Configuration.keyStoreType);
//			sslConfig.keyStoreFile(Configuration.keyStoreFile)
//					.keyStorePassword(Configuration.keyStorePassword)
//					.keyPassword(Configuration.keyStorePassword);
//
//			sslConfig.trustStoreType(Configuration.trustStoreType)
//					.trustStoreFile(Configuration.trustStoreFile)
//					.trustStorePassword(Configuration.trustStorePassword);
//
//			sslConfig.securityProtocol(Configuration.securityProtocol);
		}
		SSLContext sslContext = sslConfig.createSSLContext();
		return sslContext;
	}
}
