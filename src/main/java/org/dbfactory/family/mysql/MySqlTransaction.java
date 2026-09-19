package org.dbfactory.family.mysql;

import org.dbfactory.family.Transaction;

public class MySqlTransaction implements Transaction {

    @Override
    public void begin(){
        System.out.println("[MySQL] START TRANSACTION;");
    }

    @Override
    public void commit(){
        System.out.println("[MySQL] COMMIT;");
    }

    @Override
    public void rollback(){
        System.out.println("[MySQL] ROLLBACK;");
    }
}
