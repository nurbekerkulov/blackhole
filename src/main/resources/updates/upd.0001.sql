CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE public.genre (
    id uuid NOT NULL DEFAULT uuid_generate_v1(),
    ver int NULL,
    del_mark int NULL,
    updt timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP,
    "name" varchar(50) NOT NULL,
    CONSTRAINT genre_pk PRIMARY KEY (id)
);

CREATE TABLE public.artist (
    id uuid NOT NULL DEFAULT uuid_generate_v1(),
    ver int4 NULL,
    del_mark int4 NULL,
    updt timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP,
    "name" varchar(100) NOT NULL,
    instagram varchar(50) NULL,
    photo varchar(200) NULL,
    CONSTRAINT artist_pk PRIMARY KEY (id)
);

CREATE TABLE public.track (
    id uuid NOT NULL DEFAULT uuid_generate_v1(),
    ver int4 NULL,
    del_mark int4 NULL,
    updt timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP,
    "name" varchar(150) NOT NULL,
    audio varchar(150) NOT NULL,
    artist uuid NOT NULL,
    genre uuid NOT NULL,
    CONSTRAINT track_pk PRIMARY KEY (id),
    CONSTRAINT track_fk FOREIGN KEY (genre) REFERENCES public.genre(id),
    CONSTRAINT track_fk_1 FOREIGN KEY (artist) REFERENCES public.artist(id)
);
