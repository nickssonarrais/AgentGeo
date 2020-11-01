
/*Mostrar banco de dados*/
BEGIN;
select datName from pg_database
END;

/*Mostrar tabelas de um banco de dados*/
BEGIN;
SELECT tablename FROM pg_catalog.pg_tables
WHERE schemaname NOT IN ('pg_catalog', 'information_schema', 'pg_toast')
ORDER BY schemaname, tablename
END;

/*Mostrar colunas de um banco de dados*/
BEGIN;
SELECT column_name FROM information_schema.columns WHERE table_name ='contasnicksson';
END;

/*select do modelo de agente aguá*/
BEGIN;
SELECT * from landsat_5_tm_20040313_214_064_l2_band5_regiongrowing_1 WHERE rp_mode_0 >= 18 limit 5
END;

BEGIN;
ALTER TABLE landsat_5_tm_20040313_214_064_l2_band5_regiongrowing_1 ADD classification varchar(50);

END;