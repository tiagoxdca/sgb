package models;

import java.util.List;
import java.util.UUID;

import lombok.*;


// @Data
//@AllArgsConstructor
//@Builder
//@NoArgsConstructor
public class Client {
	
	private UUID indentifier;
	
	private String name;
	
	private String internalNumber;
	
	private String email;
	
	List<Account> accounts;
	
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public UUID getIndentifier() {
		return indentifier;
	}
	public void setIndentifier(UUID indentifier) {
		this.indentifier = indentifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInternalNumber() {
		return internalNumber;
	}
	public void setInternalNumber(String internalNumber) {
		this.internalNumber = internalNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
