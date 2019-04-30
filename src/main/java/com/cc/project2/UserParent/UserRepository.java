package com.cc.project2.UserParent;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByUserNameAndPassword(String username, String password);
	User findByUserName(String username);
	User findByUserId(Long userId);
}
