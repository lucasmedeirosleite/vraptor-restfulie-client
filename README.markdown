## vraptor-restfulie-client

Um plugin para vraptor para injetar o client do restfulie

# instalação

Como esta dependência não se encontra no repositório maven, você tem que baixar o projeto para sua máquina e dar um mvn install.
No pom fica

		<dependency>
			<groupId>br.com.caelum.vraptor</groupId>
			<artifactId>vraptor-restfulie-client</artifactId>
			<version>1.0.0</version>
			<scope>compile</scope>
		</dependency>
		
# configuração

Nenhuma configuração é necessária
	
# injetando o client

	Antes para consumir um servico rest vc usava: 
		
		@Resource
		public class MeuController {
						
			public String fazAlgumaCoisa() {
				Response resposta = Restfulie.at("endereço").get();
				return "fez algo";
			}
			
		}
	
	Agora pode ser feito da seguinte forma:
	
		import br.com.caelum.restfulie.RestClient;
		
		@Resource
		public class MeuController {
						
			private RestClient restfulie;
			
			public MeuController(RestClient restfulie){
				this.restfulie = restfulie;
			}			
						
			public String fazAlgumaCoisa() {
				Response resposta = restfulie.at("endereço").get();
				return "fez algo";
			}
			
		}