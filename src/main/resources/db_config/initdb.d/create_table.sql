CREATE TABLE ENCORE_TODO_TBL(
        ID      INT NOT NULL AUTO_INCREMENT ,
        SUBJECT                 VARCHAR(50),
        BODY                    VARCHAR(50),
        COMPLETED       TINYINT(1),
        PRIMARY KEY(ID)
);
