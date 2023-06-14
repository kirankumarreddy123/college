package com.example.Grievance.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Grievance.model.Grievance;
import com.example.Grievance.repository.GrievanceRepository;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/")
public class GrievanceController {

	@Autowired
	GrievanceRepository grievanceRepository;

	@GetMapping("/register")
	public ResponseEntity<List<Grievance>> getAllGrievance(@RequestParam(required = false) String title) {

		List<Grievance> grievances = new ArrayList<Grievance>();

		grievanceRepository.findAll().forEach(grievances::add);

		return new ResponseEntity<>(grievances, HttpStatus.OK);

	}

    @PostMapping("/register")
	public ResponseEntity<Grievance> createGrievance(@RequestBody  Grievance grievance) {
		Grievance _grievance = grievanceRepository.save(new Grievance(grievance.getFirst_name(), grievance.getLast_name(), grievance.getRoll_NO(), grievance.getUser(), grievance.getDate_of_Birth(), grievance.getDepartment(), grievance.getPhone_number(), grievance.getEmail_Id(), grievance.getpassword(), grievance.getConform_Password(), grievance.getGender()));
		return new ResponseEntity<>(grievance, HttpStatus.CREATED);

	}

	@PutMapping("/register/{id}")
	public ResponseEntity<Grievance>  updateGrievance(@PathVariable("id") long id, @RequestBody Grievance grievance) {
		Optional<Grievance> grievanceData = grievanceRepository.findById(id);

		Grievance _grievance = grievanceData.get();
		_grievance.setFirst_name(grievance.getFirst_name());
		_grievance.setLast_name(grievance.getLast_name());
		_grievance.setRoll_NO (grievance.getRoll_NO());
        _grievance.setUser (grievance.getUser());
        _grievance.setDate_of_Birth(grievance.getDate_of_Birth());
        _grievance.setDepartment(grievance.getDepartment());
        _grievance.setPhone_number(grievance.getPhone_number());
        _grievance.setEmail_Id(grievance.getEmail_Id());
        _grievance.setpassword(grievance.getpassword());
        _grievance.setConform_Password(grievance.getConform_Password());
        _grievance.setGender(grievance.getGender());
		return new ResponseEntity<>(grievanceRepository.save(_grievance), HttpStatus.OK);
	}

	public GrievanceRepository getGrievanceRepository() {
		return grievanceRepository;
	}

	public void setGrievanceRepository(GrievanceRepository grievanceRepository) {
		this.grievanceRepository = grievanceRepository;
	}

	@DeleteMapping("/register/{id}")
	public ResponseEntity<HttpStatus> deleteGrievance(@PathVariable("id") long id) {
		try {
			grievanceRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/register")
	public ResponseEntity<HttpStatus> deleteAllGrievance() {
		try {
			grievanceRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}