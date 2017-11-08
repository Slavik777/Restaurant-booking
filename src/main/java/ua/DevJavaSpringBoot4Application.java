package ua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.entity.Ingredient;
import ua.repository.IngredientRepository;


@SpringBootApplication
public class DevJavaSpringBoot4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run =  SpringApplication.run(DevJavaSpringBoot4Application.class, args);	
		Ingredient ingredient = new Ingredient();
		ingredient.setName("Cocumber");
		run.getBean(IngredientRepository.class).save(ingredient);
	}
}
