package decorators;

import interfaces.QueryExecutor;

public class BasicQueryExecutor implements QueryExecutor {

    // É a primeira boneca matrioska, o concrete component

    @Override
    public void execute(String sql) {
        System.out.println("Query executada no banco: " + sql);
    }

}