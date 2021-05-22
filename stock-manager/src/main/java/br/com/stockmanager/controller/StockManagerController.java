package br.com.stockmanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockManagerController {

	public String stockQuoteManager;
	
	public StockManagerController() {
		super();
	}

	public StockManagerController(String stockQuoteManager) {
		super();
		this.stockQuoteManager = stockQuoteManager;
	}

	public String getStockQuoteManager() {
		return stockQuoteManager;
	}

	public void setStockQuoteManager(String stockQuoteManager) {
		this.stockQuoteManager = stockQuoteManager;
	}
}
