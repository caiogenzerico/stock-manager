package br.com.stockmanager.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.stockmanager.entities.StockManagerEntity;

@Repository
public interface StockManagerRepository extends CrudRepository<StockManagerEntity, String> {
	
	@RequestMapping(value="/stock")
	boolean findById(StockManagerEntity stock);
	
	@RequestMapping(value="/stock")
	void canCreate(StockManagerEntity stockEntity);
}
