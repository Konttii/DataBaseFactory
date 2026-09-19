package org.DbFactory.creator;

import org.DbFactory.product.Connection;

public abstract class ConnectionFactory {

    public abstract Connection createConnection();

    public final String connectionAndDescribe(){
        Connection connection = createConnection();
        connection.open();
        String info = connection.describe();
        connection.close();
        return info;
    }
}

