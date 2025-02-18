package br.com.api.api_book.DTO;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastro(
        Long id,
        String nome,
        @NotBlank Integer contato,
        @NotBlank String email,
        String cep,
        String endereco,
        Integer numero,
        String complemento,
        String bairro,
        String cidade,
        String uf
) {
}
