package ua.service;

import java.util.List;

import ua.entity.Meal;
//import ua.repository.JpaNameRepository;
import ua.model.request.ComponentRequest;
import ua.model.view.ComponentView;

public interface MealService extends CrudService<Meal, Integer> {
	
	List<String> findAllIngredients();

	List<String> findAllMss();

	List<ComponentView> findAllView();
	
	void save(ComponentRequest request);
	
	ComponentRequest findOneRequest(Integer id);
	
	void delete(Integer id);

}
