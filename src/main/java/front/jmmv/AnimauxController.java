package front.jmmv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnimauxController {
	
	@RequestMapping("/animaux")
    public String animaux(@RequestParam(value="name", required=false, defaultValue="wouf") String name, Model model) {
        model.addAttribute("name", name);
        return "animaux";
    }

}
