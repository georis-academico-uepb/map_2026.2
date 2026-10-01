package decorators;

import interfaces.QueryExecutor;

public class LoggingDecorator  extends QueryExecutorDecorator{

    public LoggingDecorator(QueryExecutor executor) {super(executor);}

    @Override
    public void execute(String sql)
    {
        System.out.println("[LOG] Tentando executar query: " + sql); // Tem que vir antes da query
        executor.execute(sql);
    }

}
