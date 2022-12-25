package com.bla.bla.backend.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bla.bla.backend.req.view.UserRequstView;
import com.bla.bla.backend.resp.view.APIResponseView;
import com.bla.bla.backend.resp.view.UserResponseView;
import com.bla.bla.backend.service.FileService;
import com.bla.bla.backend.service.UserService;
import com.bla.bla.backend.util.HttpStatusCode;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private FileService fileService;

	@RequestMapping(value = "/byId/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> findById(@PathVariable("id") Integer id) throws JsonProcessingException {
		try {
			System.out.println("User Controller: findById method");
			System.out.println("UserId: " + id);
			UserResponseView userResponseView = userService.findById(id);
			System.out.println("User name: " + userResponseView.getFirstName());
			APIResponseView apiResponseView = new APIResponseView(userResponseView, "Data found successfuly",
					HttpStatusCode.DATA_FOUND.name(), HttpStatusCode.DATA_FOUND.getSTatusCode());
			return new ResponseEntity<Object>(apiResponseView, HttpStatus.FOUND);
		} catch (Exception e) {
			e.printStackTrace();
			APIResponseView apiResponseView = new APIResponseView(e.getMessage(), HttpStatusCode.DATA_NOT_FOUND.name(),
					HttpStatusCode.DATA_NOT_FOUND.getSTatusCode());
			return new ResponseEntity<Object>(apiResponseView, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> save(@RequestBody UserRequstView userRequstView) {

		try {
			System.out.println("User Controller: save method");
			System.out.println("Saving user for firstname: " + userRequstView.getFirstName());

			UserResponseView userResponseView = userService.save(userRequstView);

			APIResponseView apiResponseView = new APIResponseView(userResponseView, "Data saved successfuly",
					HttpStatusCode.DATA_SAVED_SUCCCESSFULLY.name(),
					HttpStatusCode.DATA_SAVED_SUCCCESSFULLY.getSTatusCode());

			return new ResponseEntity<Object>(apiResponseView, HttpStatus.CREATED);

		} catch (Exception e) {
			e.printStackTrace();
			APIResponseView apiResponseView = new APIResponseView(e.getMessage(),
					HttpStatusCode.FAILED_TO_SAVE_DATA.name(), HttpStatusCode.FAILED_TO_SAVE_DATA.getSTatusCode());
			return new ResponseEntity<Object>(apiResponseView, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/multipart", method = RequestMethod.POST, headers = "content-type=multipart/form-data", produces = "application/json")
	public ResponseEntity<Object> saveMulitpart(
			@RequestParam("profilePhoto") MultipartFile profilePhoto,
			@RequestParam("aadharPhoto") MultipartFile aadharPhoto,
			@RequestParam("bio") String bio,
			@RequestParam("userRequestView") String userRequestView) {

		try {
			System.out.println("User Controller: save method");
			System.out.println("profilePhoto getOriginalFilename: " + profilePhoto.getOriginalFilename());
			System.out.println("profilePhoto getContentType: " + profilePhoto.getContentType());
			System.out.println("profilePhoto getSize: " + profilePhoto.getSize());
			System.out.println("profilePhoto getBytes: " + profilePhoto.getBytes());
			System.out.println("profilePhoto getClass: " + profilePhoto.getClass());
			
			
			System.out.println("aadharPhoto getOriginalFilename: " + aadharPhoto.getOriginalFilename());
			System.out.println("bio: " + bio);
			System.out.println("Saving user for userRequestView: " + userRequestView);

			
			
			// saving file in local memory 
			
			
			String profilePhotoPath = fileService.saveImageFile(profilePhoto.getBytes(), "users");
			
			
			System.out.println("profilePhotoPath: " + profilePhotoPath);
			
			
			
			
			
			
			
			
			UserRequstView userRequstView = new ObjectMapper().readValue(userRequestView, UserRequstView.class);
			
			UserResponseView userResponseView = userService.save(userRequstView);

			APIResponseView apiResponseView = new APIResponseView(userResponseView, "Data saved successfuly",
					HttpStatusCode.DATA_SAVED_SUCCCESSFULLY.name(),
					HttpStatusCode.DATA_SAVED_SUCCCESSFULLY.getSTatusCode());

			return new ResponseEntity<Object>(apiResponseView, HttpStatus.CREATED);

		} catch (Exception e) {
			e.printStackTrace();
			APIResponseView apiResponseView = new APIResponseView(e.getMessage(),
					HttpStatusCode.FAILED_TO_SAVE_DATA.name(), HttpStatusCode.FAILED_TO_SAVE_DATA.getSTatusCode());
			return new ResponseEntity<Object>(apiResponseView, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	
	
	
	
	
	

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Object> deleteById(@PathVariable("id") Integer id) {
		try {

			System.out.println("User Controller: Delete method");
			System.out.println("User delete by userId : " + id);

			long count = userService.deleteById(id);
			APIResponseView apiResponseView = new APIResponseView(null, "Data deleted successfuly",
					HttpStatusCode.DATA_DELETED_SUCCCESSFULLY.name(),
					HttpStatusCode.DATA_DELETED_SUCCCESSFULLY.getSTatusCode());

			return new ResponseEntity<Object>(apiResponseView, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			APIResponseView apiResponseView = new APIResponseView(e.getMessage(),
					HttpStatusCode.FAILED_TO_SAVE_DATA.name(), HttpStatusCode.FAILED_TO_SAVE_DATA.getSTatusCode());
			return new ResponseEntity<Object>(apiResponseView, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Object> deleteById1(@PathVariable("id") Integer id) {
		try {

			System.out.println("User Controller: Delete method");
			System.out.println("User delete by userId : " + id);

			long count = userService.deleteById2(id);
			System.out.println("count: " + count);
			APIResponseView apiResponseView = null;
			if (count >= 1) {

				apiResponseView = new APIResponseView(null, "Data deleted successfuly",
						HttpStatusCode.DATA_DELETED_SUCCCESSFULLY.name(),
						HttpStatusCode.DATA_DELETED_SUCCCESSFULLY.getSTatusCode());
			} else {
				apiResponseView = new APIResponseView(null, "Failed to deleted data",
						HttpStatusCode.FAILED_TO_DELETE_DATA.name(),
						HttpStatusCode.FAILED_TO_DELETE_DATA.getSTatusCode());
			}
			return new ResponseEntity<Object>(apiResponseView, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			APIResponseView apiResponseView = new APIResponseView(e.getMessage(),
					HttpStatusCode.FAILED_TO_SAVE_DATA.name(), HttpStatusCode.FAILED_TO_SAVE_DATA.getSTatusCode());
			return new ResponseEntity<Object>(apiResponseView, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
