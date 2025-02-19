package br.com.api.api_book.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DadosCadastro(
        Long id,
        String nome,
        String nascimento,
        @Size(min = 11, max = 13, message = "Telefone deve ser valido Ex: 00111119999 or xx xxxxx-xxxx") @NotBlank String contato,
        @Email(message = "O email deve ser valido. Ex: teste@teste") @NotBlank String email,
        @Size(min = 8, max = 8, message = "O CEP deve ter 8 dígitos") String cep,
        String endereco,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String uf
) {
}
