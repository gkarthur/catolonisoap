package com.archi.repo.cap.catoloni.domain;

import java.util.Collections;
import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Data Model Object de type backend
 * Utilise dans le formulaire
 * Ajout fonctions de validation via JSR 303 validation annotations
 *  
 * @author gahie
 *
 */
public class Catoloni {
	
	private Long id = 0L;
	
	@NotEmpty
	@Size(max=30)
	private String name;
	
	@NotEmpty
	private String ref;
	
	@Email @NotEmpty
	private String email;
		
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private String date;
	
    private String type;// champ de type select simple
    
    private List<String> aspets = Collections.emptyList();// champ de type select multiple   
	
    private boolean status;// champ de type checkbox
	
	
	/**
	 * 
	 */
	public Catoloni() {
		super();
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the ref
	 */
	public String getRef() {
		return ref;
	}
	/**
	 * @param ref the ref to set
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the aspets
	 */
	public List<String> getAspets() {
		return aspets;
	}
	/**
	 * @param aspets the aspets to set
	 */
	public void setAspets(List<String> aspets) {
		this.aspets = aspets;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Catoloni [id=" + id + ", name=" + name + ", ref=" + ref + ", email=" + email + ", date=" + date
				+ ", type=" + type + ", aspets=" + aspets + ", status=" + status + "]";
	}
	
	
}
