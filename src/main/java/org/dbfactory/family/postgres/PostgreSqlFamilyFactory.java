package org.dbfactory.family.postgres;

import org.dbfactory.family.Command;
import org.dbfactory.family.DatabaseFamilyFactory;
import org.dbfactory.family.Transaction;
import org.dbfactory.product.Connection;
import org.dbfactory.product.PostgreSqlConnection;

public class PostgreSqlFamilyFactory implements DatabaseFamilyFactory {

    @Override
    public Connection createConnection(){return new PostgreSqlConnection();}

    @Override
    public Command createCommand(){return new PostgreSqlCommand();}

    @Override
    public Transaction createTransaction(){return new PostgreSqlTransaction();}

}
