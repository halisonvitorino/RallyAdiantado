package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipe {
		
	@Id
	@GeneratedValue
	private int idEquipe;
	private String nomeEquipe;
	private int numeroEquipe;
	public int getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomeEquipe() {
		return nomeEquipe;
	}
	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}
	public int getNumeroEquipe() {
		return numeroEquipe;
	}
	public void setNumeroEquipe(int numeroEquipe) {
		this.numeroEquipe = numeroEquipe;
	}
	public Equipe() {
		
		// TODO Auto-generated constructor stub
	}
}
