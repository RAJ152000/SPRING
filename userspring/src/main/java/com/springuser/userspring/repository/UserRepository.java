package com.springuser.userspring.repository;





import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.springuser.userspring.entities.User;




@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer>{

	//Auto query
	List<User> findByEmail(String email);
	List<User> findByName(String name);
		
		
//@Query(value="select * from user inner join user_address on user.id=user_address.user_id where id=1;",nativeQuery=true)
List<User> findAll();
List<User> findByNameAndEmail(String name, String email);

}


