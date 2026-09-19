package org.DbFactory.creator;

import org.DbFactory.product.Connection;
import org.DbFactory.product.MySqlConnection;

public class MySqlConnectionFactory extends ConnectionFactory {

    @Override
    protected Connection createConnection(){return new MySqlConnection();}

}
