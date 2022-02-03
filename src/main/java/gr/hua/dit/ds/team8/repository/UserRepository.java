package gr.hua.dit.ds.team8.repository;

import gr.hua.dit.ds.team8.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(path="users")

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}