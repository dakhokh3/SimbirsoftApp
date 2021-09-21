create schema market;

create table market.site_user
(
    id       serial primary key,
    login    varchar(30),
    password varchar(64)
);

create table market.item
(
    id          serial primary key,
    name        varchar(100),
    description varchar(500),
    count       int,
    price       double precision,
    category_id int
);

create table market.category
(
    id   serial primary key,
    name varchar(30)
);

alter table market.item
    add constraint fk_category_id_category foreign key (category_id) references market.category (id);


