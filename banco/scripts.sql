
    drop table if exists balanca_comercial;

    drop table if exists empresas;

    drop table if exists pais;

    drop table if exists produto;

    drop table if exists user;

    create table balanca_comercial (
        id bigint not null,
        periodo varchar(255),
        co_ano integer not null,
        continente varchar(255),
        fat_agreg varchar(255),
        id_produto bigint,
        pais varchar(255),
        tipo varchar(255),
        valor_total integer not null,
        primary key (id)
    );

    create table empresas (
        id bigint not null,
        cidade varchar(255),
        lat double precision not null,
        lng double precision not null,
        nome varchar(255),
        pais varchar(255),
        produto varchar(255),
        telefone varchar(255),
        primary key (id)
    );

    create table pais (
        id bigint not null,
        nome varchar(255),
        primary key (id)
    );

    create table produto (
        ncm bigint not null,
        descricao varchar(255),
        primary key (ncm)
    );

    create table user (
        id bigint not null,
        idade varchar(255),
        nome varchar(255),
        primary key (id)
    );
