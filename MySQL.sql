-- 2025/09/26 mysqlサーバースタート、ストップ
mysql.server start
mysql.server stop
mysql.server restart


-- 2025/10/03 ログイン、DESCと射影、SELECT文、算術演算、列見出し
mysql -u root -p
mysql -u cm -p studyDB

DESC pokemon_zukann;

SELECT *
FROM pokemon_zukann;

SELECT zukann_no, pokemon_name, evolution_seq
FROM pokemon_zukann;

-- 算術演算
SELECT gname, price, price * 1.2
FROM goods;

SELECT gname, price, price * 1.2 as new_price
FROM goods;

SELECT ename, sal, comm, (sal + comm) * 2 as summer_bonus
FROM emp;

-- 列見出し
SELECT gname, price, price * 1.2 as new_price
FROM goods;

SELECT empno as "EMP-NO", ename as "E name", job as "<job>"
FROM emp;


-- 2025/10/18 WHERE
WHERE sal < 100;

-- AND, OR
WHERE sal > 100 AND sal < 1000;
WHERE name = 'オーメン' OR name = 'ジェット';

-- 重複データを表示しない
SELECT DISTINCT 〇〇, 〇〇;

-- 〇〇が〇〇〜〇〇
SELECT sal BETWEEN 100 AND 1000;
