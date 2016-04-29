package front.jmmv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import front.jmmv.models.ClientModel;
import front.jmmv.models.RestClientModel;
import front.jmmv.views.View;
import front.jmmv.views.ThymeleafView;

@Configuration
public class ApplicationConfig {
	@Bean
	public ClientModel getClientModel() {
		return new RestClientModel();
	}
	
	@Bean
	public View getView() {
		return new ThymeleafView();
	}
}