package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.MediaComData;

public class TestaSomaDasMovimentacoes {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql");
		EntityManager em = emf.createEntityManager();

		String jpql = "select new br.com.alura.jpa.modelo.MediaComData(avg(m.valor), day(m.data)) from Movimentacao m group by day(m.data)";
		
		TypedQuery<MediaComData> query = em.createQuery(jpql, MediaComData.class);
		
		List<MediaComData> somaMovimentacoes = query.getResultList();
		
		for (MediaComData mediaComData : somaMovimentacoes) {
			System.out.println("Média: " + mediaComData.getMedia() + ", Dia: " + mediaComData.getDia());
		}
	}
}
