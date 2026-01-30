CREATE SCHEMA if not exists accounting;
ALTER SCHEMA accounting OWNER TO "tata_owner";

--Persona
CREATE table IF NOT EXISTS accounting.persona
(
    id_per                  BIGSERIAL primary key,
    nombre_per              text NOT NULL,
    genero_per              varchar(10),
    edad_per                integer CHECK (edad_per >= 0) ,
    identificacion_per      varchar(30) UNIQUE,
    direccion_per           text NOT NULL,
    telefono_per            varchar(10) NOT NULL
);

ALTER TABLE accounting.persona
    OWNER to "tata_owner";

--Cliente
CREATE table IF NOT EXISTS accounting.cliente
(
    id_cli              BIGSERIAL primary key,
    contrasenia_cli     text NOT NULL,
    estado_cli          boolean NOT NULL,
    id_per              bigint
                        constraint fk_accounting_persona_id
                        references accounting.persona(id_per)
);

ALTER TABLE accounting.cliente
    OWNER to "tata_owner";

-----GRANTS
GRANT
USAGE
ON
SCHEMA
accounting TO "tata_user";

GRANT
SELECT,
INSERT
,
UPDATE,
DELETE
ON ALL TABLES IN SCHEMA accounting
    TO "tata_user";

GRANT
SELECT,
UPDATE
    ON ALL
    SEQUENCES IN SCHEMA accounting
    TO "tata_user";

GRANT
SELECT,
INSERT,
UPDATE,
DELETE
ON ALL TABLES IN SCHEMA public
    TO "tata_user";