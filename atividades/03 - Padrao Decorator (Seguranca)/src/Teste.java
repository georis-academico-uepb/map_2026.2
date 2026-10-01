import decorators.*;
import interfaces.QueryExecutor;

public class Teste
{
    public static void main(String[] args)
    {

        QueryExecutor executor = new AuditDecorator( new LoggingDecorator( new MetricsDecorator(new MetricsDecorator(new MetricsDecorator(new AuditDecorator(new BasicQueryExecutor(), "Allan")))) ), "Georis"); // sempre eu tenho que parar em algum canto


        executor.execute("DELETE * FROM georisTable"); // não estou checando a segurança
    }
}
