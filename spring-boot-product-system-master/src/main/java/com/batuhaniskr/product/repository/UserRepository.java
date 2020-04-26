package com.batuhaniskr.product.repository;
/**
 * Created in Eclipse IDE.
 * Project : spring-mvc-jdbc-master
 * User: yash
 * Date: 18/01/2020
 */
import com.batuhaniskr.product.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
