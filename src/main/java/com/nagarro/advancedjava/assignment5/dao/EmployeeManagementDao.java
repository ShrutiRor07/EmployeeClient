package com.nagarro.advancedjava.assignment5.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.nagarro.advancedjava.assignment5.model.User;

public interface EmployeeManagementDao extends CrudRepository<User, Integer> {
	List<User> findByUserIDAndPassword(int userID, String password);
}
