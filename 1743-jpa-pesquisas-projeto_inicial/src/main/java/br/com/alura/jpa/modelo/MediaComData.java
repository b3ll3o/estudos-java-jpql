package br.com.alura.jpa.modelo;

public class MediaComData {

	private Double media;
	private Integer dia;
	
	public MediaComData(Double media, Integer dia) {
		this.media = media;
		this.dia = dia;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

}
