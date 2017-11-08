package ua.serviceImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.service.CrudService;

public abstract class CrudServiceImpl<T, ID extends Serializable> implements CrudService<T, ID> {
	
	private final JpaRepository<T, ID> repository;
	
	public CrudServiceImpl(JpaRepository<T, ID> repository) {
		this.repository = repository;
	}

	@Override
	public T findOne(ID id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void save(T entity) {
		repository.save(entity);
		
	}

	@Override
	public void delete(ID id) {
		repository.delete(id);
		
	}

}