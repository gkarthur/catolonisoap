package com.archi.repo.cap.catoloni.tools.java2wsdl;

import org.apache.cxf.tools.java2ws.JavaToWS;

public class JavaToWSDLGenerator {

	public static void main(String[] args) {
		
		try {			
		      JavaToWS.main(new String[] { "-d", "src/main/resources/soap12", "-o", "Catoloni.wsdl", "-soap12", "-createxsdimports", 
		    		  "-wsdl", "com.archi.repo.cap.catoloni.service.CatoloniServiceImpl" });
		      System.out.println("finished");
		    } catch (Exception e) {
		      e.printStackTrace();
		}
	}

}
