package org.DbFactory.creator;

import org.DbFactory.product.Connection;
import org.DbFactory.product.PostgreSqlConnection;

public class PostgreSqlConnectionFactory extends ConnectionFactory {

    @Override
    protected Connection createConnection(){return new PostgreSqlConnection();}
}
