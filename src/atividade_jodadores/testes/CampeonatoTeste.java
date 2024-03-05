package atividade_jodadores.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividade_jodadores.Campeonato;
import atividade_jodadores.Jogador;
import atividade_jodadores.Time;

class CampeonatoTeste {

	ArrayList<Time> times; 
	
	@BeforeEach
	void inicializa() {
		ArrayList<Jogador> jogadores1 = new ArrayList<Jogador>();
		jogadores1.add(new Jogador("N1",1,1));
		jogadores1.add(new Jogador("N2",2,2));
		jogadores1.add(new Jogador("N3",3,3));
		jogadores1.add(new Jogador("N4",4,4));
		jogadores1.add(new Jogador("N5",5,5));
		Time t1 = new Time("Time 1:", jogadores1);
		ArrayList<Jogador> jogadores2 = new ArrayList<Jogador>();
		jogadores2.add(new Jogador("N6",6,6));
		jogadores2.add(new Jogador("N7",7,7));
		jogadores2.add(new Jogador("N8",8,8));
		jogadores2.add(new Jogador("N9",9,9));
		jogadores2.add(new Jogador("N10",10,10));
		Time t2 = new Time("Time 2:",jogadores2);
		ArrayList<Jogador> jogadores3 = new ArrayList<Jogador>();
		jogadores3.add(new Jogador("Nx",99,0));
		jogadores3.add(new Jogador("Ny",98,2));
		Time t3 = new Time("Time 3:",jogadores3);
		times = new ArrayList<Time>();
		times.add(t1);
		times.add(t2);
		times.add(t3);
	}
	
	@Test
	void TimeComMaisGolsTeste() {
		assertEquals(Campeonato.TimeComMaisGols(times).toString(),"Time 2:(5 Jogadores)");
	}
	
	@Test
	void ArtilheiroCampeonatoTeste() {
		assertEquals(Campeonato.ArtilheiroCampeonato(times).toString(),"N10, camisa: 10, gols =10");
	}

}
