package com.alessio.gestioneCandidatureStage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.alessio.gestioneCandidatureStage.entity.*;
import com.alessio.gestioneCandidatureStage.service.EmployeeService;
import com.alessio.gestioneCandidatureStage.service.RoleService;

@Controller
@RequestMapping("/")
@SessionAttributes("roles")

public class DemoController {
	
	 @Autowired
	 EmployeeService employeeService;
	     
	 @Autowired
	 RoleService roleService;
	
	 /**
	     * This method will list all existing users.
	     */
	 @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	 public String listUsers(ModelMap model) {
	 
	        List<Employee> employees = employeeService.findAllUsers();
	        model.addAttribute("users", employees);
	        model.addAttribute("loggedinuser", getPrincipal());
	        return "userslist";
	    }
	 
	 /**
	     * This method will provide the medium to add a new user.
	     */
	 @RequestMapping(value = { "/newuser" }, method = RequestMethod.GET)
	 public String newUser(ModelMap model) {
	        Employee employee = new Employee();
	       
	        
	        
	       
	        model.addAttribute("user", employee);
	        
	       
	        
	        model.addAttribute("edit", false);
	        model.addAttribute("loggedinuser", getPrincipal());
	        
	       
	        
	        
	        return "registration";
	    }
	 
	 /**
	  	 * This method will be called on form submission, handling POST request for
	     * saving user in database. It also validates the user input
	     */
	 @RequestMapping(value = { "/newuser" }, method = RequestMethod.POST)
	 public String saveUser(@Valid Employee employee, Figure figure, BindingResult result,
	            ModelMap model) {
	 
	        if (result.hasErrors()) {
	            return "registration";
	        }
	        
	        System.out.println("saveUser");
	        System.out.println(employee.getUsername());
	        System.out.println(employee.getFigure().getFiscalCode());
	        System.out.println(employee.getRoles());
	        System.out.println(figure.getFiscalCode());
	        System.out.println(figure.getFirstName());
	        
	        employeeService.saveUser(employee, employee.getFigure());
	        
	        System.out.println("saveUser finale");
	        System.out.println(employee.getUsername());
	        System.out.println(employee.getFigure().getFiscalCode());
	        
	        model.addAttribute("success", "User " + employee.getFigure().getFirstName()  + " registered successfully");
	        model.addAttribute("loggedinuser", getPrincipal());
	        //return "success";
	        return "registrationsuccess";
	    }
	 
	 /**
	     * This method will provide the medium to update an existing user.
	     */
	    @RequestMapping(value = { "/edit-user-{username}" }, method = RequestMethod.GET)
	    public String editUser(@PathVariable String username, ModelMap model) {
	       
	    	System.out.println(username);
	    	
	    	Employee employee = employeeService.findByUsername(username);
	        model.addAttribute("user", employee);
	        model.addAttribute("edit", true);
	        model.addAttribute("loggedinuser", getPrincipal());
	        
	        
	        return "registration";
	    }
	        
	    /**
	     * This method will be called on form submission, handling POST request for
	     * updating user in database. It also validates the user input
	     */
	    @RequestMapping(value = { "/edit-user-{username}" }, method = RequestMethod.POST)
	    public String updateEmployee(@Valid Employee employee, Figure figure, BindingResult result,
	            ModelMap model, @PathVariable String username) {
	 
	        if (result.hasErrors()) {
	            return "registration";
	        }
	        
	        /*//Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
	        if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
	            FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
	            result.addError(ssoError);
	            return "registration";
	        }*/
	 
	 
	        employeeService.updateUser(employee, employee.getFigure());
	 
	        model.addAttribute("success", "User " + employee.getUsername() + " updated successfully");
	        model.addAttribute("loggedinuser", getPrincipal());
	        return "registrationsuccess";
	    }
	 
	    /**
 		* this method will be called for update permission of a user from enabled to disabled and viceversa
 		*/
	    
	    	@RequestMapping(value = { "/modify-permission-{username}" }, method = RequestMethod.GET)
	    	public String editUserEnabled(@PathVariable String username, ModelMap model) {
	       
	    	System.out.println(username);
	    	
	    	Employee employee = employeeService.findByUsername(username);
	        model.addAttribute("user", employee);
	        model.addAttribute("edit", true);
	        model.addAttribute("loggedinuser", getPrincipal());
	        
	        System.out.println(employee.isEnabled());
	        System.out.println(employee.getUsername()); 
	        
	        return "updateuser";
	    }
	    	
	    
	    	/**
		     * This method will be called on form submission, handling POST request for
		     * updating user PERMISSIONS in database. 
		     */
		    @RequestMapping(value = { "/modify-permission-{username}" }, method = RequestMethod.POST)
		    public String updateEmployeeEnabled(@Valid Employee employee, BindingResult result,
		            ModelMap model, @PathVariable String username) {
		 
		        if (result.hasErrors()) {
		            return "registration";
		        }
		        
		        /*//Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
		        if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
		            FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		            result.addError(ssoError);
		            return "registration";
		        }*/
		        
		        System.out.println(employee.isEnabled());
		        System.out.println(employee.getUsername()); 
		        
		        employeeService.updateUserPermissions(employee);
		 
		        model.addAttribute("success", "User " + employee.getUsername() + " updated successfully");
		        model.addAttribute("loggedinuser", getPrincipal());
		        return "registrationsuccess";
		    }
 		
	    
	    
	    
	    
	    /**
	     * This method will delete an user by it's SSOID value.
	     */
	    @RequestMapping(value = { "/delete-user-{username}" }, method = RequestMethod.GET)
	    public String deleteEmployee(@PathVariable String username) {
	        employeeService.deleteUserByUsername(username);
	        return "redirect:/list";
	    }
	    
	    
	    
	     
	 
	    /**
	     * This method will provide UserProfile list to views
	     */
	    @ModelAttribute("roles")
	    public List<Role> initializeProfiles() {
	        return roleService.findAll();
	    } 
	    
	    /**
	     * This method returns the principal[user-name] of logged-in user.
	     */
	    private String getPrincipal(){
	        String userName = null;
	        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	 
	        if (principal instanceof UserDetails) {
	            userName = ((UserDetails)principal).getUsername();
	        } else {
	            userName = principal.toString();
	        }
	        return userName;
	    }
	    
	    /**
	     * This method handles login GET requests.
	     * If users is already logged-in and tries to goto login page again, will be redirected to list page.
	     */
	    @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public String loginPage() {
	        
	            return "login";
	       
	    }
	 
	    /**
	     * This method handles logout requests.
	     * Toggle the handlers if you are RememberMe functionality is useless in your app.
	     */
	    @RequestMapping(value="/logout", method = RequestMethod.GET)
	    public String logoutPage (HttpServletRequest request, HttpServletResponse response){
	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        if (auth != null){    
	            //new SecurityContextLogoutHandler().logout(request, response, auth);
	           // persistentTokenBasedRememberMeServices.logout(request, response, auth);
	           // SecurityContextHolder.getContext().setAuthentication(null);
	        }
	        return "redirect:/login?logout";
	    }
	 
	    

	        
	        
	        
}
