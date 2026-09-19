# Database Driver Factory

## Intro

This database driver project demonstrates the Factory Method and Abstract Factory design patterns in the context of connecting to a database. Part A shows a single factory method (`createConnection`) producing one object — a `Connection` — with two concrete creators provided: one for MySQL and one for PostgreSQL. Part B extends this into an Abstract Factory: the same idea is applied to a whole family of related objects (`Connection`, `Command`, `Transaction`) instead of just one, again with a MySQL family and a PostgreSQL family.

## Why the Factory Method Pattern?

The Factory Method pattern fits Part A because the client should not need to know which concrete `Connection` implementation to instantiate. Without this pattern, the client would need an `if`/`switch` statement checking the database type before calling `new MySqlConnection()` or `new PostgreSqlConnection()` directly, which breaks encapsulation and makes adding a third database painful — every branch in the codebase would need updating. Using a factory method, that decision is delegated to a subclass (`MySqlConnectionFactory` or `PostgreSqlConnectionFactory`), and the client only ever depends on the abstract `Connection` interface.

## Why the Abstract Factory Pattern?

Part B extends this further: a `Connection` alone isn't enough once queries and transactions come into play — I also need a `Command` and a `Transaction`, and all three must belong to the same database dialect. Without Abstract Factory, nothing would stop a `MySqlConnection` from being paired with a `PostgreSqlTransaction` by mistake. The `DatabaseFamilyFactory` interface guarantees that whichever concrete factory is used, all three objects it returns are consistent with one another.

## Validation

The `config` package is responsible for validation. When `FactoryRegistry.get(type)` is called with a database type that isn't registered (a typo, for example), it throws an `UnknownDatabaseTypeException` with a clear message instead of returning `null` or silently defaulting to one database — this way, configuration mistakes fail immediately rather than causing a confusing bug later.

## How to Use

There are two ways to use the system. The first is through `Main.java`, which shows both parts wired together: Part A is demonstrated directly with the two `ConnectionFactory` implementations, and Part B is demonstrated by asking `FactoryRegistry` for a `DatabaseFamilyFactory` and handing it to `DatabaseClient`, which then runs a sample workflow (open connection → begin transaction → run a query → commit → close) purely through interfaces. The second way is to reuse the individual classes directly in your own code — for example, instantiate `MySqlConnectionFactory` on its own if you only need Part A's behaviour.

## Launching

```
javac -d out $(find src -name "*.java")
java -cp out com.dbfactory.Main
```

This compiles every `.java` file under `src` into an `out` folder and then runs `Main`, which prints the output of both Part A and Part B to the console. If compiling from the terminal isn't convenient, the project can also be opened directly in IntelliJ IDEA and run by clicking the green "Run" button next to `Main`'s `main` method.
