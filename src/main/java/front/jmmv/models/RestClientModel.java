package front.jmmv.models;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import front.jmmv.entities.Client;
import front.jmmv.models.ClientModel;

public class RestClientModel implements ClientModel {
	public Client findClient(int clientId) {
		RestTemplate restTemplate = new RestTemplate();
		Client client = restTemplate.getForObject("http://localhost:8090/client/" + clientId, Client.class);
		return client;
	}
	
	public List<Client> findAllClients() {
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Client[]> responseEntity = restTemplate.getForEntity("http://localhost:8090/client/", Client[].class);
		return Arrays.asList(responseEntity.getBody());
	}
}
