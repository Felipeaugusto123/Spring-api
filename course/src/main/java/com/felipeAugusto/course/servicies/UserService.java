package com.felipeAugusto.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeAugusto.course.entities.User;
import com.felipeAugusto.course.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repository; 
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User>obj = repository.findById(id);
		return obj.get();
	}

    public User save(User user){
        return repository.save(user);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }

}
