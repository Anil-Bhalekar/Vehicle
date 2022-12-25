package com.bla.bla.backend.repo.impl;

import org.springframework.stereotype.Component;


public class BatchRepoImplMysql implements com.bla.bla.backend.repo.BatchRepo {

	@Override
	public void printData() {
		System.out.println("BatchRepoImplMysql: Print method...");
		
	}

}
