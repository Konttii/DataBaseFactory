package org.dbfactory.family.mysql;

import org.dbfactory.family.Command;

public class MySqlCommand implements Command {

    @Override
    public void execute(String sql){
        System.out.println("[MySQL] Executing (backtick identifiers): " + sql);
    }

}
