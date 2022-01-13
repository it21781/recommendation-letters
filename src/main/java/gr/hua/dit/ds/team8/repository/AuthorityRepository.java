package gr.hua.dit.ds.team8.repository;

import gr.hua.dit.ds.team8.entity.AuthPK;
import gr.hua.dit.ds.team8.entity.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository  extends JpaRepository<Authorities, AuthPK> {
}