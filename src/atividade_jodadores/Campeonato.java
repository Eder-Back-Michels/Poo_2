package atividade_jodadores;

import java.util.ArrayList;

public class Campeonato {

	public static Time TimeComMaisGols(ArrayList<Time> times) {
		Time timemaisgols = times.get(0);
		for (Time time: times) {
			if(time.qtGols() > timemaisgols.qtGols()) {
				timemaisgols = time;
			}
		}
		return timemaisgols;
	}
	
	public static Jogador ArtilheiroCampeonato(ArrayList<Time> times) {
		Jogador artilheirocampeonato = new Jogador();
		for (Time time: times) {
			if(time.artilheiroTime().getGols() > artilheirocampeonato.getGols()) {
				artilheirocampeonato = time.artilheiroTime();
			}
		}
		return artilheirocampeonato;
	}
	
	
}
