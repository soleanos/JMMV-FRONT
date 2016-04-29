package front.jmmv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import front.jmmv.entities.Client;
import front.jmmv.models.ClientModel;
import front.jmmv.views.View;

@Controller
public class ClientController {
	
	@Autowired
	private ClientModel clientModel;
	
	@Autowired
	private View view;
	
	//@RequestMapping(value="/client/{clientId}", method = RequestMethod.GET)
	@RequestMapping("/client/{clientId}")
	public String client(@PathVariable(value="clientId") String clientId, Model model) {
		Client client = this.clientModel.findClient(Integer.parseInt(clientId));
		model.addAttribute("client", client);
		return this.view.render("client/client");
	}
	
	//@RequestMapping(value="/client", method = RequestMethod.GET)
	@RequestMapping("/client")
	public String allClients(Model model) {
		List<Client> clients = this.clientModel.findAllClients();
		model.addAttribute("clients", clients);
		return this.view.render("client/all");
	}
	
	//@RequestMapping(value="/client/edit/{clientId}", method = RequestMethod.PUT)
	@RequestMapping("/client/edit/{clientId}")
	public String editClient(@ModelAttribute("client") Client client, Model model) {
		this.clientModel.editClient(client);
		model.addAttribute("client", client);
		return this.view.render("client/edit");
	}
	
	//@RequestMapping(value="/client/add", method = RequestMethod.POST)
	@RequestMapping("/client/add")
	public String addClient(@ModelAttribute("client") Client client, Model model) {
		this.clientModel.addClient(client);
		model.addAttribute("client", client);
		return this.view.render("client/add");
	}
}
