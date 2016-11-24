package dao;

import java.util.List;

public interface InterfaceDAO {
	
	public void save(Object bean);
	public Object getById(int id);
	public List<Object> getAll();
	public void remove(int id);
	public void update(Object bean);
}
