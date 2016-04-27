package front.jmmv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {
	
	@RequestMapping("/client")
	public String index(@RequestParam(value="id", required=false, defaultValue="World") String id, Model model){
		model.addAttribute("id", id);
		return " hi !!";
	}	
}
