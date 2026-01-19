CREATE SCHEMA if not exists cliente;
ALTER SCHEMA cliente OWNER TO "cliente_owner";

--Persona
CREATE table IF NOT EXISTS cliente.persona
(
    id_per                  BIGSERIAL primary key,
    nombre_per              text NOT NULL,
    genero_per              varchar(10),
    edad_per                integer CHECK (edad_per >= 0) ,
    identificacion_per      varchar(30) UNIQUE,
    direccion_per           text NOT NULL,
    telefono_per            varchar(10) NOT NULL
);

ALTER TABLE cliente.persona
    OWNER to "cliente_owner";

--Cliente
CREATE table IF NOT EXISTS cliente.cliente
(
    id_cli              BIGSERIAL primary key,
    contrasenia_cli     text NOT NULL,
    estado_cli          boolean NOT NULL,
    id_per              bigint
                        constraint fk_cliente_persona_id
                        references cliente.persona(id_per)
);

ALTER TABLE cliente.cliente
    OWNER to "cliente_owner";

-----GRANTS
GRANT
USAGE
ON
SCHEMA
cliente TO "cliente_user";

GRANT
SELECT,
INSERT
,
UPDATE,
DELETE
ON ALL TABLES IN SCHEMA cliente
    TO "cliente_user";

GRANT
SELECT,
UPDATE
    ON ALL
    SEQUENCES IN SCHEMA cliente
    TO "cliente_user";

GRANT
SELECT,
INSERT,
UPDATE,
DELETE
ON ALL TABLES IN SCHEMA public
    TO "cliente_user";