package com.app.SocialMedia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.SocialMedia.command.UserCommand;
import com.app.SocialMedia.model.User;
import com.app.SocialMedia.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public void createUser(UserCommand createdUser) {
		User user = new User();
		user.setUserName(createdUser.getUserName());
		user.setUserEmail(createdUser.getUserEmail());
		userRepository.save(user);
	}

	public void deleteUser(@PathVariable("id") Long id) {
		userRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	public User findByEmail(String email) {
		return userRepository.findByUserEmail(email);
	}
}
