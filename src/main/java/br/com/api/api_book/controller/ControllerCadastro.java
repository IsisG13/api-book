package br.com.api.api_book.controller;

import br.com.api.api_book.DTO.Cadastro;
import br.com.api.api_book.DTO.DadosCadastro;
import br.com.api.api_book.repository.CadastroRepository;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("")
@Validated
public class ControllerCadastro {

    @Autowired
    private CadastroRepository repository;

    @PostMapping("/cadastro")
    public ResponseEntity<Cadastro> cadastro(@Valid @RequestBody DadosCadastro dados) {
        Cadastro cadastro = new Cadastro(dados);
        cadastro = repository.save(cadastro);

        System.out.println(dados);
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastro);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Cadastro>> listarCadastros() {
        List<Cadastro> cadastros = repository.findAllByOrderByNomeAsc();
        return ResponseEntity.ok(cadastros);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        String errorMessages = ex.getFieldErrors().stream()
                .map(error -> error.getField() + ": " + error.getDefaultMessage())
                .collect(Collectors.joining(",\n "));
        return ResponseEntity.badRequest().body(errorMessages);
    }
}