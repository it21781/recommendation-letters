package gr.hua.dit.ds.team8.repository;

import gr.hua.dit.ds.team8.entity.Letter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "letters")
public interface LetterRepository extends JpaRepository<Letter, Integer> {

    @Modifying
    @Query("update letters set approved = 1 where id = :id")
    static void updateApproved(@Param(value = "id") String id) {
        System.out.println("Niiiiiiiiiiiice");
    }

}