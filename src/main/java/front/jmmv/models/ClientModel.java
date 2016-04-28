package front.jmmv.models;

import org.springframework.web.client.RestTemplate;

import front.jmmv.entities.Client;

public class ClientModel {
	public Client getClient(int clientId) {
		RestTemplate restTemplate = new RestTemplate();
		Client client = restTemplate.getForObject("http://localhost/client1.json", Client.class);
		return client;
	}
}
