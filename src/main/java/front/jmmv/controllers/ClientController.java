package front.jmmv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import front.jmmv.entities.Client;
import front.jmmv.models.ClientModel;


@Controller
@RequestMapping("/client/{clientId}")
public class ClientController {
	
	ClientModel clientModel;
	
	public ClientController() {
		this.clientModel = new ClientModel();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String client(@PathVariable(value="clientId") String clientId, Model model) {
		Client client = clientModel.getClient(Integer.parseInt(clientId));
		model.addAttribute("client", client);
		return "client";
	}
	
}
