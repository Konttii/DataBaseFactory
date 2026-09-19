package org.dbfactory.family.postgres;

import org.dbfactory.family.Command;

public class PostgreSqlCommand implements Command {

    @Override
    public void execute(String sql){
        System.out.println("[PostgreSQL] Executing (double-quoted identifiers): " + sql);
    }
}
