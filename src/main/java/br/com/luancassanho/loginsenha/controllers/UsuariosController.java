package br.com.luancassanho.loginsenha.controllers;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.luancassanho.loginsenha.dto.UsuarioDTO;
import br.com.luancassanho.loginsenha.model.Usuario;
import br.com.luancassanho.loginsenha.repositories.UsuarioRepository;


@Controller
public class UsuariosController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/usuarios")
	public ModelAndView index(UsuarioDTO usuario) {
		ModelAndView modelView = new ModelAndView("usuarios/index");
		return modelView;
	}
	
	@PostMapping("usuarios")
	public ModelAndView salvar(@Valid UsuarioDTO usuario, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			System.out.println("Temos erros!!!");		
			return new ModelAndView("usuarios/index");
		}
		
		Usuario usuarioEntity = modelMapper.map(usuario, Usuario.class);
		
		usuarioRepository.save(usuarioEntity);
		
		return new ModelAndView("redirect:/login");
			
	}
	
	@GetMapping("/login")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("usuarios/login");
				
		return modelView;
	}

}
