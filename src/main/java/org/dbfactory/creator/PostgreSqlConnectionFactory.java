package org.dbfactory.creator;

import org.dbfactory.product.Connection;
import org.dbfactory.product.PostgreSqlConnection;

public class PostgreSqlConnectionFactory extends ConnectionFactory {

    @Override
    protected Connection createConnection(){return new PostgreSqlConnection();}
}
