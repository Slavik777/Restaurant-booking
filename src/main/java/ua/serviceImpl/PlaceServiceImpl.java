package ua.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Place;import ua.repository.IngredientRepository;
import ua.repository.PlaceRepository;
@Service
public class PlaceServiceImpl extends CrudServiceImpl<Place, Integer> {
@Autowired
	public PlaceServiceImpl(PlaceRepository repository ) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
