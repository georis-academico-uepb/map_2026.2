import decorators.*;
import interfaces.QueryExecutor;

public class Cliente {
    public static void main(String[] args) {

        QueryExecutor executor =
                new LoggingDecorator(
                        new AuditDecorator(
                                new MetricsDecorator(
                                        new SecurityValidationDecorator(
                                                new BasicQueryExecutor() // Só vai executar se passar por tudo
                                        )
                                ),
                                "luciana"
                        )
                );


        /* Testes */
        executor.execute("SELECT * FROM users");
        System.out.println(); // para pular linha entre testes
        executor.execute("DROP TABLE users; --");
        System.out.println();
        executor.execute("SELECT * FROM users WHERE name = 'admin' OR '1'='1'");
    }

}
