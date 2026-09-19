package org.dbfactory.family.postgres;

import org.dbfactory.family.Transaction;

public class PostgreSqlTransaction implements Transaction {

    @Override
    public void begin(){
        System.out.println("[PostgreSQL] BEGIN;");
    }

    @Override
    public void commit(){
        System.out.println("[PostgreSQL] COMMIT;");
    }

    @Override
    public void rollback(){
        System.out.println("[PostgreSQL] ROLLBACK;");
    }
}
