package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Piloto {
	
	@Id
	@GeneratedValue
	private int idPiloto;
	private String nomePiloto;
	private int posicaoPiloto;
		
	public int getPosicaoPiloto() {
		return posicaoPiloto;
	}

	public void setPosicaoPiloto(int posicaoPiloto) {
		this.posicaoPiloto = posicaoPiloto;
	}

	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getNomePiloto() {
		return nomePiloto;
	}

	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}

	public Piloto() {
	
		// TODO Auto-generated constructor stub
	}
}
