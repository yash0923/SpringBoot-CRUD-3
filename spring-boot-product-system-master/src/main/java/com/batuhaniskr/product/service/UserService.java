package com.batuhaniskr.product.service;
/**
 * Created in Eclipse IDE.
 * Project : spring-mvc-jdbc-master
 * User: yash
 * Date: 18/01/2020
 */
import com.batuhaniskr.product.dto.UserRegistrationDto;
import com.batuhaniskr.product.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService extends UserDetailsService {

    User findByEmail(String email);
    User save(UserRegistrationDto userRegistrationDto);
}
