package com.imooc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyFirstListener implements ServletContextListener {
//test
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context destroyed... ...");

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context initialized... ...");
		System.out.println("test");

	}

}
