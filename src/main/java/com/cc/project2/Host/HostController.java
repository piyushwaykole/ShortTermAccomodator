package com.cc.project2.Host;

import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.project2.User.Accomodation;
import com.cc.project2.User.AccomodationRepository;
import com.cc.project2.User.HostRequest;
import com.cc.project2.User.User;
import com.cc.project2.User.UserRepository;

@RestController
public class HostController {
	
	@Autowired
	private UserRepository UserRepository;
	
	@Autowired
	private AccomodationRepository AccomodationRepository;
	

	@PostMapping("/newHost")
	User newUser(@RequestBody User user) {
		return UserRepository.save(user);
	}
	
	@PostMapping("/newHostListing")
	Accomodation newHostListing(@RequestBody Accomodation accomodation) {
		return AccomodationRepository.save(accomodation);
	}
	
	//test request below//
	@RequestMapping(value="/getUsers", method=RequestMethod.GET)
	public List<User> getUser() {
		List<User> users = (List<User>) UserRepository.findAll();
		System.out.println(UserRepository.findAll());
		return users;
	}
	
	@RequestMapping(value="/dummyTestApi", method=RequestMethod.GET)
	public User testApi() {
		User user = new User();
		user.setUserType("Host");
		user.setName("noname");
		return user;
	}
	
	@RequestMapping(value="/saveUser", method=RequestMethod.GET)
	public void saveUser() {
		User user = new User();
		user.setUserType("Host");
		user.setName("aditi");
		UserRepository.save(user);
	}
	
}
