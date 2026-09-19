package org.dbfactory.client;

import org.dbfactory.family.Command;
import org.dbfactory.family.DatabaseFamilyFactory;
import org.dbfactory.family.Transaction;
import org.dbfactory.product.Connection;

public class DatabaseClient {

    private final Connection connection;
    private final Command command;
    private final Transaction transaction;

    public DatabaseClient(DatabaseFamilyFactory factory) {
        this.connection = factory.createConnection();
        this.command = factory.createCommand();
        this.transaction = factory.createTransaction();
    }

    public void runSampleWorkflow(String sql) {
        connection.open();
        transaction.begin();
        command.execute(sql);
        transaction.commit();
        connection.close();
    }
}
