package com.devsup.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsup.dsmeta.entities.Sale;
import com.devsup.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repo;

	public List<Sale> findSales() {
		return repo.findAll();
	}
}
