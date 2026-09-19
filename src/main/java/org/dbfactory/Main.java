package org.dbfactory;

import org.dbfactory.client.DatabaseClient;
import org.dbfactory.config.FactoryRegistry;
import org.dbfactory.creator.ConnectionFactory;
import org.dbfactory.creator.MySqlConnectionFactory;
import org.dbfactory.creator.PostgreSqlConnectionFactory;
import org.dbfactory.family.DatabaseFamilyFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Part A: Factory Method ===");
        demoFactoryMethod();

        System.out.println();
        System.out.println("=== Part B: Abstract Factory ===");
        demoAbstractFactory("mysql");
        demoAbstractFactory("postgres");
    }

    private static void demoFactoryMethod() {
        ConnectionFactory mysqlFactory = new MySqlConnectionFactory();
        ConnectionFactory postgresFactory = new PostgreSqlConnectionFactory();

        System.out.println(mysqlFactory.connectAndDescribe());
        System.out.println(postgresFactory.connectAndDescribe());
    }

    private static void demoAbstractFactory(String databaseType) {
        DatabaseFamilyFactory factory = FactoryRegistry.get(databaseType);
        DatabaseClient client = new DatabaseClient(factory);
        client.runSampleWorkflow("SELECT * FROM users WHERE active = true");
    }
}
