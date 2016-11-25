package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipe {
		
	@Id
	@GeneratedValue
	@Column
	private int idEquipe;
	@Column
	private String nomeEquipe;
	@Column
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
