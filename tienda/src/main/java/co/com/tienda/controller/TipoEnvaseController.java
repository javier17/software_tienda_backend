package co.com.tienda.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.com.tienda.model.TipoEnvase;
import co.com.tienda.service.ITipoEnvaseService;
import co.com.tienda.util.Constants;

@CrossOrigin(origins = {"*"} , maxAge = 3600)
@RestController
@RequestMapping("/containerType")
public class TipoEnvaseController {
	
	@Autowired
	private ITipoEnvaseService tipoEnvaseService;
	
	@GetMapping("/findAll")
	public ResponseEntity<Map<String, Object>> findAll(){
		Map<String, Object> response = new HashMap<>();
		List<TipoEnvase> tiposEnvase;
		try {
			tiposEnvase = tipoEnvaseService.findAll();
		}catch (Exception e) {
			response.put(Constants.STATUS, HttpStatus.INTERNAL_SERVER_ERROR);
			response.put(Constants.RESPONSE, "Error al consultas los tipos de envase");
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put(Constants.STATUS, HttpStatus.OK);
		response.put(Constants.RESPONSE, tiposEnvase);
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	}

}
