package com.tradesniffer;

import org.springframework.beans.factory.InitializingBean;

public class SystemSetup implements InitializingBean
{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Servidor iniciado");
	}

}
