package br.com.IntroSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.IntroSpring.model.Introducao;

@Controller
@RequestMapping("/index")
public class introducaoController {

	@RequestMapping("/novo")
	public String novo() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Introducao introducao) {
		System.out.println(">>>> " + introducao.getNome());
		return "index";
	}

}
