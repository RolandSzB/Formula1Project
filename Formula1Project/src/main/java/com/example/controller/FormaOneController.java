package com.example.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.FormaOneDao;
import com.example.pojo.Cars;
import com.example.pojo.Drivers;
import com.example.pojo.Teams;

@Controller
public class FormaOneController {

	
	//get by id cars
		@GetMapping("cars/{id}")
		public ModelAndView getSingleCar(@PathVariable int id) throws SQLException {
			ModelAndView mav = new ModelAndView("singleCar");
			mav.addObject("car", FormaOneDao.getCarById(id));
			return mav;
		}
	//get by id teams
		@GetMapping("teams/{id}")
		public ModelAndView getSingleTeam(@PathVariable int id) throws SQLException {
			ModelAndView mav = new ModelAndView("singleTeam");
			mav.addObject("team", FormaOneDao.getTeamById(id));
			return mav;
		}
		
	//get by id cars
		@GetMapping("drivers/{id}")
		public ModelAndView getSingleDriver(@PathVariable int id) throws SQLException {
			ModelAndView mav = new ModelAndView("singleDriver");
			mav.addObject("driver", FormaOneDao.getDriverById(id));
			return mav;
		}
		
	// get all cars
		@GetMapping("cars/all")
		public ModelAndView allC() throws SQLException {
			ModelAndView mav = new ModelAndView("allCars");
			mav.addObject("cars", FormaOneDao.allCars());
			return mav;
		}
		
	// get all drivers
		 @GetMapping("drivers/all")
		 	public ModelAndView allD() throws SQLException {
			ModelAndView mav = new ModelAndView("allDrivers");
			mav.addObject("drivers", FormaOneDao.allDrivers());
			return mav;
		}
		 
	// get all teams
		 @GetMapping("teams/all")
		 public ModelAndView allT() throws SQLException {
			ModelAndView mav = new ModelAndView("allTeams");
			mav.addObject("teams", FormaOneDao.allTeams());
			return mav;
			}
		 
		//delete car
			@GetMapping("cars/delete/{id}")
			public ModelAndView deleteCById(@PathVariable int id) throws SQLException {
				FormaOneDao.deleteCarById(id);
				return new ModelAndView("redirect:/cars/all");
			}
			
		//delete driver
			@GetMapping("drivers/delete/{id}")
			public ModelAndView deleteDById(@PathVariable int id) throws SQLException {
				FormaOneDao.deleteDriverById(id);
				return new ModelAndView("redirect:/drivers/all");
			}
			
		//delete team
			@GetMapping("teams/delete/{id}")
			public ModelAndView deleteTById(@PathVariable int id) throws SQLException {
				FormaOneDao.deleteTeamById(id);
				return new ModelAndView("redirect:/teams/all");
			}

		//create car
			@GetMapping("/cars/create")
			public ModelAndView addCar(Model model) throws SQLException {
				model.addAttribute("cars", new Cars());
				return new ModelAndView("createCar", "model", model);
			
			}
			
			@PostMapping("/cars/create")
			public ModelAndView createcar(@ModelAttribute Cars car, ModelMap m, BindingResult bs) throws SQLException {
			FormaOneDao.createCar(car);
			return new ModelAndView("redirect:/cars/all");}
			
		//create driver
			@GetMapping("/drivers/create")
			public ModelAndView addDriver(Model model) throws SQLException {
				model.addAttribute("drivers", new Drivers());
				return new ModelAndView("createDriver", "model", model);
			
			}
			
			@PostMapping("/drivers/create")
			public ModelAndView createDriver(@ModelAttribute Drivers driver, ModelMap m, BindingResult bs) throws SQLException {
			FormaOneDao.createDriver(driver);
			return new ModelAndView("redirect:/drivers/all");}
			
		//create team
			@GetMapping("/teams/create")
			public ModelAndView addTeam(Model model) throws SQLException {
				model.addAttribute("teams", new Teams());
				return new ModelAndView("createTeam", "model", model);
			
			}
			
			@PostMapping("/teams/create")
			public ModelAndView createTeam(@ModelAttribute Teams team, ModelMap m, BindingResult bs) throws SQLException {
			FormaOneDao.createTeam(team);
			return new ModelAndView("redirect:/teams/all");}
			
		//edit car
			@GetMapping("/cars/edit/{id}")
			public ModelAndView carEditGet(Model model, @PathVariable int id) throws SQLException, IOException, ClassNotFoundException {
				
				Cars car=FormaOneDao.getCarById(id);
				model.addAttribute("cars",car);
			
				return new ModelAndView("editCar", "model", model);
				
			}
			
			@PostMapping("/cars/edit/{id}")
			public ModelAndView carEditSave(@ModelAttribute("cars") Cars c, @PathVariable int id, ModelMap model, BindingResult result) {
			    try {
			         FormaOneDao.editCar(c);
			    } catch(Exception e) {
			        e.printStackTrace();
			    }
			    return new ModelAndView("redirect:/cars/all");
			}
			
		//edit driver
			@GetMapping("/drivers/edit/{id}")
			public ModelAndView driverEditGet(Model model, @PathVariable int id) throws SQLException, IOException, ClassNotFoundException {
				
				Drivers driver=FormaOneDao.getDriverById(id);
				model.addAttribute("drivers",driver);
			
				return new ModelAndView("editDriver", "model", model);
				
			}
			
			@PostMapping("/drivers/edit/{id}")
			public ModelAndView driverEditSave(@ModelAttribute("drivers") Drivers d, @PathVariable int id, ModelMap model, BindingResult result) {
			    try {
			         FormaOneDao.editDriver(d);
			    } catch(Exception e) {
			        e.printStackTrace();
			    }
			    return new ModelAndView("redirect:/drivers/all");
			}
		//edit team
			@GetMapping("/teams/edit/{id}")
			public ModelAndView teamEditGet(Model model, @PathVariable int id) throws SQLException, IOException, ClassNotFoundException {
				
				Teams team=FormaOneDao.getTeamById(id);
				model.addAttribute("teams",team);
			
				return new ModelAndView("editTeam", "model", model);
				
			}
			
			@PostMapping("/teams/edit/{id}")
			public ModelAndView teamEditSave(@ModelAttribute("teams") Teams t, @PathVariable int id, ModelMap model, BindingResult result) {
			    try {
			         FormaOneDao.editTeam(t);
			    } catch(Exception e) {
			        e.printStackTrace();
			    }
			    return new ModelAndView("redirect:/teams/all");
			}
}



