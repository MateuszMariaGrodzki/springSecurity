package mateusz.grodzki.security.repository;

import mateusz.grodzki.security.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
@Primary
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}