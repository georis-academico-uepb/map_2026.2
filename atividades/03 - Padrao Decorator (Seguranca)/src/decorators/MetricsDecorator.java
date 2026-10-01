package decorators;

import interfaces.QueryExecutor;

public class MetricsDecorator extends QueryExecutorDecorator {


    public MetricsDecorator(QueryExecutor executor) {super(executor);}

    @Override
    public void execute(String sql) {

        long start = System.currentTimeMillis(); // para medição do tempo
        executor.execute(sql);
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.printf("[METRICS] Tempo de execução: %1dms\n", duration);

    }

}

