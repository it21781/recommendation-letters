package gr.hua.dit.ds.team8.repository;

import gr.hua.dit.ds.team8.entity.AuthPK;
import gr.hua.dit.ds.team8.entity.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "authorities")
public interface AuthorityRepository  extends JpaRepository<Authorities, AuthPK> {
}