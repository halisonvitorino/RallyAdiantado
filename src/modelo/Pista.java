package rallyModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pista {
	
	@Id
	@GeneratedValue
	private int idPista;
	private String nomePista;
	private String localPista;
		
	public int getIdPista() {
		return idPista;
	}
	public void setIdPista(int idPista) {
		this.idPista = idPista;
	}
	public String getNomePista() {
		return nomePista;
	}
	public void setNomePista(String nomePista) {
		this.nomePista = nomePista;
	}
	public String getLocalPista() {
		return localPista;
	}
	public void setLocalPista(String localPista) {
		this.localPista = localPista;
	}
	
	public Pista() {
	}
}
