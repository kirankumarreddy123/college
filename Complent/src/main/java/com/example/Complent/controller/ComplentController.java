package com.example.Complent.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Complent.model.Complent;
import com.example.Complent.repository.ComplentRepository;
@RestController
@RequestMapping("/api")
public class ComplentController {

	private static final CrudRepository<Complent, Long> Complentpository = null;
	@Autowired
	ComplentRepository complentRepository;

	@GetMapping("/register")
	public ResponseEntity<List<Complent>> getAllComplents(@RequestParam(required = false) String Complent) {

		List<Complent> complents = new ArrayList<Complent>();

		complentRepository.findAll().forEach(complents::add);

		return new ResponseEntity<>(complents, HttpStatus.OK);

    }
	@PostMapping("/register")
	public ResponseEntity<Complent> createComplent(@RequestBody  Complent complent) {
		Complent _complent = complentRepository.save(new Complent(complent.getRoll_NO(), complent.getDepartment(), complent.getGender(), complent.getMobile_no(), complent.getGrivance_category(), complent.getGrivance_Description()));
		return new ResponseEntity<>(_complent, HttpStatus.CREATED);

	}
	@PutMapping("/register/{id}")
	public ResponseEntity<Complent>  updateComplent(@PathVariable("id") long id, @RequestBody Complent complent) {
		Optional<Complent> complentData = complentRepository.findById(id);

		Complent _complent= complentData.get();
		_complent.setRoll_NO (complent.getRoll_NO());
        _complent.setDepartment (complent.getDepartment());
        _complent.setGender(complent.getGender());
        _complent.setMobile_no(complent.getMobile_no());
        _complent.setGrivance_category(complent.getGrivance_category());
        _complent.setGrivance_Description(complent.getGrivance_Description());
       
		return new ResponseEntity<>(Complentpository.save(complent), HttpStatus.OK);
	}
		public ComplentRepository getComplentRepository() {
			return complentRepository;
		}
	
		public void setComplentRepository(ComplentRepository complentRepository) {
			this.complentRepository = complentRepository;
		}
		@DeleteMapping("/register/{id}")
	public ResponseEntity<HttpStatus> deleteComplent(@PathVariable("id") long id) {
		try {
			complentRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/register")
	public ResponseEntity<HttpStatus> deleteAllComplents() {
		try {
			complentRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}