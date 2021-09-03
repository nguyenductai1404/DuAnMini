package com.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	@RequestMapping({"/","/home/index"})
	public String home() {
		return "redirect:/product/list";
	}

	@RequestMapping({"/admin", "/admin/home/index"})
	public String admin() {
		return "redirect:/assets/admin/index.html";
	}

	@RequestMapping({"/home/gioithieu"})
	public String gioithieu() {
		return "layout/gioithieu.html";
	}
	@RequestMapping({"/home/lienhe"})
	public String lienhe() {
		return "layout/lienhe.html";
	}
	@RequestMapping({"/home/gopy"})
	public String gopy() {
		return "layout/gopy.html";
	}
	@RequestMapping({"/home/doimatkhau"})
	public String doimatkhau() {
		return "layout/doimatkhau.html";
	}
	@RequestMapping({"/home/quenmatkhau"})
	public String quenmatkhau() {
		return "layout/quenmatkhau.html";
	}
	@RequestMapping({"/home/hoidap"})
	public String hoidap() {
		return "layout/hoidap.html";
	}
	@RequestMapping({"/home/dangky"})
	public String dangky() {
		return "layout/dangky.html";
	}
	
	
}
