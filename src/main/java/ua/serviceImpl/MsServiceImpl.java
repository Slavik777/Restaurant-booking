package ua.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Ms;
import ua.repository.MsRepository;
@Service
public class MsServiceImpl extends CrudServiceImpl<Ms, Integer> {
@Autowired
	public MsServiceImpl(MsRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
