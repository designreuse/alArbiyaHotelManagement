package org.alArbiyaHotelManagement.web;

import org.alArbiyaHotelManagement.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/player")
public class PlayerController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String showPlayer() {
		return "player/player";
	}

	public Player addPlayer() {
		return null;
	}
	public Player editPlayer() {
		return null;
	}
}
