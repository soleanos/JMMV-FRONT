package front.jmmv.models;

import java.util.List;

import front.jmmv.entities.Client;

public interface ClientModel {
	public Client findClient(int clientId);
	
	public List<Client> findAllClients();
}
