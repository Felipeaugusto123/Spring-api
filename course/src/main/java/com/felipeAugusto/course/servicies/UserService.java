package com.felipeAugusto.course.servicies;

import java.util.List;
import java.util.Optional;

import com.felipeAugusto.course.servicies.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

    public User save(User user){
        return repository.save(user);
    }

    public void deleteById(Long id){
        findById(id);
        repository.deleteById(id);
    }

    public User update(Long id,User user){
        User entity = findById(id);
        updateUser(entity,user);
        return repository.save(entity);
    }

    private void updateUser(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        entity.setPhone(user.getPhone());
    }

}
