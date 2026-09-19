package org.dbfactory.family.mysql;

import org.dbfactory.family.Command;
import org.dbfactory.family.DatabaseFamilyFactory;
import org.dbfactory.family.Transaction;
import org.dbfactory.product.Connection;
import org.dbfactory.product.MySqlConnection;

public class MySqlFamilyFactory implements DatabaseFamilyFactory {

    @Override
    public Connection createConnection(){return new MySqlConnection();}

    @Override
    public Command createCommand(){return new MySqlCommand();}

    @Override
    public Transaction createTransaction(){return new MySqlTransaction();}



}
