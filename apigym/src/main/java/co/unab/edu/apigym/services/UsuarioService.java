package co.unab.edu.apigym.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unab.edu.apigym.models.UserModel;
import co.unab.edu.apigym.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    //crear metodo para listar los usuarios
    public ArrayList<UserModel> obtenerUsuarios(){
        return (ArrayList<UserModel>) usuarioRepository.findAll();
    }

    public UserModel guardarUsuario(UserModel usuario) {
        return usuarioRepository.save(usuario);
    }
}
