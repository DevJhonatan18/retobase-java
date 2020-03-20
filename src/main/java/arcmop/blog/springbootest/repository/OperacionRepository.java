package arcmop.blog.springbootest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import arcmop.blog.springbootest.entity.*;


@Repository
public interface OperacionRepository extends CrudRepository<Operacion, Integer> {

}
