package ua.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Order;
import ua.repository.OrderRepository;
@Service
public class OrderServiceImpl extends CrudServiceImpl<Order, Integer> {
@Autowired
	public OrderServiceImpl(OrderRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
