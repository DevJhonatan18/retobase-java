package arcmop.blog.springbootest.controladores;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import arcmop.blog.springbootest.configuracion.Operacion;
import arcmop.blog.springbootest.configuracion.OperacionRepository;
import arcmop.blog.springbootest.configuracion.OperacionService;



@RestController
@RequestMapping
public class ControladorHolaMundo {
	
	@Autowired
	private OperacionService operacionService;
	
	@Autowired
	private OperacionRepository operacionRepository;
		
	
    @RequestMapping(value = "/sumar/{sum01}/{sum02}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Map saludar(@PathVariable("sum01") Integer sum01, @PathVariable("sum02") Integer sum02) {
    	operacionService.guardarResultados(sum01, sum02, sum01+sum02);
        return Collections.singletonMap("resultado", String.valueOf(sum01 + sum02));
    }
    
    @RequestMapping(value = "/operaciones", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Operacion> listar() {
    	// operacionService.guardarResultados(sum01, sum02, sum01+sum02);
        return operacionRepository.findAll();
    }
    	

}
