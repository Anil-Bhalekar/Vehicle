package com.bla.bla.backend.service;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class FileService {

	private final String IMAGE_REPO_PATH = "bla-bla-backend/bla-bla-data/images/";

	public String saveImageFile(byte[] data, String entity) throws IOException {

		String profilePhotoPath = IMAGE_REPO_PATH + entity + "/" + UUID.randomUUID().toString() + ".png";


		ClassLoader classLoader = getClass().getClassLoader();
//		classLoader.
		
		FileUtils.writeByteArrayToFile(new File(profilePhotoPath), data);
		
		
		
		

		return profilePhotoPath;
	}


}
