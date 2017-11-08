package ua.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.entity.Ingredient;
import ua.repository.IngredientRepository;
import ua.service.IngredientService;
@Service
public class IngredientServiseImpl extends CrudServiceImpl<Ingredient, Integer> implements IngredientService {
@Autowired
	public IngredientServiseImpl(IngredientRepository repository) {
		super(repository);
		
	}

}
