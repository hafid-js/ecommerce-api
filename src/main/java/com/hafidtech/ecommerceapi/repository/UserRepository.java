package com.hafidtech.ecommerceapi.repository;

import com.hafidtech.ecommerceapi.entity.User;
import com.hafidtech.ecommerceapi.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstByEmail(String email);

    User findByRole(UserRole userRole);
}
