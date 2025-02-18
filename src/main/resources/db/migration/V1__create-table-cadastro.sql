create table cadastro (
        id bigint not null auto_increment,
        nome varchar(100) not null,
        nascimento varchar(100) not,
        contato varchar(100) not null unique,
        email varchar(100) not null unique,
        cep varchar(100),
        endereco varchar(255),
        numero varchar(255),
        complemento varchar(255),
        bairro varchar(255),
        cidade varchar(255),
        uf varchar(255),

        primary key(id)
)