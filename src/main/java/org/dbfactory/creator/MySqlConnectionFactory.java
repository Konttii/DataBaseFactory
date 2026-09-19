package org.dbfactory.creator;

import org.dbfactory.product.Connection;
import org.dbfactory.product.MySqlConnection;

public class MySqlConnectionFactory extends ConnectionFactory {

    @Override
    protected Connection createConnection(){return new MySqlConnection();}

}
