package rallyModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class carro {
		
	@Id
	@GeneratedValue
	private int idCarro;
	private String marcaCarro;
	private int numeroCarro;
	
	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public int getNumeroCarro() {
		return numeroCarro;
	}

	public void setNumeroCarro(int numeroCarro) {
		this.numeroCarro = numeroCarro;
	}

	public carro() {
	
	}
}

