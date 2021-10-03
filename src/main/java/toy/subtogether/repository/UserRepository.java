package toy.subtogether.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.subtogether.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
