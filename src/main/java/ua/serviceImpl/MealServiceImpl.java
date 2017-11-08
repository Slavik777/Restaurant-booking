package ua.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Meal;
import ua.repository.MealRepository;
	@Service
public class MealServiceImpl extends CrudServiceImpl<Meal, Integer> {
		@Autowired
	public MealServiceImpl(MealRepository repository) {
		super(repository);
	}

}
