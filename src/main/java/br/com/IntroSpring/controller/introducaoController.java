package br.com.IntroSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.IntroSpring.model.repositories.IntroducaoRepository;

import br.com.IntroSpring.model.Introducao;

@Controller
@RequestMapping("/index")
public class introducaoController {

	@Autowired IntroducaoRepository intros;
	
	@RequestMapping("/novo")
	public String novo() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Introducao introducao) {
		intros.save(introducao);
		System.out.println(">>>> " + introducao.getNome());
		return "index";
	}

}
