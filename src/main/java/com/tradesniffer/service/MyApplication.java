package com.tradesniffer.service;

import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;

public class MyApplication extends Application {
//	@Override
//	public Set<Object> getSingletons() {
//		Set<Object> singletons = new HashSet<>();
//		// Driver do Jettison para gerar JSON.
//		singletons.add(new JettisonFeature());
//		return singletons;
//	}

	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();
		// Configura o pacote para fazer scan das classes com anotações REST.
		properties
				.put("jersey.config.server.provider.packages", "com.tradesniffer");
		return properties;
	}
}
