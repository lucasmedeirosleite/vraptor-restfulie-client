package br.com.caelum.vraptor.restfulie;

import javax.annotation.PostConstruct;

import br.com.caelum.restfulie.RestClient;
import br.com.caelum.restfulie.Restfulie;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import br.com.caelum.vraptor.ioc.RequestScoped;

@Component
@RequestScoped
public class RestClientCreator implements ComponentFactory<RestClient>{
	
	private RestClient restClient;
	
	@PostConstruct
	public void create() {
		restClient = Restfulie.custom();
	}

	@Override
	public RestClient getInstance() {
		return this.restClient;
	}

}
