package org.dbfactory.config;

import org.dbfactory.family.DatabaseFamilyFactory;
import org.dbfactory.family.mysql.MySqlFamilyFactory;
import org.dbfactory.family.postgres.PostgreSqlFamilyFactory;

import java.util.Map;
import java.util.function.Supplier;

public final class FactoryRegistry {
    private static final Map<String, Supplier<DatabaseFamilyFactory>> FACTORIES = Map.of(
            "mysql", MySqlFamilyFactory::new,
            "postgres", PostgreSqlFamilyFactory::new
    );

    private FactoryRegistry() {
        // utility class, not meant to be instantiated
    }

    public static DatabaseFamilyFactory get(String databaseType) {
        Supplier<DatabaseFamilyFactory> supplier = FACTORIES.get(databaseType.toLowerCase());
        if (supplier == null) {
            throw new UnknownDatabaseTypeException(databaseType);
        }
        return supplier.get();
    }
}
