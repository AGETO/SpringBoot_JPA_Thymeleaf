package br.com.IntroSpring.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.IntroSpring.model.Introducao;

@Repository
public interface IntroducaoRepository extends JpaRepository<Introducao,Long>{
	
	//List<Customer> findByName(@Param("name") String name);
}