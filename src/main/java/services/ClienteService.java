package services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import models.Account;
import models.CardType;
import models.Client;
import persistence.Persistence;

public class ClienteService {
	
	public Client register(Client c){
		c.setIndentifier(UUID.randomUUID()); //BR: client unique identifier
		createAccount(c);
		return Persistence.addClient(c);
	}
	
	private void createAccount(Client c){
		Account account = new Account();
		account.setIdentifier(UUID.randomUUID());
		createCard(CardType.DEBIT);
		
		if(c.getAccounts() == null || c.getAccounts().isEmpty()){
			List<Account> accounts = new ArrayList<>();
			c.setAccounts(accounts);
		}
		c.getAccounts().add(account);
	}

	public List<Client> findAll(){
		return Persistence.findAllClients();
	}
	
	private void createCard(CardType debit){
		
	}
	
	

}
