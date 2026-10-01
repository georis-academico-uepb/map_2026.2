package decorators;

import interfaces.QueryExecutor;

public class AuditDecorator extends QueryExecutorDecorator {

    String user;

    public AuditDecorator(QueryExecutor executor, String user) {
        super(executor);
        this.user = user;

    }

    @Override
    public void execute(String sql) {
        System.out.printf("[AUDIT] Usuário responsável: %s\n", user);
        executor.execute(sql);
    }
}
