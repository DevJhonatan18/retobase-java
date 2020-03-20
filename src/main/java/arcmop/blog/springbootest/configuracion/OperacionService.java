package arcmop.blog.springbootest.configuracion;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






@Service
public class OperacionService {

	@Autowired
	public OperacionRepository operacionRepository;
	
	
	
	
	
	public void guardarResultados(double num1 , double num2 , double resultado){
		operacionRepository.save(new Operacion(num1,num2,resultado));
	}
		
	
	
}
