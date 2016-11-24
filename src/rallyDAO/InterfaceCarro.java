package rallyDAO;

import rallyModel.Carro;
import java.util.List;

public interface InterfaceCarro {
	
	public void save(Carro livro);
	public Carro getCarro(long id);
	public List<Carro> list();
	public void remove(Carro livro);
	public void update(Carro livro);
}
