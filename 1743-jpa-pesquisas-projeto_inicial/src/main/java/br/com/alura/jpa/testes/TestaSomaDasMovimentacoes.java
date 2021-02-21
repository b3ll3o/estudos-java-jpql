package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.MediaComData;
import br.com.alura.jpa.modelo.dao.MovimentacaoDao;

public class TestaSomaDasMovimentacoes {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql");
		EntityManager em = emf.createEntityManager();
		
		MovimentacaoDao movimentacaoDao = new MovimentacaoDao(em);
		List<MediaComData> mediaDiariaDasMovimentacoes = movimentacaoDao.getMediaDiaria();
		
		for (MediaComData mediaComData : mediaDiariaDasMovimentacoes) {
			System.out.println("Média: " + mediaComData.getMedia() + ", Dia: " + mediaComData.getDia());
		}
		
		System.out.println(movimentacaoDao.getSoma());
	}
}
