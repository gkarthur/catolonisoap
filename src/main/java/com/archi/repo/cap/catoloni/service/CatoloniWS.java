package com.archi.repo.cap.catoloni.service;

import org.apache.cxf.feature.Features;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.archi.repo.cap.catoloni.beans.CatoloniServiceImplPortType;

@javax.jws.WebService(serviceName = "CatoloniServiceImpl", portName = "CatoloniServiceImplPort", targetNamespace = "http://service.catoloni.cap.repo.archi.com/", endpointInterface = "com.archi.repo.cap.catoloni.beans.CatoloniServiceImplPortType") 
public class CatoloniWS implements CatoloniServiceImplPortType {

	private final static Logger LOG = LoggerFactory.getLogger(CatoloniWS.class);
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.archi.repo.cap.catoloni.beans.CatoloniServiceImplPortType#getById(
	 * java.lang.Long id)*
	 */
	public com.archi.repo.cap.catoloni.beans.Catoloni getById(java.lang.Long id) {
		LOG.info("Executing operation getById");
		System.out.println(id);
		try {
			com.archi.repo.cap.catoloni.beans.Catoloni _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.archi.repo.cap.catoloni.beans.CatoloniServiceImplPortType#getList()*
	 */
	public java.util.List<com.archi.repo.cap.catoloni.beans.Catoloni> getList() {
		LOG.info("Executing operation getList");
		try {
			java.util.List<com.archi.repo.cap.catoloni.beans.Catoloni> _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

}
