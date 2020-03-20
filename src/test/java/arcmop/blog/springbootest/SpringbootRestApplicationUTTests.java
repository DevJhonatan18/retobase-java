package arcmop.blog.springbootest;



import arcmop.blog.springbootest.configuracion.Operacion;
import arcmop.blog.springbootest.configuracion.OperacionRepository;
import arcmop.blog.springbootest.configuracion.StartApplication;

import static org.assertj.core.api.Assertions.assertThat;

import org.aspectj.lang.annotation.Before;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartApplication.class)

public class SpringbootRestApplicationUTTests {
	
	

		
	    @Test
	    public void testSaludar() {
	        //System.out.println("saludar");
	        Double sum01 = 10.00;
	        Double sum02 = 20.00;
	        
	        Double resultado = sum01+sum02;
	        Operacion o = new Operacion(sum01,sum02,resultado);
	        //System.out.println(operacionService.getEmployeeByName(sum01+sum02).getResultado());
	        //ControladorHolaMundo instance = new ControladorHolaMundo();
	        // Long registrosSinInsertar = operacionService.devolverCantidad();
	        // operacionService.guardarResultados(sum01, sum02, sum01+sum02);
	        //Assert.assertEquals(  (sum01+sum02)  , operationRepository.findByResultado(sum01+sum02).getResultado()  );
	       // System.out.println(registrosSinInsertar);
	        //Assert.assertNotNull(instance.saludar(sum01, sum02));
	        
	       // System.out.println(operacionService.devolverCantidad());
	        //System.out.println(Integer.parseInt(String.valueOf(instance.saludar(sum01, sum02).get("resultado"))));	
	       //Assert.assertEquals(  Double.valueOf(resultado) ,  Double.valueOf(o.getResultado())   );
	      
	       System.out.print("Iguales");	
	    }

}
