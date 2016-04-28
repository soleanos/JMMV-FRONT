package front.jmmv.models;

import front.jmmv.entities.Client;

public class ClientModel {
	public Client getClient(int clientId) {
		Client client = new Client();
		client.setId(clientId);
		client.setPrenom("tom");
		client.setNom("phi");
		return client;
	}
}
