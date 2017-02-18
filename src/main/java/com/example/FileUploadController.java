package com.example;

import java.nio.file.Paths;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> uploadFile(
	    @RequestParam("uploadfile") MultipartFile uploadfile) {
	  
	  try {
	    // Get the filename and build the local file path (be sure that the 
	    // application have write permissions on such directory)
	    String filename = uploadfile.getOriginalFilename();
	    String directory = "F:";
	    String filepath = Paths.get(directory, filename).toString();
	    
	    System.out.println(filepath);
	    boolean result=FileUploadUtil.validateFileExt(filepath.substring(filepath.lastIndexOf(".")+1),"csv");
	    
	    if(result==true)
	    {
	    	FileUploadUtil.uploadQns();
	    }
	    else
	    {
	    	return new ResponseEntity<>("Incorrect File Format.",HttpStatus.BAD_REQUEST);	
	    }
	    
	    System.out.println(uploadfile.getBytes());
	  }
	  catch (Exception e) {
	    System.out.println(e.getMessage());
	    return new ResponseEntity<>("Please try again.",HttpStatus.BAD_REQUEST);
	  }
	  
	  return new ResponseEntity<>("File uploaded successfully.",HttpStatus.OK);
	} // method uploadFile
}
