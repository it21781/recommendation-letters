package gr.hua.dit.ds.team8.repository;

import gr.hua.dit.ds.team8.entity.Letter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "letters")
public interface LetterRepository extends JpaRepository<Letter, Integer> {

}