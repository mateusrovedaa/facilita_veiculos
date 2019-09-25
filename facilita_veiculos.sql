--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.9
-- Dumped by pg_dump version 9.6.9

-- Started on 2019-09-01 21:30:25

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
-- TOC entry 2156 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 186 (class 1259 OID 35369)
-- Name: marcas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.marcas (
    id integer NOT NULL,
    alterado_em timestamp without time zone NOT NULL,
    criado_em timestamp without time zone NOT NULL,
    nome character varying(200) NOT NULL,
    slug character varying(200) NOT NULL
);


ALTER TABLE public.marcas OWNER TO postgres;

--
-- TOC entry 188 (class 1259 OID 35376)
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
-- TOC entry 187 (class 1259 OID 35374)
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
-- TOC entry 2157 (class 0 OID 0)
-- Dependencies: 187
-- Name: perfis_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.perfis_id_seq OWNED BY public.perfis.id;


--
-- TOC entry 185 (class 1259 OID 35367)
-- Name: seq_marcas; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.seq_marcas
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_marcas OWNER TO postgres;

--
-- TOC entry 190 (class 1259 OID 35386)
-- Name: usuarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuarios (
    id integer NOT NULL,
    perfil_id integer NOT NULL,
    nome character varying(100),
    email character varying(100),
    data_nascimento date,
    senha character varying(100),
    confirma_senha character varying(100),
    criado_em timestamp without time zone NOT NULL,
    alterado_em timestamp without time zone NOT NULL
);


ALTER TABLE public.usuarios OWNER TO postgres;

--
-- TOC entry 189 (class 1259 OID 35384)
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
-- TOC entry 2158 (class 0 OID 0)
-- Dependencies: 189
-- Name: usuarios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuarios_id_seq OWNED BY public.usuarios.id;


--
-- TOC entry 2013 (class 2604 OID 35379)
-- Name: perfis id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfis ALTER COLUMN id SET DEFAULT nextval('public.perfis_id_seq'::regclass);


--
-- TOC entry 2014 (class 2604 OID 35389)
-- Name: usuarios id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios ALTER COLUMN id SET DEFAULT nextval('public.usuarios_id_seq'::regclass);


--
-- TOC entry 2144 (class 0 OID 35369)
-- Dependencies: 186
-- Data for Name: marcas; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.marcas VALUES (5, '2019-09-01 21:18:27.824', '2019-09-01 21:18:27.824', 'Audi', 'audi');
INSERT INTO public.marcas VALUES (3, '2019-09-01 21:18:44.863', '2019-09-01 21:18:44.863', 'BMW', 'bmw');


--
-- TOC entry 2146 (class 0 OID 35376)
-- Dependencies: 188
-- Data for Name: perfis; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.perfis VALUES (1, 'Administrador', 'administrador', '2019-09-01 00:00:00', '2019-09-01 00:00:00');


--
-- TOC entry 2159 (class 0 OID 0)
-- Dependencies: 187
-- Name: perfis_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.perfis_id_seq', 1, false);


--
-- TOC entry 2160 (class 0 OID 0)
-- Dependencies: 185
-- Name: seq_marcas; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_marcas', 5, true);


--
-- TOC entry 2148 (class 0 OID 35386)
-- Dependencies: 190
-- Data for Name: usuarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.usuarios VALUES (1, 1, 'Felipe A. Dahmer', 'nada@gmail.com', '1998-12-15', '21232f297a57a5a743894a0e4a801fc3', '21232f297a57a5a743894a0e4a801fc3', '2019-09-01 00:00:00', '2019-09-01 00:00:00');


--
-- TOC entry 2161 (class 0 OID 0)
-- Dependencies: 189
-- Name: usuarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuarios_id_seq', 1, false);


--
-- TOC entry 2016 (class 2606 OID 35373)
-- Name: marcas marcas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.marcas
    ADD CONSTRAINT marcas_pkey PRIMARY KEY (id);


--
-- TOC entry 2018 (class 2606 OID 35383)
-- Name: perfis perfis_nome_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfis
    ADD CONSTRAINT perfis_nome_key UNIQUE (nome);


--
-- TOC entry 2020 (class 2606 OID 35381)
-- Name: perfis perfis_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.perfis
    ADD CONSTRAINT perfis_pkey PRIMARY KEY (id);


--
-- TOC entry 2022 (class 2606 OID 35393)
-- Name: usuarios usuarios_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_email_key UNIQUE (email);


--
-- TOC entry 2024 (class 2606 OID 35391)
-- Name: usuarios usuarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id);


--
-- TOC entry 2025 (class 2606 OID 35394)
-- Name: usuarios fk_perfil; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT fk_perfil FOREIGN KEY (perfil_id) REFERENCES public.perfis(id);


-- Completed on 2019-09-01 21:30:26

--
-- PostgreSQL database dump complete
--

