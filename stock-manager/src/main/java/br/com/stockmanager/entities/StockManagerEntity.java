package br.com.stockmanager.entities;

import javax.persistence.Entity;

@Entity
public class StockManagerEntity {
	
	private String StockQuoteManager;

	public StockManagerEntity() {
		super();
	}

	public StockManagerEntity(String stockQuoteManager) {
		super();
		StockQuoteManager = stockQuoteManager;
	}

	public String getStockQuoteManager() {
		return StockQuoteManager;
	}

	public void setStockQuoteManager(String stockQuoteManager) {
		StockQuoteManager = stockQuoteManager;
	}
	
	
}
