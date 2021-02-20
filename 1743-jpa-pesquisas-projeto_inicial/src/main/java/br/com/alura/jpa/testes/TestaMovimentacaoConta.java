package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;

public class TestaMovimentacaoConta {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql");
		EntityManager em = emf.createEntityManager();
		
		Movimentacao m = em.find(Movimentacao.class, 1L);
		Conta c = m.getConta();
		
		int quantidadeMovimentacoes = c.getMovimentacoes().size();
		
		System.out.println(quantidadeMovimentacoes);
		System.out.println(c.getTitular());
	}
}
