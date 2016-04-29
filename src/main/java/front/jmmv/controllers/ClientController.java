package front.jmmv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import front.jmmv.entities.Client;
import front.jmmv.models.ClientModel;
import front.jmmv.views.View;

@Controller
public class ClientController {
	
	@Autowired
	private ClientModel clientModel;
	
	@Autowired
	private View view;
	
	@RequestMapping("/client/{clientId}")
	public String client(@PathVariable(value="clientId") String clientId, Model model) {
		Client client = this.clientModel.findClient(Integer.parseInt(clientId));
		model.addAttribute("client", client);
		return this.view.render("client/client");
	}
	
	@RequestMapping("/clients")
	public String allClients(Model viewModel) {
		List<Client> clients = this.clientModel.findAllClients();
		viewModel.addAttribute("clients", clients);
		return this.view.render("client/all");
	}
	
	@RequestMapping("/client/edit/{clientId}")
	public String editClient(@PathVariable(value="clientId") String clientId, Model model) {
		Client client = this.clientModel.findClient(Integer.parseInt(clientId));
		model.addAttribute("client", client);
		return this.view.render("client/edit");
	}
	
	@RequestMapping("/client/add")
	public String addClient(Model model) {
		return this.view.render("client/add");
	}
}
