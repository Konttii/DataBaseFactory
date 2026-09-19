package org.dbfactory.config;

public class UnknownDatabaseTypeException extends RuntimeException {
    public UnknownDatabaseTypeException(String databaseType) {
        super("Unknown database type: '" + databaseType + "'. Supported types: mysql, postgres.");
    }}
