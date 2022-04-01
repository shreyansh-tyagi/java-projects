/**
 * 
 */
package in.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.service.ControllerService;

/**
 * @author Admin
 *
 */
@RestController
public class CustomerController {
	
	@Autowired
	ControllerService service;

}
