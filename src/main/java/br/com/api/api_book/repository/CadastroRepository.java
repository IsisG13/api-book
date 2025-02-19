package br.com.api.api_book.repository;

import br.com.api.api_book.DTO.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
    List<Cadastro> findAllByOrderByNomeAsc();
}
