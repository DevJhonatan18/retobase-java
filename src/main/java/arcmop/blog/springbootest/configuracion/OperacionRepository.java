package arcmop.blog.springbootest.configuracion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface OperacionRepository extends CrudRepository<Operacion, Integer> {
   
	
}
