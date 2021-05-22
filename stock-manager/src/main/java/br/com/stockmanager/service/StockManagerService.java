package br.com.stockmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.stockmanager.Repository.StockManagerRepository;
import br.com.stockmanager.entities.StockManagerEntity;
import br.com.stockmanagerException.StockManagerException;

@Service
public class StockManagerService {

	@Autowired
	private StockManagerRepository StockManagerRepository;	
	
	@GetMapping (value="/stock")
	public boolean getStockEntity(StockManagerEntity stock) {
		boolean isPresent = StockManagerRepository.findById(stock);
		return isPresent;
	}
	
	public void add(StockManagerEntity stockEntity) throws StockManagerException {
		if(this.getStockEntity(stockEntity)) {
		StockManagerRepository.canCreate(stockEntity);
		}throw new StockManagerException();
	}

}
