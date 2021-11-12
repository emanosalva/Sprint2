package co.unab.edu.apigym.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.unab.edu.apigym.models.UserModel;
import co.unab.edu.apigym.services.UsuarioService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/usuario")

public class userController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UserModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

  
    @PostMapping()
    public UserModel guardarUsuario(@RequestBody UserModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }
}
