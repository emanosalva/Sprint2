package co.unab.edu.apigym.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.unab.edu.apigym.models.UserModel;

@Repository
public interface UsuarioRepository extends MongoRepository<UserModel , String>{

}
