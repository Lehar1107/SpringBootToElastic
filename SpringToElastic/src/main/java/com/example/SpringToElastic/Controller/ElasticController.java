package com.example.SpringToElastic.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringToElastic.Repository.ElasticRepository;
import com.example.SpringToElastic.model.Elastic;

@RestController
@RequestMapping("/api/employees")
public class ElasticController {
	@Autowired
	private ElasticRepository elp;

	    @GetMapping("/{id}")
	    public Optional<Elastic> findById(@PathVariable String id) {
	        return elp.findById(id);
	    }

	    @GetMapping
	    public Iterable<Elastic> findAll() {
	        return elp.findAll();
	    }
	
		 @PostMapping
		    public Elastic create(@RequestBody Elastic employee) {
		        return elp.save(employee);
		    }
		    @PutMapping("/{id}")
		    public Elastic update(@PathVariable String id, @RequestBody Elastic employee) {
		        employee.setId(id);
		        return elp.save(employee);
		    }

		    @DeleteMapping("/{id}")
		    public void delete(@PathVariable String id) {
		        elp.deleteById(id);
		    }


}
