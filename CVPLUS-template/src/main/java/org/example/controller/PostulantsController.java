package org.example.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.example.business.BusinessNegocio;
import org.example.business.PostulantsBusiness;
import org.example.entities.Business;
import org.example.entities.Postulants;
import org.example.repository.PostulantsRepository;

@Named
public class PostulantsController implements Serializable{

	
	private static final long serialVersionUID = 1L;

	{

		@Inject
		
		private PostulantsBusiness postulantsBusiness;
		
		private Postulants postulants;
		private List<Postulants>postulantss;
		@PostConstruct
		{
			postulants = new Postulants();
			postulantss= new ArrayList<>();
			
			getAll();
			getAll
		}
	
	}
}
