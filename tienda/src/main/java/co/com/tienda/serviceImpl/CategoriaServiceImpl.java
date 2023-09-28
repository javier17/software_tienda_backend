package co.com.tienda.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tienda.model.Categoria;
import co.com.tienda.repository.CategoriaRepository;
import co.com.tienda.service.ICategoriaService;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepo;

	@Override
	public List<Categoria> findAll() {
		return categoriaRepo.findAll();
	}



}
