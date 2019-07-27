package com.Ibt.acart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.ui.Model;

import com.Ibt.acart.model.User;

public interface UserService {
	List<User> userList();
	User findOne(Long id) throws AcartServiceException;
	void addUser(User urse);
	String deleteUser(Long id);
	String updateUser(Long id, User user);
	User login(User user);
}
