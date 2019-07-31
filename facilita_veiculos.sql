--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.9
-- Dumped by pg_dump version 9.6.9

-- Started on 2019-06-23 22:49:07

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12387)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2501 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 222 (class 1259 OID 31078)
-- Name: acabamentos_internos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.acabamentos_internos (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.acabamentos_internos OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 31076)
-- Name: acabamentos_internos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.acabamentos_internos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.acabamentos_internos_id_seq OWNER TO postgres;

--
-- TOC entry 2502 (class 0 OID 0)
-- Dependencies: 221
-- Name: acabamentos_internos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.acabamentos_internos_id_seq OWNED BY public.acabamentos_internos.id;


--
-- TOC entry 216 (class 1259 OID 31048)
-- Name: cambios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cambios (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.cambios OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 31046)
-- Name: cambios_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cambios_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cambios_id_seq OWNER TO postgres;

--
-- TOC entry 2503 (class 0 OID 0)
-- Dependencies: 215
-- Name: cambios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cambios_id_seq OWNED BY public.cambios.id;


--
-- TOC entry 194 (class 1259 OID 30904)
-- Name: carrocerias; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.carrocerias (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.carrocerias OWNER TO postgres;

--
-- TOC entry 193 (class 1259 OID 30902)
-- Name: carrocerias_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.carrocerias_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.carrocerias_id_seq OWNER TO postgres;

--
-- TOC entry 2504 (class 0 OID 0)
-- Dependencies: 193
-- Name: carrocerias_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.carrocerias_id_seq OWNED BY public.carrocerias.id;


--
-- TOC entry 202 (class 1259 OID 30968)
-- Name: clientes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.clientes (
    id integer NOT NULL,
    nome character varying(200),
    rg character varying(200),
    cpf character varying(200),
    endereco character varying(200),
    cidade character varying(200),
    telefone character varying(200),
    email character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.clientes OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 30966)
-- Name: clientes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.clientes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.clientes_id_seq OWNER TO postgres;

--
-- TOC entry 2505 (class 0 OID 0)
-- Dependencies: 201
-- Name: clientes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.clientes_id_seq OWNED BY public.clientes.id;


--
-- TOC entry 198 (class 1259 OID 30937)
-- Name: combustiveis; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.combustiveis (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.combustiveis OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 30935)
-- Name: combustiveis_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.combustiveis_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.combustiveis_id_seq OWNER TO postgres;

--
-- TOC entry 2506 (class 0 OID 0)
-- Dependencies: 197
-- Name: combustiveis_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.combustiveis_id_seq OWNED BY public.combustiveis.id;


--
-- TOC entry 234 (class 1259 OID 31198)
-- Name: compras; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.compras (
    id integer NOT NULL,
    proprietario_id integer NOT NULL,
    veiculo_id integer NOT NULL,
    data date,
    valor numeric(11,2),
    observacoes text,
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.compras OWNER TO postgres;

--
-- TOC entry 233 (class 1259 OID 31196)
-- Name: compras_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.compras_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.compras_id_seq OWNER TO postgres;

--
-- TOC entry 2507 (class 0 OID 0)
-- Dependencies: 233
-- Name: compras_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.compras_id_seq OWNED BY public.compras.id;


--
-- TOC entry 206 (class 1259 OID 30998)
-- Name: confortos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.confortos (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.confortos OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 30996)
-- Name: confortos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.confortos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.confortos_id_seq OWNER TO postgres;

--
-- TOC entry 2508 (class 0 OID 0)
-- Dependencies: 205
-- Name: confortos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.confortos_id_seq OWNED BY public.confortos.id;


--
-- TOC entry 218 (class 1259 OID 31058)
-- Name: cores_externas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cores_externas (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.cores_externas OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 31056)
-- Name: cores_externas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cores_externas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cores_externas_id_seq OWNER TO postgres;

--
-- TOC entry 2509 (class 0 OID 0)
-- Dependencies: 217
-- Name: cores_externas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cores_externas_id_seq OWNED BY public.cores_externas.id;


--
-- TOC entry 220 (class 1259 OID 31068)
-- Name: cores_internas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cores_internas (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.cores_internas OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 31066)
-- Name: cores_internas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cores_internas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cores_internas_id_seq OWNER TO postgres;

--
-- TOC entry 2510 (class 0 OID 0)
-- Dependencies: 219
-- Name: cores_internas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cores_internas_id_seq OWNED BY public.cores_internas.id;


--
-- TOC entry 210 (class 1259 OID 31018)
-- Name: estilos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.estilos (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.estilos OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 31016)
-- Name: estilos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.estilos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.estilos_id_seq OWNER TO postgres;

--
-- TOC entry 2511 (class 0 OID 0)
-- Dependencies: 209
-- Name: estilos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.estilos_id_seq OWNED BY public.estilos.id;


--
-- TOC entry 208 (class 1259 OID 31008)
-- Name: extras; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.extras (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.extras OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 31006)
-- Name: extras_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.extras_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.extras_id_seq OWNER TO postgres;

--
-- TOC entry 2512 (class 0 OID 0)
-- Dependencies: 207
-- Name: extras_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.extras_id_seq OWNED BY public.extras.id;


--
-- TOC entry 192 (class 1259 OID 30894)
-- Name: marcas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.marcas (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.marcas OWNER TO postgres;

--
-- TOC entry 191 (class 1259 OID 30892)
-- Name: marcas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.marcas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.marcas_id_seq OWNER TO postgres;

--
-- TOC entry 2513 (class 0 OID 0)
-- Dependencies: 191
-- Name: marcas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.marcas_id_seq OWNED BY public.marcas.id;


--
-- TOC entry 196 (class 1259 OID 30914)
-- Name: modelos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.modelos (
    id integer NOT NULL,
    marca_id integer,
    procedencia_id integer,
    carroceria_id integer,
    nome character varying(200),
    slug character varying(200),
    comprimento numeric(11,2),
    altura numeric(11,2),
    largura numeric(11,2),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.modelos OWNER TO postgres;

--
-- TOC entry 195 (class 1259 OID 30912)
-- Name: modelos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.modelos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.modelos_id_seq OWNER TO postgres;

--
-- TOC entry 2514 (class 0 OID 0)
-- Dependencies: 195
-- Name: modelos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.modelos_id_seq OWNED BY public.modelos.id;


--
-- TOC entry 186 (class 1259 OID 30856)
-- Name: perfis; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.perfis (
    id integer NOT NULL,
    nome character varying(100),
    slug character varying(100),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.perfis OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 30854)
-- Name: perfis_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.perfis_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.perfis_id_seq OWNER TO postgres;

--
-- TOC entry 2515 (class 0 OID 0)
-- Dependencies: 185
-- Name: perfis_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.perfis_id_seq OWNED BY public.perfis.id;


--
-- TOC entry 190 (class 1259 OID 30884)
-- Name: procedencias; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.procedencias (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.procedencias OWNER TO postgres;

--
-- TOC entry 189 (class 1259 OID 30882)
-- Name: procedencias_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.procedencias_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.procedencias_id_seq OWNER TO postgres;

--
-- TOC entry 2516 (class 0 OID 0)
-- Dependencies: 189
-- Name: procedencias_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.procedencias_id_seq OWNED BY public.procedencias.id;


--
-- TOC entry 204 (class 1259 OID 30983)
-- Name: proprietarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.proprietarios (
    id integer NOT NULL,
    nome character varying(200),
    rg character varying(200),
    cpf character varying(200),
    endereco character varying(200),
    cidade character varying(200),
    telefone character varying(200),
    email character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.proprietarios OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 30981)
-- Name: proprietarios_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.proprietarios_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.proprietarios_id_seq OWNER TO postgres;

--
-- TOC entry 2517 (class 0 OID 0)
-- Dependencies: 203
-- Name: proprietarios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.proprietarios_id_seq OWNED BY public.proprietarios.id;


--
-- TOC entry 212 (class 1259 OID 31028)
-- Name: segurancas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.segurancas (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.segurancas OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 31026)
-- Name: segurancas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.segurancas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.segurancas_id_seq OWNER TO postgres;

--
-- TOC entry 2518 (class 0 OID 0)
-- Dependencies: 211
-- Name: segurancas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.segurancas_id_seq OWNED BY public.segurancas.id;


--
-- TOC entry 214 (class 1259 OID 31038)
-- Name: tecnologias; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tecnologias (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.tecnologias OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 31036)
-- Name: tecnologias_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tecnologias_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tecnologias_id_seq OWNER TO postgres;

--
-- TOC entry 2519 (class 0 OID 0)
-- Dependencies: 213
-- Name: tecnologias_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tecnologias_id_seq OWNED BY public.tecnologias.id;


--
-- TOC entry 188 (class 1259 OID 30866)
-- Name: usuarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuarios (
    id integer NOT NULL,
    perfil_id integer NOT NULL,
    nome character varying(200),
    email character varying(200),
    data_nascimento date,
    senha character varying(200),
    confirma_senha character varying(200),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.usuarios OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 30864)
-- Name: usuarios_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuarios_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.usuarios_id_seq OWNER TO postgres;

--
-- TOC entry 2520 (class 0 OID 0)
-- Dependencies: 187
-- Name: usuarios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuarios_id_seq OWNED BY public.usuarios.id;


--
-- TOC entry 224 (class 1259 OID 31088)
-- Name: veiculos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.veiculos (
    id integer NOT NULL,
    versao_id integer,
    cambio_id integer,
    cor_externa_id integer,
    cor_interna_id integer,
    acabamento_interno_id integer,
    situacao character varying(100),
    quilometragem numeric(11,2),
    placa character varying(200),
    chassi character varying(200),
    renavam character varying(200),
    numero_proprietarios integer,
    numero_ocorrencias integer,
    chave_reserva boolean,
    manual_veiculo boolean,
    vistoriado boolean,
    valor numeric(11,2),
    informacoes_veiculo text,
    galeria json,
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.veiculos OWNER TO postgres;

--
-- TOC entry 226 (class 1259 OID 31126)
-- Name: veiculos_confortos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.veiculos_confortos (
    id integer NOT NULL,
    veiculo_id integer NOT NULL,
    conforto_id integer NOT NULL,
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.veiculos_confortos OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 31124)
-- Name: veiculos_confortos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.veiculos_confortos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.veiculos_confortos_id_seq OWNER TO postgres;

--
-- TOC entry 2521 (class 0 OID 0)
-- Dependencies: 225
-- Name: veiculos_confortos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.veiculos_confortos_id_seq OWNED BY public.veiculos_confortos.id;


--
-- TOC entry 240 (class 1259 OID 31259)
-- Name: veiculos_estilos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.veiculos_estilos (
    id integer NOT NULL,
    veiculo_id integer NOT NULL,
    estilo_id integer NOT NULL,
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.veiculos_estilos OWNER TO postgres;

--
-- TOC entry 239 (class 1259 OID 31257)
-- Name: veiculos_estilos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.veiculos_estilos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.veiculos_estilos_id_seq OWNER TO postgres;

--
-- TOC entry 2522 (class 0 OID 0)
-- Dependencies: 239
-- Name: veiculos_estilos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.veiculos_estilos_id_seq OWNED BY public.veiculos_estilos.id;


--
-- TOC entry 228 (class 1259 OID 31144)
-- Name: veiculos_extras; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.veiculos_extras (
    id integer NOT NULL,
    veiculo_id integer NOT NULL,
    extra_id integer NOT NULL,
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.veiculos_extras OWNER TO postgres;

--
-- TOC entry 227 (class 1259 OID 31142)
-- Name: veiculos_extras_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.veiculos_extras_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.veiculos_extras_id_seq OWNER TO postgres;

--
-- TOC entry 2523 (class 0 OID 0)
-- Dependencies: 227
-- Name: veiculos_extras_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.veiculos_extras_id_seq OWNED BY public.veiculos_extras.id;


--
-- TOC entry 223 (class 1259 OID 31086)
-- Name: veiculos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.veiculos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.veiculos_id_seq OWNER TO postgres;

--
-- TOC entry 2524 (class 0 OID 0)
-- Dependencies: 223
-- Name: veiculos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.veiculos_id_seq OWNED BY public.veiculos.id;


--
-- TOC entry 230 (class 1259 OID 31162)
-- Name: veiculos_segurancas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.veiculos_segurancas (
    id integer NOT NULL,
    veiculo_id integer NOT NULL,
    seguranca_id integer NOT NULL,
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.veiculos_segurancas OWNER TO postgres;

--
-- TOC entry 229 (class 1259 OID 31160)
-- Name: veiculos_segurancas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.veiculos_segurancas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.veiculos_segurancas_id_seq OWNER TO postgres;

--
-- TOC entry 2525 (class 0 OID 0)
-- Dependencies: 229
-- Name: veiculos_segurancas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.veiculos_segurancas_id_seq OWNED BY public.veiculos_segurancas.id;


--
-- TOC entry 232 (class 1259 OID 31180)
-- Name: veiculos_tecnologias; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.veiculos_tecnologias (
    id integer NOT NULL,
    veiculo_id integer NOT NULL,
    tecnologia_id integer NOT NULL,
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.veiculos_tecnologias OWNER TO postgres;

--
-- TOC entry 231 (class 1259 OID 31178)
-- Name: veiculos_tecnologias_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.veiculos_tecnologias_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.veiculos_tecnologias_id_seq OWNER TO postgres;

--
-- TOC entry 2526 (class 0 OID 0)
-- Dependencies: 231
-- Name: veiculos_tecnologias_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.veiculos_tecnologias_id_seq OWNED BY public.veiculos_tecnologias.id;


--
-- TOC entry 236 (class 1259 OID 31219)
-- Name: vendas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vendas (
    id integer NOT NULL,
    veiculo_id integer NOT NULL,
    cliente_id integer NOT NULL,
    usuario_id integer NOT NULL,
    data date,
    valor_total numeric(11,2),
    valor_entrada numeric(11,2),
    numero_parcelas integer,
    tipo_pagamento character varying(100),
    juros integer,
    observacoes text,
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.vendas OWNER TO postgres;

--
-- TOC entry 235 (class 1259 OID 31217)
-- Name: vendas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.vendas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.vendas_id_seq OWNER TO postgres;

--
-- TOC entry 2527 (class 0 OID 0)
-- Dependencies: 235
-- Name: vendas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.vendas_id_seq OWNED BY public.vendas.id;


--
-- TOC entry 238 (class 1259 OID 31245)
-- Name: vendas_veiculos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vendas_veiculos (
    id integer NOT NULL,
    venda_id integer NOT NULL,
    data_vencimento date,
    valor_parcela numeric(11,2),
    status boolean,
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.vendas_veiculos OWNER TO postgres;

--
-- TOC entry 237 (class 1259 OID 31243)
-- Name: vendas_veiculos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.vendas_veiculos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.vendas_veiculos_id_seq OWNER TO postgres;

--
-- TOC entry 2528 (class 0 OID 0)
-- Dependencies: 237
-- Name: vendas_veiculos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.vendas_veiculos_id_seq OWNED BY public.vendas_veiculos.id;


--
-- TOC entry 200 (class 1259 OID 30947)
-- Name: versoes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.versoes (
    id integer NOT NULL,
    nome character varying(200),
    slug character varying(200),
    modelo_id integer,
    combustivel_id integer,
    ano_fabricacao character varying(4),
    ano_modelo character varying(4),
    peso numeric(11,2),
    numero_assentos integer,
    numero_portas integer,
    consumo_cidade numeric(11,2),
    consumo_estrada numeric(11,2),
    motor character varying(100),
    cavalos_potencia character varying(200),
    cavalos_potencia_rpm character varying(200),
    torque character varying(200),
    torque_rpm character varying(200),
    observacoes text,
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.versoes OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 30945)
-- Name: versoes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.versoes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.versoes_id_seq OWNER TO postgres;

--
-- TOC entry 2529 (class 0 OID 0)
-- Dependencies: 199
-- Name: versoes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.versoes_id_seq OWNED BY public.versoes.id;


--
-- TOC entry 2188 (class 2604 OID 31081)
-- Name: acabamentos_internos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.acabamentos_internos ALTER COLUMN id SET DEFAULT nextval('public.acabamentos_internos_id_seq'::regclass);


--
-- TOC entry 2185 (class 2604 OID 31051)
-- Name: cambios id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cambios ALTER COLUMN id SET DEFAULT nextval('public.cambios_id_seq'::regclass);


--
-- TOC entry 2174 (class 2604 OID 30907)
-- Name: carrocerias id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.carrocerias ALTER COLUMN id SET DEFAULT nextval('public.carrocerias_id_seq'::regclass);


--
-- TOC entry 2178 (class 2604 OID 30971)
-- Name: clientes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes ALTER COLUMN id SET DEFAULT nextval('public.clientes_id_seq'::regclass);


--
-- TOC entry 2176 (class 2604 OID 30940)
-- Name: combustiveis id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.combustiveis ALTER COLUMN id SET DEFAULT nextval('public.combustiveis_id_seq'::regclass);


--
-- TOC entry 2194 (class 2604 OID 31201)
-- Name: compras id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compras ALTER COLUMN id SET DEFAULT nextval('public.compras_id_seq'::regclass);


--
-- TOC entry 2180 (class 2604 OID 31001)
-- Name: confortos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.confortos ALTER COLUMN id SET DEFAULT nextval('public.confortos_id_seq'::regclass);


--
-- TOC entry 2186 (class 2604 OID 31061)
-- Name: cores_externas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cores_externas ALTER COLUMN id SET DEFAULT nextval('public.cores_externas_id_seq'::regclass);


--
-- TOC entry 2187 (class 2604 OID 31071)
-- Name: cores_internas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cores_internas ALTER COLUMN id SET DEFAULT nextval('public.cores_internas_id_seq'::regclass);


--
-- TOC entry 2182 (class 2604 OID 31021)
-- Name: estilos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estilos ALTER COLUMN id SET DEFAULT nextval('public.estilos_id_seq'::regclass);


--
-- TOC entry 2181 (class 2604 OID 31011)
-- Name: extras id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.extras ALTER COLUMN id SET DEFAULT nextval('public.extras_id_seq'::regclass);


--
-- TOC entry 2173 (class 2604 OID 30897)
-- Name: marcas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcas ALTER COLUMN id SET DEFAULT nextval('public.marcas_id_seq'::regclass);


--
-- TOC entry 2175 (class 2604 OID 30917)
-- Name: modelos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modelos ALTER COLUMN id SET DEFAULT nextval('public.modelos_id_seq'::regclass);


--
-- TOC entry 2170 (class 2604 OID 30859)
-- Name: perfis id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfis ALTER COLUMN id SET DEFAULT nextval('public.perfis_id_seq'::regclass);


--
-- TOC entry 2172 (class 2604 OID 30887)
-- Name: procedencias id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.procedencias ALTER COLUMN id SET DEFAULT nextval('public.procedencias_id_seq'::regclass);


--
-- TOC entry 2179 (class 2604 OID 30986)
-- Name: proprietarios id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proprietarios ALTER COLUMN id SET DEFAULT nextval('public.proprietarios_id_seq'::regclass);


--
-- TOC entry 2183 (class 2604 OID 31031)
-- Name: segurancas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.segurancas ALTER COLUMN id SET DEFAULT nextval('public.segurancas_id_seq'::regclass);


--
-- TOC entry 2184 (class 2604 OID 31041)
-- Name: tecnologias id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tecnologias ALTER COLUMN id SET DEFAULT nextval('public.tecnologias_id_seq'::regclass);


--
-- TOC entry 2171 (class 2604 OID 30869)
-- Name: usuarios id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios ALTER COLUMN id SET DEFAULT nextval('public.usuarios_id_seq'::regclass);


--
-- TOC entry 2189 (class 2604 OID 31091)
-- Name: veiculos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos ALTER COLUMN id SET DEFAULT nextval('public.veiculos_id_seq'::regclass);


--
-- TOC entry 2190 (class 2604 OID 31129)
-- Name: veiculos_confortos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_confortos ALTER COLUMN id SET DEFAULT nextval('public.veiculos_confortos_id_seq'::regclass);


--
-- TOC entry 2197 (class 2604 OID 31262)
-- Name: veiculos_estilos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_estilos ALTER COLUMN id SET DEFAULT nextval('public.veiculos_estilos_id_seq'::regclass);


--
-- TOC entry 2191 (class 2604 OID 31147)
-- Name: veiculos_extras id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_extras ALTER COLUMN id SET DEFAULT nextval('public.veiculos_extras_id_seq'::regclass);


--
-- TOC entry 2192 (class 2604 OID 31165)
-- Name: veiculos_segurancas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_segurancas ALTER COLUMN id SET DEFAULT nextval('public.veiculos_segurancas_id_seq'::regclass);


--
-- TOC entry 2193 (class 2604 OID 31183)
-- Name: veiculos_tecnologias id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_tecnologias ALTER COLUMN id SET DEFAULT nextval('public.veiculos_tecnologias_id_seq'::regclass);


--
-- TOC entry 2195 (class 2604 OID 31222)
-- Name: vendas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas ALTER COLUMN id SET DEFAULT nextval('public.vendas_id_seq'::regclass);


--
-- TOC entry 2196 (class 2604 OID 31248)
-- Name: vendas_veiculos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas_veiculos ALTER COLUMN id SET DEFAULT nextval('public.vendas_veiculos_id_seq'::regclass);


--
-- TOC entry 2177 (class 2604 OID 30950)
-- Name: versoes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.versoes ALTER COLUMN id SET DEFAULT nextval('public.versoes_id_seq'::regclass);


--
-- TOC entry 2475 (class 0 OID 31078)
-- Dependencies: 222
-- Data for Name: acabamentos_internos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.acabamentos_internos (id, nome, slug, criado_em, alterado_em) VALUES (8, 'Tecido', 'tecido', '2019-06-21 23:18:57', '2019-06-21 23:18:57');
INSERT INTO public.acabamentos_internos (id, nome, slug, criado_em, alterado_em) VALUES (9, 'Madeira', 'madeira', '2019-06-21 23:19:02', '2019-06-21 23:19:02');
INSERT INTO public.acabamentos_internos (id, nome, slug, criado_em, alterado_em) VALUES (10, 'Couro', 'couro', '2019-06-21 23:19:06', '2019-06-21 23:19:06');


--
-- TOC entry 2530 (class 0 OID 0)
-- Dependencies: 221
-- Name: acabamentos_internos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.acabamentos_internos_id_seq', 12, true);


--
-- TOC entry 2469 (class 0 OID 31048)
-- Dependencies: 216
-- Data for Name: cambios; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cambios (id, nome, slug, criado_em, alterado_em) VALUES (8, 'Automático de 4 marchas', 'automatico-de-4-marchas', '2019-06-21 23:19:24', '2019-06-21 23:19:24');
INSERT INTO public.cambios (id, nome, slug, criado_em, alterado_em) VALUES (9, 'Automático', 'automatico', '2019-06-21 23:51:59', '2019-06-21 23:51:59');
INSERT INTO public.cambios (id, nome, slug, criado_em, alterado_em) VALUES (10, 'Automatizado', 'automatizado', '2019-06-23 20:59:55', '2019-06-23 20:59:55');
INSERT INTO public.cambios (id, nome, slug, criado_em, alterado_em) VALUES (11, 'Automatizado de dupla embragem', 'automatizado-de-dupla-embragem', '2019-06-23 21:00:15', '2019-06-23 21:00:15');
INSERT INTO public.cambios (id, nome, slug, criado_em, alterado_em) VALUES (12, 'Manual', 'manual', '2019-06-23 21:00:21', '2019-06-23 21:00:21');
INSERT INTO public.cambios (id, nome, slug, criado_em, alterado_em) VALUES (13, 'Transmissão continuamente variável (CVT)', 'transmissao-continuamente-variavel-cvt', '2019-06-23 21:00:47', '2019-06-23 21:00:47');


--
-- TOC entry 2531 (class 0 OID 0)
-- Dependencies: 215
-- Name: cambios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cambios_id_seq', 13, true);


--
-- TOC entry 2447 (class 0 OID 30904)
-- Dependencies: 194
-- Data for Name: carrocerias; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.carrocerias (id, nome, slug, criado_em, alterado_em) VALUES (9, 'SUV', 'suv', '2019-06-21 22:56:06', '2019-06-21 22:56:06');
INSERT INTO public.carrocerias (id, nome, slug, criado_em, alterado_em) VALUES (10, 'Hatchback', 'hatchback', '2019-06-23 17:37:32', '2019-06-23 17:37:32');
INSERT INTO public.carrocerias (id, nome, slug, criado_em, alterado_em) VALUES (11, 'SW', 'sw', '2019-06-23 22:09:39', '2019-06-23 22:09:39');


--
-- TOC entry 2532 (class 0 OID 0)
-- Dependencies: 193
-- Name: carrocerias_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.carrocerias_id_seq', 11, true);


--
-- TOC entry 2455 (class 0 OID 30968)
-- Dependencies: 202
-- Data for Name: clientes; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.clientes (id, nome, rg, cpf, endereco, cidade, telefone, email, criado_em, alterado_em) VALUES (36, 'Theo Manoel Pedro Cardoso', '3262640972', '477.786.203-83', 'Belém - PA', 'Rua Quatro', '(91)98275-9394', 'ttheomanoelpedrocardoso@commscope.com', '2019-06-22 00:03:54', '2019-06-22 00:03:54');
INSERT INTO public.clientes (id, nome, rg, cpf, endereco, cidade, telefone, email, criado_em, alterado_em) VALUES (42, 'Erick Vinicius Eduardo da Costa', '1900377869', '664.755.284-71', ' Aracaju - CE', 'Rua José Quinta', '(79)98759-4444', 'eerickviniciuseduardodacosta@polifiltro.com.br', '2019-06-23 21:59:24', '2019-06-23 22:00:00');
INSERT INTO public.clientes (id, nome, rg, cpf, endereco, cidade, telefone, email, criado_em, alterado_em) VALUES (43, 'Renata Eloá Fogaça', '5036518498', '603.724.590-80', 'Barreiras - BA', 'Rua Presidente João Baptista Figueiredo', '(77)29446-6161', 'rrenataeloafogaca@davimil.com.br', '2019-06-23 22:36:46', '2019-06-23 22:36:46');
INSERT INTO public.clientes (id, nome, rg, cpf, endereco, cidade, telefone, email, criado_em, alterado_em) VALUES (44, 'Carolina Sara Tatiane da Paz', '2520933061', '968.055.100-82', 'Brasília - DF', 'Rua Rua 5 Chácara 120', '(61)98337-1267', 'carolinasaratatianedapaz-82@ouplook.com', '2019-06-23 22:44:50', '2019-06-23 22:44:50');


--
-- TOC entry 2533 (class 0 OID 0)
-- Dependencies: 201
-- Name: clientes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.clientes_id_seq', 44, true);


--
-- TOC entry 2451 (class 0 OID 30937)
-- Dependencies: 198
-- Data for Name: combustiveis; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.combustiveis (id, nome, slug, criado_em, alterado_em) VALUES (8, 'Flex', 'flex', '2019-06-21 23:06:30', '2019-06-21 23:06:30');
INSERT INTO public.combustiveis (id, nome, slug, criado_em, alterado_em) VALUES (9, 'Gasolina', 'gasolina', '2019-06-23 20:39:33', '2019-06-23 20:39:33');
INSERT INTO public.combustiveis (id, nome, slug, criado_em, alterado_em) VALUES (10, 'Diesel', 'diesel', '2019-06-23 20:58:52', '2019-06-23 20:58:52');
INSERT INTO public.combustiveis (id, nome, slug, criado_em, alterado_em) VALUES (11, 'Etanol', 'etanol', '2019-06-23 20:58:58', '2019-06-23 20:58:58');
INSERT INTO public.combustiveis (id, nome, slug, criado_em, alterado_em) VALUES (12, 'Gás natural veicular', 'gas-natural-veicular', '2019-06-23 20:59:03', '2019-06-23 20:59:03');
INSERT INTO public.combustiveis (id, nome, slug, criado_em, alterado_em) VALUES (13, 'Híbrido', 'hibrido', '2019-06-23 20:59:12', '2019-06-23 20:59:12');


--
-- TOC entry 2534 (class 0 OID 0)
-- Dependencies: 197
-- Name: combustiveis_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.combustiveis_id_seq', 13, true);


--
-- TOC entry 2487 (class 0 OID 31198)
-- Dependencies: 234
-- Data for Name: compras; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.compras (id, proprietario_id, veiculo_id, data, valor, observacoes, criado_em, alterado_em) VALUES (7, 5, 73, '2019-06-22', 60000.00, '', '2019-06-22 00:01:46', '2019-06-22 00:01:46');
INSERT INTO public.compras (id, proprietario_id, veiculo_id, data, valor, observacoes, criado_em, alterado_em) VALUES (8, 6, 74, '2019-06-23', 48000.00, '', '2019-06-23 22:02:51', '2019-06-23 22:02:51');


--
-- TOC entry 2535 (class 0 OID 0)
-- Dependencies: 233
-- Name: compras_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.compras_id_seq', 8, true);


--
-- TOC entry 2459 (class 0 OID 30998)
-- Dependencies: 206
-- Data for Name: confortos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (29, 'Ar-condicionado', 'ar-condicionado', '2019-06-21 23:20:56', '2019-06-21 23:20:56');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (30, 'Travas elétricas', 'travas-eletricas', '2019-06-21 23:21:05', '2019-06-21 23:21:05');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (31, 'Piloto automático', 'piloto-automatico', '2019-06-21 23:24:01', '2019-06-21 23:24:01');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (32, 'Volante com regulagem de altura', 'volante-com-regulagem-de-altura', '2019-06-21 23:24:10', '2019-06-21 23:24:10');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (33, 'Banco traseiro rebatível', 'banco-traseiro-rebativel', '2019-06-21 23:47:11', '2019-06-21 23:47:11');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (34, 'Bancos em couro', 'bancos-em-couro', '2019-06-21 23:47:17', '2019-06-21 23:47:17');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (35, 'Chave presencial', 'chave-presencial', '2019-06-21 23:47:22', '2019-06-21 23:47:22');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (36, 'Direção Assistida', 'direcao-assistida', '2019-06-21 23:47:28', '2019-06-21 23:47:28');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (37, 'Rodas de liga leve', 'rodas-de-liga-leve', '2019-06-21 23:47:34', '2019-06-21 23:47:34');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (38, 'Volante ajustável', 'volante-ajustavel', '2019-06-21 23:47:39', '2019-06-21 23:47:39');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (39, 'A / C', 'a--c', '2019-06-23 18:23:16', '2019-06-23 18:23:16');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (40, 'A/C Automático', 'ac-automatico', '2019-06-23 18:24:01', '2019-06-23 18:24:01');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (41, 'Ajuste elétrico dos retrovisores', 'ajuste-eletrico-dos-retrovisores', '2019-06-23 18:24:08', '2019-06-23 18:24:08');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (42, 'Banco do motorista com ajuste de altura', 'banco-do-motorista-com-ajuste-de-altura', '2019-06-23 18:24:18', '2019-06-23 18:24:18');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (44, 'Direção Eletro - hidráulica', 'direcao-eletro---hidraulica', '2019-06-23 18:24:36', '2019-06-23 18:24:36');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (46, 'Travas Elétricas', 'travas-eletricas', '2019-06-23 18:24:46', '2019-06-23 18:24:46');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (48, 'Volante revestido em couro', 'volante-revestido-em-couro', '2019-06-23 18:24:58', '2019-06-23 18:24:58');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (50, 'Banco c/ ajuste elétrico', 'banco-c-ajuste-eletrico', '2019-06-23 20:44:52', '2019-06-23 20:44:52');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (54, 'Aquecimento dos bancos dianteiros', 'aquecimento-dos-bancos-dianteiros', '2019-06-23 20:48:54', '2019-06-23 20:48:54');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (59, 'Bancos para 7 ocupantes', 'bancos-para-7-ocupantes', '2019-06-23 20:49:20', '2019-06-23 20:49:20');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (60, 'Carregador de celular por indução', 'carregador-de-celular-por-inducao', '2019-06-23 20:49:26', '2019-06-23 20:49:26');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (61, 'CD player', 'cd-player', '2019-06-23 20:49:32', '2019-06-23 20:49:32');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (62, 'CD player com MP3', 'cd-player-com-mp3', '2019-06-23 20:49:37', '2019-06-23 20:49:37');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (64, 'Comando de satélite no volante', 'comando-de-satelite-no-volante', '2019-06-23 20:49:48', '2019-06-23 20:49:48');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (65, 'Comando de Voz', 'comando-de-voz', '2019-06-23 20:49:53', '2019-06-23 20:49:53');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (68, 'Iluminação do porta - malas', 'iluminacao-do-porta---malas', '2019-06-23 20:50:11', '2019-06-23 20:50:11');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (71, 'Sistema de massagem nos bancos dianteiros', 'sistema-de-massagem-nos-bancos-dianteiros', '2019-06-23 20:50:25', '2019-06-23 20:50:25');
INSERT INTO public.confortos (id, nome, slug, criado_em, alterado_em) VALUES (72, 'Teto Panorâmico', 'teto-panoramico', '2019-06-23 20:50:31', '2019-06-23 20:50:31');


--
-- TOC entry 2536 (class 0 OID 0)
-- Dependencies: 205
-- Name: confortos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.confortos_id_seq', 76, true);


--
-- TOC entry 2471 (class 0 OID 31058)
-- Dependencies: 218
-- Data for Name: cores_externas; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cores_externas (id, nome, slug, criado_em, alterado_em) VALUES (10, 'Branco', 'branco', '2019-06-21 23:24:24', '2019-06-21 23:24:24');
INSERT INTO public.cores_externas (id, nome, slug, criado_em, alterado_em) VALUES (11, 'Preto', 'preto', '2019-06-21 23:52:45', '2019-06-21 23:52:45');
INSERT INTO public.cores_externas (id, nome, slug, criado_em, alterado_em) VALUES (12, 'Amarelo', 'amarelo', '2019-06-23 21:01:02', '2019-06-23 21:01:02');
INSERT INTO public.cores_externas (id, nome, slug, criado_em, alterado_em) VALUES (13, 'Cinza', 'cinza', '2019-06-23 21:01:07', '2019-06-23 21:01:07');
INSERT INTO public.cores_externas (id, nome, slug, criado_em, alterado_em) VALUES (14, 'Laranja', 'laranja', '2019-06-23 21:01:13', '2019-06-23 21:01:13');
INSERT INTO public.cores_externas (id, nome, slug, criado_em, alterado_em) VALUES (15, 'Prata', 'prata', '2019-06-23 21:01:19', '2019-06-23 21:01:19');
INSERT INTO public.cores_externas (id, nome, slug, criado_em, alterado_em) VALUES (16, 'Rosa', 'rosa', '2019-06-23 21:01:24', '2019-06-23 21:01:24');
INSERT INTO public.cores_externas (id, nome, slug, criado_em, alterado_em) VALUES (17, 'Roxo', 'roxo', '2019-06-23 21:01:30', '2019-06-23 21:01:30');
INSERT INTO public.cores_externas (id, nome, slug, criado_em, alterado_em) VALUES (18, 'Verde', 'verde', '2019-06-23 21:01:33', '2019-06-23 21:01:33');
INSERT INTO public.cores_externas (id, nome, slug, criado_em, alterado_em) VALUES (19, 'Vermelho', 'vermelho', '2019-06-23 21:01:40', '2019-06-23 21:01:40');


--
-- TOC entry 2537 (class 0 OID 0)
-- Dependencies: 217
-- Name: cores_externas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cores_externas_id_seq', 19, true);


--
-- TOC entry 2473 (class 0 OID 31068)
-- Dependencies: 220
-- Data for Name: cores_internas; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cores_internas (id, nome, slug, criado_em, alterado_em) VALUES (8, 'Preto', 'preto', '2019-06-21 23:25:31', '2019-06-21 23:25:31');
INSERT INTO public.cores_internas (id, nome, slug, criado_em, alterado_em) VALUES (9, 'Branco', 'branco', '2019-06-23 19:46:10', '2019-06-23 19:46:10');
INSERT INTO public.cores_internas (id, nome, slug, criado_em, alterado_em) VALUES (10, 'Bege', 'bege', '2019-06-23 21:01:52', '2019-06-23 21:01:52');
INSERT INTO public.cores_internas (id, nome, slug, criado_em, alterado_em) VALUES (11, 'Cinza', 'cinza', '2019-06-23 21:01:59', '2019-06-23 21:01:59');
INSERT INTO public.cores_internas (id, nome, slug, criado_em, alterado_em) VALUES (12, 'Marrom', 'marrom', '2019-06-23 21:02:10', '2019-06-23 21:02:10');
INSERT INTO public.cores_internas (id, nome, slug, criado_em, alterado_em) VALUES (13, 'Salmão', 'salmao', '2019-06-23 21:02:19', '2019-06-23 21:02:19');


--
-- TOC entry 2538 (class 0 OID 0)
-- Dependencies: 219
-- Name: cores_internas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cores_internas_id_seq', 13, true);


--
-- TOC entry 2463 (class 0 OID 31018)
-- Dependencies: 210
-- Data for Name: estilos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.estilos (id, nome, slug, criado_em, alterado_em) VALUES (10, 'Econômico', 'economico', '2019-06-21 23:32:05', '2019-06-21 23:32:05');
INSERT INTO public.estilos (id, nome, slug, criado_em, alterado_em) VALUES (11, 'Esportivo', 'esportivo', '2019-06-21 23:32:11', '2019-06-21 23:32:11');
INSERT INTO public.estilos (id, nome, slug, criado_em, alterado_em) VALUES (12, 'Família', 'familia', '2019-06-21 23:32:15', '2019-06-21 23:32:15');
INSERT INTO public.estilos (id, nome, slug, criado_em, alterado_em) VALUES (13, 'Offroad', 'offroad', '2019-06-21 23:32:20', '2019-06-21 23:32:20');
INSERT INTO public.estilos (id, nome, slug, criado_em, alterado_em) VALUES (14, 'Passeio', 'passeio', '2019-06-21 23:32:26', '2019-06-21 23:32:26');
INSERT INTO public.estilos (id, nome, slug, criado_em, alterado_em) VALUES (15, 'Trabalho', 'trabalho', '2019-06-21 23:32:31', '2019-06-21 23:32:31');


--
-- TOC entry 2539 (class 0 OID 0)
-- Dependencies: 209
-- Name: estilos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.estilos_id_seq', 15, true);


--
-- TOC entry 2461 (class 0 OID 31008)
-- Dependencies: 208
-- Data for Name: extras; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (23, 'Computador de bordo', 'computador-de-bordo', '2019-06-21 23:25:52', '2019-06-21 23:25:52');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (24, 'Sensor de farol', 'sensor-de-farol', '2019-06-21 23:26:01', '2019-06-21 23:26:01');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (25, 'Farol de neblina', 'farol-de-neblina', '2019-06-21 23:26:09', '2019-06-21 23:26:09');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (26, 'Kit multimídia', 'kit-multimidia', '2019-06-21 23:49:39', '2019-06-21 23:49:39');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (27, 'Película', 'pelicula', '2019-06-21 23:49:44', '2019-06-21 23:49:44');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (28, 'Rodas de liga leve', 'rodas-de-liga-leve', '2019-06-21 23:49:50', '2019-06-21 23:49:50');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (29, 'Acabameto interno Carbone Fonce', 'acabameto-interno-carbone-fonce', '2019-06-23 20:56:57', '2019-06-23 20:56:57');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (30, 'Engate de Reboque', 'engate-de-reboque', '2019-06-23 20:57:03', '2019-06-23 20:57:03');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (31, 'Entrada auxiliar de áudio', 'entrada-auxiliar-de-audio', '2019-06-23 20:57:08', '2019-06-23 20:57:08');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (32, 'Faróis de nevoeiro', 'farois-de-nevoeiro', '2019-06-23 20:57:13', '2019-06-23 20:57:13');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (33, 'Função siga-me', 'funcao-siga-me', '2019-06-23 20:57:18', '2019-06-23 20:57:18');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (34, 'GPS', 'gps', '2019-06-23 20:57:25', '2019-06-23 20:57:25');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (35, 'Lona Marítima', 'lona-maritima', '2019-06-23 20:57:31', '2019-06-23 20:57:31');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (36, 'Maçanetas internas cromadas', 'macanetas-internas-cromadas', '2019-06-23 20:57:37', '2019-06-23 20:57:37');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (38, 'Pneus BF Goodrich', 'pneus-bf-goodrich', '2019-06-23 20:57:48', '2019-06-23 20:57:48');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (39, 'Protetor de Caçamba', 'protetor-de-cacamba', '2019-06-23 20:57:53', '2019-06-23 20:57:53');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (40, 'Revestimento Couro Nasca Bege', 'revestimento-couro-nasca-bege', '2019-06-23 20:57:58', '2019-06-23 20:57:58');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (41, 'Roda de LL 19"', 'roda-de-ll-19', '2019-06-23 20:58:05', '2019-06-23 20:58:05');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (42, 'Roda Liga Leve 18', 'roda-liga-leve-18', '2019-06-23 20:58:10', '2019-06-23 20:58:10');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (44, 'Rodas Grand Prix em liga leve aro 17"', 'rodas-grand-prix-em-liga-leve-aro-17', '2019-06-23 20:58:21', '2019-06-23 20:58:21');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (45, 'Stripping lateral R.S', 'stripping-lateral-rs', '2019-06-23 20:58:26', '2019-06-23 20:58:26');
INSERT INTO public.extras (id, nome, slug, criado_em, alterado_em) VALUES (46, 'Teto Solar', 'teto-solar', '2019-06-23 20:58:31', '2019-06-23 20:58:31');


--
-- TOC entry 2540 (class 0 OID 0)
-- Dependencies: 207
-- Name: extras_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.extras_id_seq', 46, true);


--
-- TOC entry 2445 (class 0 OID 30894)
-- Dependencies: 192
-- Data for Name: marcas; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (51, 'PEUGEOT', 'peugeot', '2019-06-21 22:52:15', '2019-06-21 22:52:15');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (52, 'KIA', 'kia', '2019-06-21 23:36:35', '2019-06-21 23:36:35');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (53, 'CITROËN', 'citroen', '2019-06-23 17:36:38', '2019-06-23 17:36:38');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (54, 'HYUNDAI', 'hyundai', '2019-06-23 20:31:43', '2019-06-23 20:31:43');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (55, 'CHEVROLET', 'chevrolet', '2019-06-23 22:08:51', '2019-06-23 22:08:51');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (56, 'ACURA', 'acura', '2019-06-23 22:11:59', '2019-06-23 22:12:28');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (57, 'AUDI', 'audi', '2019-06-23 22:12:05', '2019-06-23 22:12:37');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (58, 'VOLVO', 'volvo', '2019-06-23 22:12:13', '2019-06-23 22:12:44');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (59, 'VOLKSWAGEN', 'volkswagen', '2019-06-23 22:12:17', '2019-06-23 22:12:59');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (60, 'TOYOTA', 'toyota', '2019-06-23 22:13:09', '2019-06-23 22:13:09');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (61, 'DODGE', 'dodge', '2019-06-23 22:13:16', '2019-06-23 22:13:16');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (62, 'FORD', 'ford', '2019-06-23 22:13:20', '2019-06-23 22:13:20');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (63, 'FIAT', 'fiat', '2019-06-23 22:13:24', '2019-06-23 22:13:24');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (64, 'HONDA', 'honda', '2019-06-23 22:13:32', '2019-06-23 22:13:32');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (65, 'BENTLEY', 'bentley', '2019-06-23 22:13:47', '2019-06-23 22:13:47');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (66, 'BMW', 'bmw', '2019-06-23 22:13:51', '2019-06-23 22:13:51');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (67, 'BUICK', 'buick', '2019-06-23 22:13:58', '2019-06-23 22:13:58');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (68, 'CHRYSLER', 'chrysler', '2019-06-23 22:14:07', '2019-06-23 22:14:07');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (69, 'DAIHATSU', 'daihatsu', '2019-06-23 22:14:15', '2019-06-23 22:14:15');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (70, 'FERRARI', 'ferrari', '2019-06-23 22:14:25', '2019-06-23 22:14:25');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (71, 'GREAT WALL MOTORS', 'great-wall-motors', '2019-06-23 22:14:39', '2019-06-23 22:14:39');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (72, 'ISUZU', 'isuzu', '2019-06-23 22:14:46', '2019-06-23 22:14:46');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (73, 'JAGUAR', 'jaguar', '2019-06-23 22:14:52', '2019-06-23 22:14:52');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (74, 'JEEP', 'jeep', '2019-06-23 22:14:57', '2019-06-23 22:14:57');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (80, 'LAMBORGHINI', 'lamborghini', '2019-06-23 22:24:00', '2019-06-23 22:24:00');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (81, 'LAND ROVER', 'land-rover', '2019-06-23 22:24:07', '2019-06-23 22:24:07');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (82, 'LEXUS', 'lexus', '2019-06-23 22:24:11', '2019-06-23 22:24:11');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (83, 'LINCOLN', 'lincoln', '2019-06-23 22:24:20', '2019-06-23 22:24:20');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (84, 'MAHINDRA', 'mahindra', '2019-06-23 22:24:28', '2019-06-23 22:24:28');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (85, 'MERCEDES BENZ', 'mercedes-benz', '2019-06-23 22:24:34', '2019-06-23 22:24:47');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (86, 'MINI', 'mini', '2019-06-23 22:24:53', '2019-06-23 22:24:53');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (87, 'MITSUBISHI', 'mitsubishi', '2019-06-23 22:25:07', '2019-06-23 22:25:07');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (88, 'NISSAN', 'nissan', '2019-06-23 22:25:11', '2019-06-23 22:25:11');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (89, 'OPEL', 'opel', '2019-06-23 22:25:16', '2019-06-23 22:25:16');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (91, 'PORSCHE', 'porsche', '2019-06-23 22:25:33', '2019-06-23 22:25:33');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (92, 'RENAULT', 'renault', '2019-06-23 22:25:39', '2019-06-23 22:25:39');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (93, 'ROLLS ROYCE', 'rolls-royce', '2019-06-23 22:25:48', '2019-06-23 22:25:48');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (94, 'SAIC MOTOR', 'saic-motor', '2019-06-23 22:25:59', '2019-06-23 22:25:59');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (95, 'SEAT', 'seat', '2019-06-23 22:26:05', '2019-06-23 22:26:05');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (96, 'SKODA', 'skoda', '2019-06-23 22:26:11', '2019-06-23 22:26:11');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (97, 'SMART', 'smart', '2019-06-23 22:26:15', '2019-06-23 22:26:15');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (98, 'SABURU', 'saburu', '2019-06-23 22:26:19', '2019-06-23 22:26:19');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (99, 'SUZUKI', 'suzuki', '2019-06-23 22:26:23', '2019-06-23 22:26:23');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (100, 'TATA MOTORS', 'tata-motors', '2019-06-23 22:26:29', '2019-06-23 22:26:29');
INSERT INTO public.marcas (id, nome, slug, criado_em, alterado_em) VALUES (101, 'TESLA', 'tesla', '2019-06-23 22:26:36', '2019-06-23 22:26:36');


--
-- TOC entry 2541 (class 0 OID 0)
-- Dependencies: 191
-- Name: marcas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.marcas_id_seq', 102, true);


--
-- TOC entry 2449 (class 0 OID 30914)
-- Dependencies: 196
-- Data for Name: modelos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.modelos (id, marca_id, procedencia_id, carroceria_id, nome, slug, comprimento, altura, largura, criado_em, alterado_em) VALUES (11, 51, 4, 9, '2008', '2008', 4.16, 1.58, 1.74, '2019-06-21 22:57:00', '2019-06-21 22:57:00');
INSERT INTO public.modelos (id, marca_id, procedencia_id, carroceria_id, nome, slug, comprimento, altura, largura, criado_em, alterado_em) VALUES (12, 52, 4, 9, 'SOUL', 'soul', 4.14, 1.61, 1.80, '2019-06-21 23:39:07', '2019-06-21 23:39:07');
INSERT INTO public.modelos (id, marca_id, procedencia_id, carroceria_id, nome, slug, comprimento, altura, largura, criado_em, alterado_em) VALUES (13, 53, 4, 10, 'C3', 'c3', 3.94, 1.52, 1.71, '2019-06-23 17:40:36', '2019-06-23 17:40:36');
INSERT INTO public.modelos (id, marca_id, procedencia_id, carroceria_id, nome, slug, comprimento, altura, largura, criado_em, alterado_em) VALUES (14, 54, 5, 9, 'Santa Fe', 'santa-fe', 4.92, 1.69, 1.88, '2019-06-23 20:38:18', '2019-06-23 20:38:18');
INSERT INTO public.modelos (id, marca_id, procedencia_id, carroceria_id, nome, slug, comprimento, altura, largura, criado_em, alterado_em) VALUES (15, 55, 4, 11, 'SPIN', 'spin', 4.42, 1.67, 1.74, '2019-06-23 22:10:42', '2019-06-23 22:10:42');


--
-- TOC entry 2542 (class 0 OID 0)
-- Dependencies: 195
-- Name: modelos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.modelos_id_seq', 15, true);


--
-- TOC entry 2439 (class 0 OID 30856)
-- Dependencies: 186
-- Data for Name: perfis; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.perfis (id, nome, slug, criado_em, alterado_em) VALUES (2, 'Administrador', 'administrador', '2019-06-22 00:08:40', '2019-06-22 00:08:40');
INSERT INTO public.perfis (id, nome, slug, criado_em, alterado_em) VALUES (3, 'Funcionário', 'funcionario', '2019-06-23 22:01:35', '2019-06-23 22:01:35');


--
-- TOC entry 2543 (class 0 OID 0)
-- Dependencies: 185
-- Name: perfis_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.perfis_id_seq', 3, true);


--
-- TOC entry 2443 (class 0 OID 30884)
-- Dependencies: 190
-- Data for Name: procedencias; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.procedencias (id, nome, slug, criado_em, alterado_em) VALUES (4, 'Nacional', 'nacional', '2019-06-21 22:54:51', '2019-06-21 22:54:51');
INSERT INTO public.procedencias (id, nome, slug, criado_em, alterado_em) VALUES (5, 'Importado', 'importado', '2019-06-21 22:54:56', '2019-06-21 22:54:56');


--
-- TOC entry 2544 (class 0 OID 0)
-- Dependencies: 189
-- Name: procedencias_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.procedencias_id_seq', 5, true);


--
-- TOC entry 2457 (class 0 OID 30983)
-- Dependencies: 204
-- Data for Name: proprietarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.proprietarios (id, nome, rg, cpf, endereco, cidade, telefone, email, criado_em, alterado_em) VALUES (5, ' Elaine Natália Emily Barbosa', '1223765354', '057.197.366-38', 'São Luís', 'Rua Vinte e Seis', '(98)39738-5051', 'elainenataliaemilybarbosa@grupoarteoficio.com.br ', '2019-06-22 00:00:28', '2019-06-22 00:00:44');
INSERT INTO public.proprietarios (id, nome, rg, cpf, endereco, cidade, telefone, email, criado_em, alterado_em) VALUES (6, 'Eduarda Juliana de Paula', '1004515361', '872.110.392-56', 'Abaíra - BA', 'Praça Camerino Novais 16', '(77)99705-0136', 'eduardajulianadepaula-99@megamega.com.br', '2019-06-23 22:01:11', '2019-06-23 22:01:11');
INSERT INTO public.proprietarios (id, nome, rg, cpf, endereco, cidade, telefone, email, criado_em, alterado_em) VALUES (7, 'Yago Alexandre Pires', '2515807145', '707.288.314-22', 'Quadra SQNW 302 Bloco C', 'Brasília - DF', '(61)98853-8757', 'yagoalexandrepires_@live.com.br', '2019-06-23 22:39:57', '2019-06-23 22:39:57');
INSERT INTO public.proprietarios (id, nome, rg, cpf, endereco, cidade, telefone, email, criado_em, alterado_em) VALUES (8, 'Ian Eduardo da Rocha', '4435170839', '882.578.793-63', 'Curitiba - PR', 'Rua Benedito França', '(41)99619-2476', 'iianeduardodarocha@engemanltda.com.br', '2019-06-23 22:41:42', '2019-06-23 22:41:42');
INSERT INTO public.proprietarios (id, nome, rg, cpf, endereco, cidade, telefone, email, criado_em, alterado_em) VALUES (9, 'Débora Lorena Carla Martins', '1618512165', '426.581.706-88', 'Natal - RN', 'Rua Primavera', '(84)99406-3834', 'ddeboralorenacarlamartins@negleribeiro.com', '2019-06-23 22:42:49', '2019-06-23 22:42:49');


--
-- TOC entry 2545 (class 0 OID 0)
-- Dependencies: 203
-- Name: proprietarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.proprietarios_id_seq', 9, true);


--
-- TOC entry 2465 (class 0 OID 31028)
-- Dependencies: 212
-- Data for Name: segurancas; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (39, 'Airbag motorista', 'airbag-motorista', '2019-06-21 23:26:22', '2019-06-21 23:26:22');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (40, 'Alarme', 'alarme', '2019-06-21 23:26:31', '2019-06-21 23:26:31');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (42, 'Airbag passageiro', 'airbag-passageiro', '2019-06-21 23:26:46', '2019-06-21 23:26:46');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (43, 'Airbag lateral', 'airbag-lateral', '2019-06-21 23:26:59', '2019-06-21 23:26:59');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (44, 'Controle de tração', 'controle-de-tracao', '2019-06-21 23:27:06', '2019-06-21 23:27:06');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (45, 'Distribuição eletrônica de frenagem', 'distribuicao-eletronica-de-frenagem', '2019-06-21 23:27:18', '2019-06-21 23:27:18');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (46, 'Barras de proteção laterais', 'barras-de-protecao-laterais', '2019-06-21 23:47:51', '2019-06-21 23:47:51');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (47, 'Freios a Disco nas 4 rodas', 'freios-a-disco-nas-4-rodas', '2019-06-21 23:48:00', '2019-06-21 23:48:00');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (49, 'Isofix', 'isofix', '2019-06-21 23:48:16', '2019-06-21 23:48:16');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (50, 'Luzes de condução diurna', 'luzes-de-conducao-diurna', '2019-06-21 23:48:21', '2019-06-21 23:48:21');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (51, 'Sensores de estacionamento traseiro', 'sensores-de-estacionamento-traseiro', '2019-06-21 23:48:26', '2019-06-21 23:48:26');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (52, 'Sistemas EBD e BAS', 'sistemas-ebd-e-bas', '2019-06-21 23:48:32', '2019-06-21 23:48:32');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (53, 'Airbags para motorista e passageiro frontal', 'airbags-para-motorista-e-passageiro-frontal', '2019-06-23 17:43:02', '2019-06-23 17:43:02');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (54, 'Alarme perimétrico', 'alarme-perimetrico', '2019-06-23 17:43:08', '2019-06-23 17:43:08');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (55, 'Alerta do cinto de segurança do motorista', 'alerta-do-cinto-de-seguranca-do-motorista', '2019-06-23 17:43:15', '2019-06-23 17:43:15');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (56, 'Farol de Neblina', 'farol-de-neblina', '2019-06-23 17:43:21', '2019-06-23 17:43:21');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (67, 'Air bags de cortina', 'air-bags-de-cortina', '2019-06-23 20:40:12', '2019-06-23 20:40:12');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (68, 'Air bags laterais', 'air-bags-laterais', '2019-06-23 20:40:19', '2019-06-23 20:40:19');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (70, 'Alerta de colisão', 'alerta-de-colisao', '2019-06-23 20:40:31', '2019-06-23 20:40:31');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (72, 'Assistente de partida em subidas', 'assistente-de-partida-em-subidas', '2019-06-23 20:40:43', '2019-06-23 20:40:43');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (73, 'Assistente de subida', 'assistente-de-subida', '2019-06-23 20:40:48', '2019-06-23 20:40:48');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (74, 'Câmera traseira para manobras', 'camera-traseira-para-manobras', '2019-06-23 20:40:53', '2019-06-23 20:40:53');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (41, 'Limitador de Velocidade', 'limitador-de-velocidade', '2019-06-21 23:26:39', '2019-06-23 20:42:43');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (83, 'Monitor de Pressão dos Pneus', 'monitor-de-pressao-dos-pneus', '2019-06-23 20:43:10', '2019-06-23 20:43:10');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (86, 'Tração 4x4', 'tracao-4x4', '2019-06-23 20:43:28', '2019-06-23 20:43:28');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (89, 'Airbags de cabeça diant/tras', 'airbags-de-cabeca-dianttras', '2019-06-23 20:45:42', '2019-06-23 20:45:42');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (98, 'Controle eletrônico de estabilidade', 'controle-eletronico-de-estabilidade', '2019-06-23 20:46:42', '2019-06-23 20:46:42');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (99, 'Discos de freio perfurados e ventilados nas quatro rodas', 'discos-de-freio-perfurados-e-ventilados-nas-quatro-rodas', '2019-06-23 20:46:47', '2019-06-23 20:46:47');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (101, 'Faróis anti - neblina', 'farois-anti---neblina', '2019-06-23 20:47:05', '2019-06-23 20:47:05');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (102, 'Farois de Xenon', 'farois-de-xenon', '2019-06-23 20:47:10', '2019-06-23 20:47:10');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (104, 'Freio a disco nas 4 rodas', 'freio-a-disco-nas-4-rodas', '2019-06-23 20:47:27', '2019-06-23 20:47:27');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (105, 'Leitor de placas', 'leitor-de-placas', '2019-06-23 20:47:33', '2019-06-23 20:47:33');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (109, 'Sensor de Farol', 'sensor-de-farol', '2019-06-23 20:47:56', '2019-06-23 20:47:56');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (110, 'Sensor de neblina', 'sensor-de-neblina', '2019-06-23 20:48:02', '2019-06-23 20:48:02');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (112, 'Sistema CAR', 'sistema-car', '2019-06-23 20:48:12', '2019-06-23 20:48:12');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (113, 'Sistema de permanência em faixa', 'sistema-de-permanencia-em-faixa', '2019-06-23 20:48:18', '2019-06-23 20:48:18');
INSERT INTO public.segurancas (id, nome, slug, criado_em, alterado_em) VALUES (114, 'Freios ABS', 'freios-abs', '2019-06-23 21:07:12', '2019-06-23 21:07:12');


--
-- TOC entry 2546 (class 0 OID 0)
-- Dependencies: 211
-- Name: segurancas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.segurancas_id_seq', 114, true);


--
-- TOC entry 2467 (class 0 OID 31038)
-- Dependencies: 214
-- Data for Name: tecnologias; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (58, 'Entrada USB', 'entrada-usb', '2019-06-21 23:27:34', '2019-06-21 23:27:34');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (59, 'Rádio FM/AM', 'radio-fmam', '2019-06-21 23:27:42', '2019-06-21 23:27:42');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (60, 'Kit Multimídia', 'kit-multimidia', '2019-06-21 23:27:47', '2019-06-21 23:27:47');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (61, 'Acendimento automático dos faróis', 'acendimento-automatico-dos-farois', '2019-06-21 23:48:41', '2019-06-21 23:48:41');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (62, 'Bluetooth', 'bluetooth', '2019-06-21 23:48:49', '2019-06-21 23:48:49');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (63, 'Conexão USB', 'conexao-usb', '2019-06-21 23:49:00', '2019-06-21 23:49:00');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (64, 'Controles de áudio do volante', 'controles-de-audio-do-volante', '2019-06-21 23:49:05', '2019-06-21 23:49:05');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (65, 'Estéreo AM / FM', 'estereo-am--fm', '2019-06-21 23:49:13', '2019-06-21 23:49:13');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (66, 'Indicador de temperatura externa', 'indicador-de-temperatura-externa', '2019-06-21 23:49:19', '2019-06-21 23:49:19');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (67, 'Sensor de estacionamento', 'sensor-de-estacionamento', '2019-06-21 23:49:24', '2019-06-21 23:49:24');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (68, 'Volante multifuncional', 'volante-multifuncional', '2019-06-21 23:49:30', '2019-06-21 23:49:30');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (69, 'Ar Condicionado Digital', 'ar-condicionado-digital', '2019-06-23 18:25:10', '2019-06-23 18:25:10');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (73, 'Entrada MP3 ', 'entrada-mp3-', '2019-06-23 18:25:40', '2019-06-23 18:25:40');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (74, 'Espelhamento da tela do celular ', 'espelhamento-da-tela-do-celular-', '2019-06-23 18:25:45', '2019-06-23 18:25:45');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (76, 'Integração com smartphones ', 'integracao-com-smartphones-', '2019-06-23 18:25:56', '2019-06-23 18:25:56');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (77, 'Retrovisores Rebatíveis ', 'retrovisores-rebativeis-', '2019-06-23 18:26:01', '2019-06-23 18:26:01');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (79, 'Sistema Multimídia Interface ', 'sistema-multimidia-interface-', '2019-06-23 18:26:11', '2019-06-23 18:26:11');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (80, 'Transmissão automática de 6 velocidades sequencial ', 'transmissao-automatica-de-6-velocidades-sequencial-', '2019-06-23 18:26:17', '2019-06-23 18:26:17');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (87, 'Ajuste Elétrico do banco', 'ajuste-eletrico-do-banco', '2019-06-23 20:51:25', '2019-06-23 20:51:25');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (89, 'Assistente de faixa de rodagem', 'assistente-de-faixa-de-rodagem', '2019-06-23 20:51:36', '2019-06-23 20:51:36');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (90, 'Assistente de frenagem', 'assistente-de-frenagem', '2019-06-23 20:51:41', '2019-06-23 20:51:41');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (91, 'Botão Start/Stop para partida do motor por reconhecimento da chave Smart Key', 'botao-startstop-para-partida-do-motor-por-reconhecimento-da-chave-smart-key', '2019-06-23 20:51:51', '2019-06-23 20:51:51');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (71, 'Câmbio automático', 'cambio-automatico', '2019-06-23 18:25:24', '2019-06-23 20:52:26');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (93, 'Câmbio automático 6 marchas', 'cambio-automatico-6-marchas', '2019-06-23 20:52:32', '2019-06-23 20:52:41');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (94, 'Câmbio automático 7 marchas', 'cambio-automatico-7-marchas', '2019-06-23 20:52:44', '2019-06-23 20:52:44');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (95, 'Câmbio automático 8 marchas', 'cambio-automatico-8-marchas', '2019-06-23 20:52:49', '2019-06-23 20:52:49');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (96, 'Câmbio Manual', 'cambio-manual', '2019-06-23 20:52:55', '2019-06-23 20:52:55');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (97, 'Comando de Voz', 'comando-de-voz', '2019-06-23 20:53:00', '2019-06-23 20:53:00');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (98, 'Computador de Bordo', 'computador-de-bordo', '2019-06-23 20:53:07', '2019-06-23 20:53:07');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (99, 'Conexão Bluetooth', 'conexao-bluetooth', '2019-06-23 20:53:45', '2019-06-23 20:53:45');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (102, 'Entrada de Áudio Auxiliar', 'entrada-de-audio-auxiliar', '2019-06-23 20:54:00', '2019-06-23 20:54:00');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (105, 'Espelhamento da tela do celular', 'espelhamento-da-tela-do-celular', '2019-06-23 20:54:18', '2019-06-23 20:54:18');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (107, 'Freio de estacionamento Elétrico', 'freio-de-estacionamento-eletrico', '2019-06-23 20:54:29', '2019-06-23 20:54:29');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (108, 'Freio de estacionamento eletromecânico', 'freio-de-estacionamento-eletromecanico', '2019-06-23 20:54:34', '2019-06-23 20:54:34');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (109, 'Head-up Display', 'head-up-display', '2019-06-23 20:54:39', '2019-06-23 20:54:39');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (112, 'Motor V10 Aspirado', 'motor-v10-aspirado', '2019-06-23 20:54:55', '2019-06-23 20:54:55');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (113, 'Porta luvas climatizado', 'porta-luvas-climatizado', '2019-06-23 20:55:00', '2019-06-23 20:55:00');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (116, 'Sistema Audi Drive Select', 'sistema-audi-drive-select', '2019-06-23 20:55:16', '2019-06-23 20:55:16');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (117, 'Sistema de condução Eco Drive/Sport/Normal', 'sistema-de-conducao-eco-drivesportnormal', '2019-06-23 20:55:21', '2019-06-23 20:55:21');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (118, 'Sistema de lavagem de faróis', 'sistema-de-lavagem-de-farois', '2019-06-23 20:55:27', '2019-06-23 20:55:27');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (119, 'Sistema de navegação MMI touch', 'sistema-de-navegacao-mmi-touch', '2019-06-23 20:55:32', '2019-06-23 20:55:32');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (120, 'Sistema multimídia com tela de 7” sensível ao toque, conectividade de celular (Apple CarPlay e Android Auto), Bluetooth, entrada auxiliar, USB e controles de áudio e de chamadas no volante', 'sistema-multimidia-com-tela-de-7-sensivel-ao-toque-conectividade-de-celular-apple-carplay-e-android-auto-bluetooth-entrada-auxiliar-usb-e-controles-de-audio-e-de-chamadas-no-volante', '2019-06-23 20:55:40', '2019-06-23 20:55:40');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (122, 'Sistema Start Stop', 'sistema-start-stop', '2019-06-23 20:55:52', '2019-06-23 20:55:52');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (123, 'Tração traseira', 'tracao-traseira', '2019-06-23 20:55:57', '2019-06-23 20:55:57');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (125, 'Troca de Marchas no Volante', 'troca-de-marchas-no-volante', '2019-06-23 20:56:06', '2019-06-23 20:56:06');
INSERT INTO public.tecnologias (id, nome, slug, criado_em, alterado_em) VALUES (127, 'Zonas de ar condicionado: 2', 'zonas-de-ar-condicionado-2', '2019-06-23 20:56:17', '2019-06-23 20:56:17');


--
-- TOC entry 2547 (class 0 OID 0)
-- Dependencies: 213
-- Name: tecnologias_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tecnologias_id_seq', 130, true);


--
-- TOC entry 2441 (class 0 OID 30866)
-- Dependencies: 188
-- Data for Name: usuarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.usuarios (id, perfil_id, nome, email, data_nascimento, senha, confirma_senha, criado_em, alterado_em) VALUES (2, 2, 'Daniela Fernanda da Silva', 'daniela.silva6', '1997-08-27', '21232f297a57a5a743894a0e4a801fc3', '21232f297a57a5a743894a0e4a801fc3', '2019-06-22 00:09:12', '2019-06-22 00:09:12');
INSERT INTO public.usuarios (id, perfil_id, nome, email, data_nascimento, senha, confirma_senha, criado_em, alterado_em) VALUES (3, 2, 'Felipe Dahmer', 'felipe.dahmer', '1998-12-15', 'efb7b1a8fb0a9d662a229dc3b4c4a083', 'efb7b1a8fb0a9d662a229dc3b4c4a083', '2019-06-23 21:41:03', '2019-06-23 21:41:03');


--
-- TOC entry 2548 (class 0 OID 0)
-- Dependencies: 187
-- Name: usuarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuarios_id_seq', 4, true);


--
-- TOC entry 2477 (class 0 OID 31088)
-- Dependencies: 224
-- Data for Name: veiculos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.veiculos (id, versao_id, cambio_id, cor_externa_id, cor_interna_id, acabamento_interno_id, situacao, quilometragem, placa, chassi, renavam, numero_proprietarios, numero_ocorrencias, chave_reserva, manual_veiculo, vistoriado, valor, informacoes_veiculo, galeria, criado_em, alterado_em) VALUES (76, 11, 9, 10, 11, 8, 'Em negociação', 40.43, 'IFF-6451', '9LORDD0N84R119845', '20667876884', 2, 0, true, false, true, 54900.00, '', 'null', '2019-06-23 22:31:47', '2019-06-23 22:38:45');
INSERT INTO public.veiculos (id, versao_id, cambio_id, cor_externa_id, cor_interna_id, acabamento_interno_id, situacao, quilometragem, placa, chassi, renavam, numero_proprietarios, numero_ocorrencias, chave_reserva, manual_veiculo, vistoriado, valor, informacoes_veiculo, galeria, criado_em, alterado_em) VALUES (72, 5, 8, 10, 8, 10, 'Em negociação', 43.47, 'IHL-0279', '9BWZZZ377VT004251', '40309998580', 1, 0, true, true, true, 59500.00, '', 'null', '2019-06-21 23:31:02', '2019-06-23 20:30:04');
INSERT INTO public.veiculos (id, versao_id, cambio_id, cor_externa_id, cor_interna_id, acabamento_interno_id, situacao, quilometragem, placa, chassi, renavam, numero_proprietarios, numero_ocorrencias, chave_reserva, manual_veiculo, vistoriado, valor, informacoes_veiculo, galeria, criado_em, alterado_em) VALUES (75, 10, 9, 10, 12, 10, 'Em negociação', 39.83, 'FVX1025', '9PORF2L04T447963', '01021442272', 1, 0, true, true, false, 124990.00, '', 'null', '2019-06-23 21:05:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos (id, versao_id, cambio_id, cor_externa_id, cor_interna_id, acabamento_interno_id, situacao, quilometragem, placa, chassi, renavam, numero_proprietarios, numero_ocorrencias, chave_reserva, manual_veiculo, vistoriado, valor, informacoes_veiculo, galeria, criado_em, alterado_em) VALUES (73, 6, 9, 11, 8, 10, 'Vendido', 60.80, 'IXL2587', '9BWCA11J0Y4000001', '1097442907', 1, 0, true, true, true, 67900.00, 'Veículo na cor preta com detalhes em vermelho (teto e retrovisores). 
Veículo em ótimo estado de conservação, revisado em concessionária. 
Nossa equipe especializada detectou alguns retoques de pintura muito bem realizados, imperceptíveis ao olho, identificados apenas com equipamentos de medição de espessura de tinta.', 'null', '2019-06-21 23:57:30', '2019-06-23 21:16:01');
INSERT INTO public.veiculos (id, versao_id, cambio_id, cor_externa_id, cor_interna_id, acabamento_interno_id, situacao, quilometragem, placa, chassi, renavam, numero_proprietarios, numero_ocorrencias, chave_reserva, manual_veiculo, vistoriado, valor, informacoes_veiculo, galeria, criado_em, alterado_em) VALUES (74, 9, 9, 10, 8, 10, 'Vendido', 6.75, 'IYQ5275', '9BGRD08X04G117974', '01158925925', 1, 0, true, false, true, 49500.00, 'Veículo em perfeito estado de pintura e mecânica.

Com menos de 7 mil km, único dono, carro comprado zero.

Carro na garantia, manual, chave reserva.', 'null', '2019-06-23 19:52:16', '2019-06-23 22:05:27');


--
-- TOC entry 2479 (class 0 OID 31126)
-- Dependencies: 226
-- Data for Name: veiculos_confortos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (406, 74, 39, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (407, 74, 40, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (408, 74, 41, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (409, 74, 42, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (410, 74, 36, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (411, 74, 44, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (412, 74, 37, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (413, 74, 46, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (414, 74, 38, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (415, 74, 48, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (429, 76, 39, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (430, 76, 41, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (431, 76, 42, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (432, 76, 33, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (433, 76, 61, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (434, 76, 62, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (435, 76, 65, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (436, 76, 36, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (437, 76, 68, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (438, 76, 31, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (439, 76, 37, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (440, 76, 46, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (441, 76, 38, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (358, 72, 29, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (359, 72, 31, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (360, 72, 30, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (361, 72, 32, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (362, 75, 39, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (363, 75, 40, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (364, 75, 41, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (365, 75, 50, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (366, 75, 42, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (367, 75, 33, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (368, 75, 34, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (369, 75, 59, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (370, 75, 62, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (371, 75, 35, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (372, 75, 64, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (373, 75, 65, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (374, 75, 36, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (375, 75, 68, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (376, 75, 31, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (377, 75, 37, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (378, 75, 72, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (379, 75, 46, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (380, 75, 38, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (381, 75, 48, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (389, 73, 33, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (390, 73, 34, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (391, 73, 35, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (392, 73, 36, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (393, 73, 31, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (394, 73, 37, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_confortos (id, veiculo_id, conforto_id, criado_em, alterado_em) VALUES (395, 73, 38, '2019-06-23 21:16:01', '2019-06-23 21:16:01');


--
-- TOC entry 2549 (class 0 OID 0)
-- Dependencies: 225
-- Name: veiculos_confortos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.veiculos_confortos_id_seq', 441, true);


--
-- TOC entry 2493 (class 0 OID 31259)
-- Dependencies: 240
-- Data for Name: veiculos_estilos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (27, 72, 11, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (28, 72, 14, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (29, 75, 12, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (30, 75, 13, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (31, 75, 14, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (32, 75, 15, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (34, 73, 14, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (38, 74, 12, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (39, 74, 14, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (40, 74, 15, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (53, 76, 12, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (54, 76, 14, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_estilos (id, veiculo_id, estilo_id, criado_em, alterado_em) VALUES (55, 76, 15, '2019-06-23 22:38:45', '2019-06-23 22:38:45');


--
-- TOC entry 2550 (class 0 OID 0)
-- Dependencies: 239
-- Name: veiculos_estilos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.veiculos_estilos_id_seq', 55, true);


--
-- TOC entry 2481 (class 0 OID 31144)
-- Dependencies: 228
-- Data for Name: veiculos_extras; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (102, 76, 26, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (103, 76, 27, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (104, 76, 28, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (70, 72, 23, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (71, 72, 25, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (72, 72, 24, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (73, 75, 34, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (74, 75, 26, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (75, 75, 27, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (76, 75, 28, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (77, 75, 46, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (81, 73, 26, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (82, 73, 27, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (83, 73, 28, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (87, 74, 26, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (88, 74, 27, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_extras (id, veiculo_id, extra_id, criado_em, alterado_em) VALUES (89, 74, 28, '2019-06-23 22:05:27', '2019-06-23 22:05:27');


--
-- TOC entry 2551 (class 0 OID 0)
-- Dependencies: 227
-- Name: veiculos_extras_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.veiculos_extras_id_seq', 104, true);


--
-- TOC entry 2552 (class 0 OID 0)
-- Dependencies: 223
-- Name: veiculos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.veiculos_id_seq', 76, true);


--
-- TOC entry 2483 (class 0 OID 31162)
-- Dependencies: 230
-- Data for Name: veiculos_segurancas; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (263, 74, 53, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (264, 74, 54, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (265, 74, 55, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (266, 74, 56, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (267, 74, 41, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (268, 74, 50, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (269, 74, 51, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (279, 76, 53, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (280, 76, 54, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (281, 76, 70, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (282, 76, 55, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (222, 75, 67, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (223, 75, 68, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (224, 75, 53, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (225, 75, 54, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (226, 75, 70, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (227, 75, 55, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (228, 75, 72, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (229, 75, 73, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (230, 75, 74, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (231, 75, 44, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (232, 75, 56, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (233, 75, 47, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (234, 75, 114, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (235, 75, 49, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (283, 76, 73, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (284, 76, 45, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (285, 76, 114, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (286, 76, 41, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (287, 76, 51, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (144, 72, 43, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (145, 72, 39, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (146, 72, 42, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (147, 72, 40, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (148, 72, 45, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (149, 72, 41, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (236, 75, 41, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (237, 75, 50, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (238, 75, 83, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (239, 75, 51, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (240, 75, 52, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (241, 75, 86, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (249, 73, 46, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (250, 73, 47, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (251, 73, 49, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (252, 73, 41, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (253, 73, 50, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (254, 73, 51, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_segurancas (id, veiculo_id, seguranca_id, criado_em, alterado_em) VALUES (255, 73, 52, '2019-06-23 21:16:01', '2019-06-23 21:16:01');


--
-- TOC entry 2553 (class 0 OID 0)
-- Dependencies: 229
-- Name: veiculos_segurancas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.veiculos_segurancas_id_seq', 287, true);


--
-- TOC entry 2485 (class 0 OID 31180)
-- Dependencies: 232
-- Data for Name: veiculos_tecnologias; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (181, 75, 61, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (182, 75, 87, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (183, 75, 69, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (184, 75, 62, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (185, 75, 97, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (186, 75, 98, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (187, 75, 99, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (188, 75, 63, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (189, 75, 64, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (190, 75, 65, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (191, 75, 107, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (192, 75, 66, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (193, 75, 113, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (194, 75, 59, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (195, 75, 67, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (196, 75, 123, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (197, 75, 80, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (198, 75, 125, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (199, 75, 68, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (200, 75, 127, '2019-06-23 21:12:42', '2019-06-23 21:12:42');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (133, 72, 58, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (134, 72, 60, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (135, 72, 59, '2019-06-23 20:30:04', '2019-06-23 20:30:04');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (210, 73, 61, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (211, 73, 62, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (212, 73, 63, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (213, 73, 64, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (214, 73, 58, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (215, 73, 65, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (216, 73, 66, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (217, 73, 67, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (218, 73, 68, '2019-06-23 21:16:01', '2019-06-23 21:16:01');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (286, 76, 90, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (287, 76, 62, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (288, 76, 93, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (232, 74, 69, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (233, 74, 62, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (234, 74, 71, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (235, 74, 63, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (236, 74, 73, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (237, 74, 74, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (238, 74, 66, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (239, 74, 76, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (240, 74, 77, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (241, 74, 67, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (242, 74, 79, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (289, 76, 97, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (290, 76, 63, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (291, 76, 64, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (292, 76, 102, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (293, 76, 73, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (294, 76, 65, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (295, 76, 66, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (296, 76, 67, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (297, 76, 68, '2019-06-23 22:38:45', '2019-06-23 22:38:45');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (243, 74, 80, '2019-06-23 22:05:27', '2019-06-23 22:05:27');
INSERT INTO public.veiculos_tecnologias (id, veiculo_id, tecnologia_id, criado_em, alterado_em) VALUES (244, 74, 68, '2019-06-23 22:05:27', '2019-06-23 22:05:27');


--
-- TOC entry 2554 (class 0 OID 0)
-- Dependencies: 231
-- Name: veiculos_tecnologias_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.veiculos_tecnologias_id_seq', 297, true);


--
-- TOC entry 2489 (class 0 OID 31219)
-- Dependencies: 236
-- Data for Name: vendas; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.vendas (id, veiculo_id, cliente_id, usuario_id, data, valor_total, valor_entrada, numero_parcelas, tipo_pagamento, juros, observacoes, criado_em, alterado_em) VALUES (11, 73, 36, 2, '2019-06-23', 74490.00, 2000.00, 34, 'Dinheiro', 10, '', '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas (id, veiculo_id, cliente_id, usuario_id, data, valor_total, valor_entrada, numero_parcelas, tipo_pagamento, juros, observacoes, criado_em, alterado_em) VALUES (14, 74, 42, 2, '2019-06-23', 55425.00, 10000.00, 36, 'Cartão de débito', 15, '', '2019-06-23 22:05:51', '2019-06-23 22:05:51');


--
-- TOC entry 2555 (class 0 OID 0)
-- Dependencies: 235
-- Name: vendas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.vendas_id_seq', 14, true);


--
-- TOC entry 2491 (class 0 OID 31245)
-- Dependencies: 238
-- Data for Name: vendas_veiculos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (273, 11, '2019-07-25', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (274, 11, '2019-08-27', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (275, 11, '2019-10-01', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (276, 11, '2019-11-03', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (277, 11, '2019-12-05', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (278, 11, '2020-01-07', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (279, 11, '2020-02-09', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (280, 11, '2020-03-10', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (281, 11, '2020-04-12', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (282, 11, '2020-05-14', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (283, 11, '2020-06-16', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (284, 11, '2020-07-18', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (285, 11, '2020-08-20', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (286, 11, '2020-09-22', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (287, 11, '2020-10-24', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (288, 11, '2020-11-26', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (289, 11, '2020-12-28', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (290, 11, '2021-02-02', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (291, 11, '2021-03-04', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (292, 11, '2021-04-06', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (293, 11, '2021-05-08', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (294, 11, '2021-06-10', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (295, 11, '2021-07-12', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (296, 11, '2021-08-14', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (297, 11, '2021-09-16', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (298, 11, '2021-10-18', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (299, 11, '2021-11-20', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (300, 11, '2021-12-22', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (301, 11, '2022-01-24', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (302, 11, '2022-02-26', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (303, 11, '2022-03-28', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (304, 11, '2022-05-02', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (305, 11, '2022-06-04', 2191.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (306, 11, '2022-07-06', 2187.00, false, '2019-06-23 21:20:28', '2019-06-23 21:20:28');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (341, 14, '2019-07-25', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (342, 14, '2019-08-27', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (343, 14, '2019-10-01', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (344, 14, '2019-11-03', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (345, 14, '2019-12-05', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (346, 14, '2020-01-07', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (347, 14, '2020-02-09', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (348, 14, '2020-03-10', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (349, 14, '2020-04-12', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (350, 14, '2020-05-14', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (351, 14, '2020-06-16', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (352, 14, '2020-07-18', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (353, 14, '2020-08-20', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (354, 14, '2020-09-22', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (355, 14, '2020-10-24', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (356, 14, '2020-11-26', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (357, 14, '2020-12-28', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (358, 14, '2021-02-02', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (359, 14, '2021-03-04', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (360, 14, '2021-04-06', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (361, 14, '2021-05-08', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (362, 14, '2021-06-10', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (363, 14, '2021-07-12', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (364, 14, '2021-08-14', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (365, 14, '2021-09-16', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (366, 14, '2021-10-18', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (367, 14, '2021-11-20', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (368, 14, '2021-12-22', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (369, 14, '2022-01-24', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (370, 14, '2022-02-26', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (371, 14, '2022-03-28', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (372, 14, '2022-05-02', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (373, 14, '2022-06-04', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (374, 14, '2022-07-06', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (375, 14, '2022-08-08', 1540.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');
INSERT INTO public.vendas_veiculos (id, venda_id, data_vencimento, valor_parcela, status, criado_em, alterado_em) VALUES (376, 14, '2022-09-10', 1525.00, false, '2019-06-23 22:05:51', '2019-06-23 22:05:51');


--
-- TOC entry 2556 (class 0 OID 0)
-- Dependencies: 237
-- Name: vendas_veiculos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.vendas_veiculos_id_seq', 376, true);


--
-- TOC entry 2453 (class 0 OID 30947)
-- Dependencies: 200
-- Data for Name: versoes; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.versoes (id, nome, slug, modelo_id, combustivel_id, ano_fabricacao, ano_modelo, peso, numero_assentos, numero_portas, consumo_cidade, consumo_estrada, motor, cavalos_potencia, cavalos_potencia_rpm, torque, torque_rpm, observacoes, criado_em, alterado_em) VALUES (5, '1.6 GRIFFE AUTOMÁTICO', '16-griffe-automatico', 11, 8, '2015', '2016', 1.24, 5, 4, 10.60, 6.00, '1.6 THP', '122/115 cv', '6.000 rpm', '16,4/15,5 kgfm', '4.000 rpm', '', '2019-06-21 23:18:45', '2019-06-21 23:18:45');
INSERT INTO public.versoes (id, nome, slug, modelo_id, combustivel_id, ano_fabricacao, ano_modelo, peso, numero_assentos, numero_portas, consumo_cidade, consumo_estrada, motor, cavalos_potencia, cavalos_potencia_rpm, torque, torque_rpm, observacoes, criado_em, alterado_em) VALUES (6, '1.6 AT', '16-at', 12, 8, '2014', '2015', 1392.00, 5, 5, 7.00, 10.00, '1.6', '128', '', '', '', '', '2019-06-21 23:45:36', '2019-06-21 23:45:36');
INSERT INTO public.versoes (id, nome, slug, modelo_id, combustivel_id, ano_fabricacao, ano_modelo, peso, numero_assentos, numero_portas, consumo_cidade, consumo_estrada, motor, cavalos_potencia, cavalos_potencia_rpm, torque, torque_rpm, observacoes, criado_em, alterado_em) VALUES (9, 'Attraction', 'attraction', 13, 8, '2018', '2019', 1.18, 5, 4, 10.90, 13.20, '1.6', '118', '', '', '', '', '2019-06-23 17:42:01', '2019-06-23 17:42:01');
INSERT INTO public.versoes (id, nome, slug, modelo_id, combustivel_id, ano_fabricacao, ano_modelo, peso, numero_assentos, numero_portas, consumo_cidade, consumo_estrada, motor, cavalos_potencia, cavalos_potencia_rpm, torque, torque_rpm, observacoes, criado_em, alterado_em) VALUES (10, 'Grand 3.3 V6', 'grand-33-v6', 14, 9, '2013', '2014', 0.00, 7, 5, 7.10, 9.20, '3.3', '270', '', '', '', '', '2019-06-23 20:39:50', '2019-06-23 20:39:50');
INSERT INTO public.versoes (id, nome, slug, modelo_id, combustivel_id, ano_fabricacao, ano_modelo, peso, numero_assentos, numero_portas, consumo_cidade, consumo_estrada, motor, cavalos_potencia, cavalos_potencia_rpm, torque, torque_rpm, observacoes, criado_em, alterado_em) VALUES (11, 'Activ', 'activ', 15, 8, '2016', '2016', 0.00, 5, 5, 9.00, 10.90, '1.8', '108', '', '', '', '', '2019-06-23 22:11:42', '2019-06-23 22:11:42');


--
-- TOC entry 2557 (class 0 OID 0)
-- Dependencies: 199
-- Name: versoes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.versoes_id_seq', 11, true);


--
-- TOC entry 2271 (class 2606 OID 31085)
-- Name: acabamentos_internos acabamentos_internos_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.acabamentos_internos
    ADD CONSTRAINT acabamentos_internos_nome_key UNIQUE (nome);


--
-- TOC entry 2273 (class 2606 OID 31083)
-- Name: acabamentos_internos acabamentos_internos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.acabamentos_internos
    ADD CONSTRAINT acabamentos_internos_pkey PRIMARY KEY (id);


--
-- TOC entry 2259 (class 2606 OID 31055)
-- Name: cambios cambios_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cambios
    ADD CONSTRAINT cambios_nome_key UNIQUE (nome);


--
-- TOC entry 2261 (class 2606 OID 31053)
-- Name: cambios cambios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cambios
    ADD CONSTRAINT cambios_pkey PRIMARY KEY (id);


--
-- TOC entry 2215 (class 2606 OID 30911)
-- Name: carrocerias carrocerias_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.carrocerias
    ADD CONSTRAINT carrocerias_nome_key UNIQUE (nome);


--
-- TOC entry 2217 (class 2606 OID 30909)
-- Name: carrocerias carrocerias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.carrocerias
    ADD CONSTRAINT carrocerias_pkey PRIMARY KEY (id);


--
-- TOC entry 2227 (class 2606 OID 30978)
-- Name: clientes clientes_cpf_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_cpf_key UNIQUE (cpf);


--
-- TOC entry 2229 (class 2606 OID 30980)
-- Name: clientes clientes_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_email_key UNIQUE (email);


--
-- TOC entry 2231 (class 2606 OID 30976)
-- Name: clientes clientes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_pkey PRIMARY KEY (id);


--
-- TOC entry 2221 (class 2606 OID 30944)
-- Name: combustiveis combustiveis_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.combustiveis
    ADD CONSTRAINT combustiveis_nome_key UNIQUE (nome);


--
-- TOC entry 2223 (class 2606 OID 30942)
-- Name: combustiveis combustiveis_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.combustiveis
    ADD CONSTRAINT combustiveis_pkey PRIMARY KEY (id);


--
-- TOC entry 2287 (class 2606 OID 31206)
-- Name: compras compras_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compras
    ADD CONSTRAINT compras_pkey PRIMARY KEY (id);


--
-- TOC entry 2239 (class 2606 OID 31005)
-- Name: confortos confortos_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.confortos
    ADD CONSTRAINT confortos_nome_key UNIQUE (nome);


--
-- TOC entry 2241 (class 2606 OID 31003)
-- Name: confortos confortos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.confortos
    ADD CONSTRAINT confortos_pkey PRIMARY KEY (id);


--
-- TOC entry 2263 (class 2606 OID 31065)
-- Name: cores_externas cores_externas_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cores_externas
    ADD CONSTRAINT cores_externas_nome_key UNIQUE (nome);


--
-- TOC entry 2265 (class 2606 OID 31063)
-- Name: cores_externas cores_externas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cores_externas
    ADD CONSTRAINT cores_externas_pkey PRIMARY KEY (id);


--
-- TOC entry 2267 (class 2606 OID 31075)
-- Name: cores_internas cores_internas_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cores_internas
    ADD CONSTRAINT cores_internas_nome_key UNIQUE (nome);


--
-- TOC entry 2269 (class 2606 OID 31073)
-- Name: cores_internas cores_internas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cores_internas
    ADD CONSTRAINT cores_internas_pkey PRIMARY KEY (id);


--
-- TOC entry 2247 (class 2606 OID 31025)
-- Name: estilos estilos_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estilos
    ADD CONSTRAINT estilos_nome_key UNIQUE (nome);


--
-- TOC entry 2249 (class 2606 OID 31023)
-- Name: estilos estilos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estilos
    ADD CONSTRAINT estilos_pkey PRIMARY KEY (id);


--
-- TOC entry 2243 (class 2606 OID 31015)
-- Name: extras extras_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.extras
    ADD CONSTRAINT extras_nome_key UNIQUE (nome);


--
-- TOC entry 2245 (class 2606 OID 31013)
-- Name: extras extras_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.extras
    ADD CONSTRAINT extras_pkey PRIMARY KEY (id);


--
-- TOC entry 2211 (class 2606 OID 30901)
-- Name: marcas marcas_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcas
    ADD CONSTRAINT marcas_nome_key UNIQUE (nome);


--
-- TOC entry 2213 (class 2606 OID 30899)
-- Name: marcas marcas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcas
    ADD CONSTRAINT marcas_pkey PRIMARY KEY (id);


--
-- TOC entry 2219 (class 2606 OID 30919)
-- Name: modelos modelos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modelos
    ADD CONSTRAINT modelos_pkey PRIMARY KEY (id);


--
-- TOC entry 2199 (class 2606 OID 30863)
-- Name: perfis perfis_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfis
    ADD CONSTRAINT perfis_nome_key UNIQUE (nome);


--
-- TOC entry 2201 (class 2606 OID 30861)
-- Name: perfis perfis_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfis
    ADD CONSTRAINT perfis_pkey PRIMARY KEY (id);


--
-- TOC entry 2207 (class 2606 OID 30891)
-- Name: procedencias procedencias_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.procedencias
    ADD CONSTRAINT procedencias_nome_key UNIQUE (nome);


--
-- TOC entry 2209 (class 2606 OID 30889)
-- Name: procedencias procedencias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.procedencias
    ADD CONSTRAINT procedencias_pkey PRIMARY KEY (id);


--
-- TOC entry 2233 (class 2606 OID 30993)
-- Name: proprietarios proprietarios_cpf_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proprietarios
    ADD CONSTRAINT proprietarios_cpf_key UNIQUE (cpf);


--
-- TOC entry 2235 (class 2606 OID 30995)
-- Name: proprietarios proprietarios_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proprietarios
    ADD CONSTRAINT proprietarios_email_key UNIQUE (email);


--
-- TOC entry 2237 (class 2606 OID 30991)
-- Name: proprietarios proprietarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.proprietarios
    ADD CONSTRAINT proprietarios_pkey PRIMARY KEY (id);


--
-- TOC entry 2251 (class 2606 OID 31035)
-- Name: segurancas segurancas_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.segurancas
    ADD CONSTRAINT segurancas_nome_key UNIQUE (nome);


--
-- TOC entry 2253 (class 2606 OID 31033)
-- Name: segurancas segurancas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.segurancas
    ADD CONSTRAINT segurancas_pkey PRIMARY KEY (id);


--
-- TOC entry 2255 (class 2606 OID 31045)
-- Name: tecnologias tecnologias_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tecnologias
    ADD CONSTRAINT tecnologias_nome_key UNIQUE (nome);


--
-- TOC entry 2257 (class 2606 OID 31043)
-- Name: tecnologias tecnologias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tecnologias
    ADD CONSTRAINT tecnologias_pkey PRIMARY KEY (id);


--
-- TOC entry 2203 (class 2606 OID 30876)
-- Name: usuarios usuarios_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_email_key UNIQUE (email);


--
-- TOC entry 2205 (class 2606 OID 30874)
-- Name: usuarios usuarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id);


--
-- TOC entry 2279 (class 2606 OID 31131)
-- Name: veiculos_confortos veiculos_confortos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_confortos
    ADD CONSTRAINT veiculos_confortos_pkey PRIMARY KEY (id);


--
-- TOC entry 2293 (class 2606 OID 31264)
-- Name: veiculos_estilos veiculos_estilos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_estilos
    ADD CONSTRAINT veiculos_estilos_pkey PRIMARY KEY (id);


--
-- TOC entry 2281 (class 2606 OID 31149)
-- Name: veiculos_extras veiculos_extras_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_extras
    ADD CONSTRAINT veiculos_extras_pkey PRIMARY KEY (id);


--
-- TOC entry 2275 (class 2606 OID 31096)
-- Name: veiculos veiculos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos
    ADD CONSTRAINT veiculos_pkey PRIMARY KEY (id);


--
-- TOC entry 2277 (class 2606 OID 31098)
-- Name: veiculos veiculos_placa_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos
    ADD CONSTRAINT veiculos_placa_key UNIQUE (placa);


--
-- TOC entry 2283 (class 2606 OID 31167)
-- Name: veiculos_segurancas veiculos_segurancas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_segurancas
    ADD CONSTRAINT veiculos_segurancas_pkey PRIMARY KEY (id);


--
-- TOC entry 2285 (class 2606 OID 31185)
-- Name: veiculos_tecnologias veiculos_tecnologias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_tecnologias
    ADD CONSTRAINT veiculos_tecnologias_pkey PRIMARY KEY (id);


--
-- TOC entry 2289 (class 2606 OID 31227)
-- Name: vendas vendas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas
    ADD CONSTRAINT vendas_pkey PRIMARY KEY (id);


--
-- TOC entry 2291 (class 2606 OID 31250)
-- Name: vendas_veiculos vendas_veiculos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas_veiculos
    ADD CONSTRAINT vendas_veiculos_pkey PRIMARY KEY (id);


--
-- TOC entry 2225 (class 2606 OID 30955)
-- Name: versoes versoes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.versoes
    ADD CONSTRAINT versoes_pkey PRIMARY KEY (id);


--
-- TOC entry 2304 (class 2606 OID 31119)
-- Name: veiculos fk_acabamento_interno; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos
    ADD CONSTRAINT fk_acabamento_interno FOREIGN KEY (acabamento_interno_id) REFERENCES public.acabamentos_internos(id);


--
-- TOC entry 2301 (class 2606 OID 31104)
-- Name: veiculos fk_cambio; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos
    ADD CONSTRAINT fk_cambio FOREIGN KEY (cambio_id) REFERENCES public.cambios(id);


--
-- TOC entry 2297 (class 2606 OID 30930)
-- Name: modelos fk_carroceria; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modelos
    ADD CONSTRAINT fk_carroceria FOREIGN KEY (carroceria_id) REFERENCES public.carrocerias(id);


--
-- TOC entry 2316 (class 2606 OID 31233)
-- Name: vendas fk_cliente; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas
    ADD CONSTRAINT fk_cliente FOREIGN KEY (cliente_id) REFERENCES public.clientes(id);


--
-- TOC entry 2299 (class 2606 OID 30961)
-- Name: versoes fk_combustivel; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.versoes
    ADD CONSTRAINT fk_combustivel FOREIGN KEY (combustivel_id) REFERENCES public.combustiveis(id);


--
-- TOC entry 2306 (class 2606 OID 31137)
-- Name: veiculos_confortos fk_conforto; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_confortos
    ADD CONSTRAINT fk_conforto FOREIGN KEY (conforto_id) REFERENCES public.confortos(id);


--
-- TOC entry 2320 (class 2606 OID 31270)
-- Name: veiculos_estilos fk_conforto; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_estilos
    ADD CONSTRAINT fk_conforto FOREIGN KEY (estilo_id) REFERENCES public.estilos(id);


--
-- TOC entry 2302 (class 2606 OID 31109)
-- Name: veiculos fk_cor_externa; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos
    ADD CONSTRAINT fk_cor_externa FOREIGN KEY (cor_externa_id) REFERENCES public.cores_externas(id);


--
-- TOC entry 2303 (class 2606 OID 31114)
-- Name: veiculos fk_cor_interna; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos
    ADD CONSTRAINT fk_cor_interna FOREIGN KEY (cor_interna_id) REFERENCES public.cores_internas(id);


--
-- TOC entry 2308 (class 2606 OID 31155)
-- Name: veiculos_extras fk_extra; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_extras
    ADD CONSTRAINT fk_extra FOREIGN KEY (extra_id) REFERENCES public.extras(id);


--
-- TOC entry 2295 (class 2606 OID 30920)
-- Name: modelos fk_marca; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modelos
    ADD CONSTRAINT fk_marca FOREIGN KEY (marca_id) REFERENCES public.marcas(id);


--
-- TOC entry 2298 (class 2606 OID 30956)
-- Name: versoes fk_modelo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.versoes
    ADD CONSTRAINT fk_modelo FOREIGN KEY (modelo_id) REFERENCES public.modelos(id);


--
-- TOC entry 2294 (class 2606 OID 30877)
-- Name: usuarios fk_perfil; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT fk_perfil FOREIGN KEY (perfil_id) REFERENCES public.perfis(id);


--
-- TOC entry 2296 (class 2606 OID 30925)
-- Name: modelos fk_procedencia; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modelos
    ADD CONSTRAINT fk_procedencia FOREIGN KEY (procedencia_id) REFERENCES public.procedencias(id);


--
-- TOC entry 2313 (class 2606 OID 31207)
-- Name: compras fk_proprietario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compras
    ADD CONSTRAINT fk_proprietario FOREIGN KEY (proprietario_id) REFERENCES public.proprietarios(id);


--
-- TOC entry 2310 (class 2606 OID 31173)
-- Name: veiculos_segurancas fk_seguranca; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_segurancas
    ADD CONSTRAINT fk_seguranca FOREIGN KEY (seguranca_id) REFERENCES public.segurancas(id);


--
-- TOC entry 2312 (class 2606 OID 31191)
-- Name: veiculos_tecnologias fk_tecnologia; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_tecnologias
    ADD CONSTRAINT fk_tecnologia FOREIGN KEY (tecnologia_id) REFERENCES public.tecnologias(id);


--
-- TOC entry 2317 (class 2606 OID 31238)
-- Name: vendas fk_usuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas
    ADD CONSTRAINT fk_usuario FOREIGN KEY (usuario_id) REFERENCES public.usuarios(id);


--
-- TOC entry 2305 (class 2606 OID 31132)
-- Name: veiculos_confortos fk_veiculo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_confortos
    ADD CONSTRAINT fk_veiculo FOREIGN KEY (veiculo_id) REFERENCES public.veiculos(id);


--
-- TOC entry 2307 (class 2606 OID 31150)
-- Name: veiculos_extras fk_veiculo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_extras
    ADD CONSTRAINT fk_veiculo FOREIGN KEY (veiculo_id) REFERENCES public.veiculos(id);


--
-- TOC entry 2309 (class 2606 OID 31168)
-- Name: veiculos_segurancas fk_veiculo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_segurancas
    ADD CONSTRAINT fk_veiculo FOREIGN KEY (veiculo_id) REFERENCES public.veiculos(id);


--
-- TOC entry 2311 (class 2606 OID 31186)
-- Name: veiculos_tecnologias fk_veiculo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_tecnologias
    ADD CONSTRAINT fk_veiculo FOREIGN KEY (veiculo_id) REFERENCES public.veiculos(id);


--
-- TOC entry 2314 (class 2606 OID 31212)
-- Name: compras fk_veiculo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compras
    ADD CONSTRAINT fk_veiculo FOREIGN KEY (veiculo_id) REFERENCES public.veiculos(id);


--
-- TOC entry 2315 (class 2606 OID 31228)
-- Name: vendas fk_veiculo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas
    ADD CONSTRAINT fk_veiculo FOREIGN KEY (veiculo_id) REFERENCES public.veiculos(id);


--
-- TOC entry 2319 (class 2606 OID 31265)
-- Name: veiculos_estilos fk_veiculo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos_estilos
    ADD CONSTRAINT fk_veiculo FOREIGN KEY (veiculo_id) REFERENCES public.veiculos(id);


--
-- TOC entry 2318 (class 2606 OID 31251)
-- Name: vendas_veiculos fk_venda; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.vendas_veiculos
    ADD CONSTRAINT fk_venda FOREIGN KEY (venda_id) REFERENCES public.vendas(id);


--
-- TOC entry 2300 (class 2606 OID 31099)
-- Name: veiculos fk_versao; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculos
    ADD CONSTRAINT fk_versao FOREIGN KEY (versao_id) REFERENCES public.versoes(id);


-- Completed on 2019-06-23 22:49:10

--
-- PostgreSQL database dump complete
--

