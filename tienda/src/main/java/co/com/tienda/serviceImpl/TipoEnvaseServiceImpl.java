package co.com.tienda.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tienda.model.TipoEnvase;
import co.com.tienda.repository.TipoEnvaseRepository;
import co.com.tienda.service.ITipoEnvaseService;

@Service
public class TipoEnvaseServiceImpl implements ITipoEnvaseService{

	@Autowired
	private TipoEnvaseRepository tipoEnvaseRepo;
	
	@Override
	public List<TipoEnvase> findAll() {
		return tipoEnvaseRepo.findAll();
	}

}
