package com.example;

public class FileUploadUtil {
	
	public static boolean validateFileExt(String fileExt,String fileExtExpected)
	{
		boolean result=true;
		if(!fileExt.equals(fileExtExpected))
		{
			result=false;
		}
		return result;
	}

	public static void uploadQns() {
			//use some Excel Reader API
		
	}

}
