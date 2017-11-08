package ua.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.entity.Cuisine;
import ua.repository.CuisineRepository;
import ua.service.CuisineServise;
	@Service
public class CuisineServiceImpl extends CrudServiceImpl<Cuisine, Integer> implements CuisineServise {
		@Autowired
	public CuisineServiceImpl(CuisineRepository repository) {
		super(repository);
	}

}
