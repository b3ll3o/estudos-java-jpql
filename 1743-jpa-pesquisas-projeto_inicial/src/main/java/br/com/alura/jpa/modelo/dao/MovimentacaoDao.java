package br.com.alura.jpa.modelo.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.MediaComData;

public class MovimentacaoDao {
	
	private EntityManager entityManager;
	
	public MovimentacaoDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<MediaComData> getMediaDiaria(){
		
		TypedQuery<MediaComData> query = entityManager.createNamedQuery("mediaDiariaMovimentacoes", MediaComData.class);
		
		return query.getResultList();
	}
	
	public BigDecimal getSoma() {
				
		TypedQuery<BigDecimal> query = entityManager.createNamedQuery("somaMovimentacoes", BigDecimal.class);
		
		return query.getSingleResult();
	}
}
