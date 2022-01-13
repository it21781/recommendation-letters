package gr.hua.dit.ds.team8.repository;

import gr.hua.dit.ds.team8.entity.Teacher;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(path = "teachers")
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}