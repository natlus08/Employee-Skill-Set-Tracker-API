/**
 * 
 */
package com.employee.skillset.tracker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import org.springframework.web.bind.annotation.RestController;

import com.employee.skillset.tracker.model.Associate;
import com.employee.skillset.tracker.service.AssociateService;

/**
 * @author hus8623
 *
 */
@RestController
@RequestMapping("/associate-api/")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AssociateController {
	
	public static final Logger logger = LoggerFactory.getLogger(AssociateController.class);
	
	@Autowired
	private AssociateService associateService;
	
	/**
	 * GET --> Get all associates
	 */
	@GetMapping("/associates")
	public ResponseEntity<List<Associate>> getAssociates() {
		List<Associate> associates = associateService.getAssociates();
		if (associates.isEmpty()) {
			return new ResponseEntity<List<Associate>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Associate>>(associates, HttpStatus.OK);
	}
	
	/**
	 * GET --> Get an associates
	 */
	@GetMapping("/associate/{id}")
	public ResponseEntity<Associate> getAssociate(@PathVariable Long id) {
		Associate associate = associateService.getAssociate(id);
		if (null == associate) {
			return new ResponseEntity<Associate>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Associate>(associate, HttpStatus.OK);
	}
	
	/**
	 * POST --> Add a Associate
	 */
	@PostMapping("/associate")
	public ResponseEntity<Associate> addAssociate(@RequestBody Associate associate) {
		Associate newAssociate = associateService.addAssociate(associate);
		if (null == newAssociate) {
			return new ResponseEntity<Associate>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Associate>(newAssociate, HttpStatus.CREATED);
	}
	
	/**
	 * PUT --> Edit a associate
	 */
	@PutMapping("/associate")
	public ResponseEntity<Associate> editAssociate(@RequestBody Associate associate) {
		Associate newAssociate = associateService.editAssociate(associate);
		if (null == newAssociate) {
			return new ResponseEntity<Associate>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Associate>(newAssociate, HttpStatus.CREATED);
	}
	
	/**
	 * Delete --> remove a associate
	 */
	@DeleteMapping("/associate/{id}")
	public ResponseEntity<Associate> editAssociate(@PathVariable Long id) {
		associateService.removeAssociate(id);
		return new ResponseEntity<Associate>(HttpStatus.OK);
	}

}
