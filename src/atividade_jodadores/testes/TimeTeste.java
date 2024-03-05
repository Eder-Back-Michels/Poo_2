package atividade_jodadores.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividade_jodadores.Jogador;
import atividade_jodadores.Time;

class TimeTeste {
	
	Time t1;
	Time t2;
			
	@BeforeEach
	public void inicializa() {
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(new Jogador("N1",1,1));
		jogadores.add(new Jogador("N2",2,2));
		jogadores.add(new Jogador("N3",3,3));
		jogadores.add(new Jogador("N4",4,4));
		jogadores.add(new Jogador("N5",5,5));
		t1 = new Time("Time 1:", jogadores);
		t2 = new Time();
	}
	
	@Test
	void listaJogadoresTeste() {
		assertEquals(t1.listaJogadores(),"N1, camisa: 1, gols =1\n"
				+ "N2, camisa: 2, gols =2\n"
				+ "N3, camisa: 3, gols =3\n"
				+ "N4, camisa: 4, gols =4\n"
				+ "N5, camisa: 5, gols =5\n");
		assertEquals(t2.listaJogadores(),"");
	}
	
	@Test
	void ToStringTeste() {
		assertEquals(t1.toString(),"Time 1:(5 Jogadores)");
		assertEquals(t2.toString(),"(0 Jogadores)");
	}
	
	@Test
	void ArtilheiroTeste() {
		assertEquals(t1.artilheiroTime().toString(),"N5, camisa: 5, gols =5");
		assertEquals(t2.artilheiroTime().toString(),", camisa: 999, gols =-1");
	}
	
	@Test
	void qtGolsTest() {
		assertEquals(15,t1.qtGols());
		assertEquals(0,t2.qtGols());
	}
}
