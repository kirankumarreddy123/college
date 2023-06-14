package com.example.Grievance.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.Grievance.model.Grievance;




public interface GrievanceRepository extends CrudRepository<Grievance, Long> {

   // public Grievance save(Grievance grievance);

}
