package com.example.basketball.repositoy;

import com.example.basketball.model.Usuarios;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUsuariosRepository extends MongoRepository<Usuarios, String> {

}
