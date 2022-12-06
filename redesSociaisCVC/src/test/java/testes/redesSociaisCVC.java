package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class redesSociaisCVC {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador();
		metodos.scrool(0, 200);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void Facebook() {
		metodos.clicar(elementos.getFacebook());
		metodos.validar(elementos.getMsgFacebook(), "CVC Viagens");

	}

	@Test
	public void Instagram() {
		metodos.clicar(elementos.getInstagram());
		metodos.validar(elementos.getMsgInstagram(), "cvcviagens");

	}

	@Test
	public void youTube() {
		metodos.clicar(elementos.getYouTube());
		metodos.validar(elementos.getMsgyouTube(), "CVC Viagens");

	}

	@Test
	public void twitter() {
		metodos.clicar(elementos.getTwitter());
		metodos.validar(elementos.getMsgTwitter(),
				"Perfil da CVC Viagens no Twitter. Siga-nos e saiba TUDO sobre a viagem dos sonhos!");
	}

	@Test
	public void pinterest() {
		metodos.clicar(elementos.getPinterest());
		metodos.validar(elementos.getMsgPinterest(),
				"Bem vindo à página oficial da CVC Viagens no Pinterest. Pra toda viagem. Pra vida toda.");

	}

}
