package br.com.api.api_book.DTO;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cadastro")
@Entity(name = "Cadastro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cadastro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)    private Long id;

    private String nome;
    private String nascimento;

    @Column(unique = true)
    private String contato;

    @Column(unique = true)
    private String email;
    private Integer cep;
    private String endereco;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    public Cadastro(DadosCadastro dados) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.contato = contato;
        this.email = email;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }


}
