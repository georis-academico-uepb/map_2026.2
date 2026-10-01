package decorators;

import interfaces.QueryExecutor;

import java.util.Locale;

public class SecurityValidationDecorator extends QueryExecutorDecorator {

    public SecurityValidationDecorator(QueryExecutor executor) {super(executor);}

    String[] denied = {"DROP", "TRUNCATE", "DELETE", "ALTER", "OR '1'='1'", "--", ";"};

    @Override
    public void execute(String sql) {
       for(String deniedTerm : denied){
           if(sql.toUpperCase().contains(deniedTerm)){
               System.out.println("[SECURITY] Query bloqueada por validação de segurança.");
               return; // Não chamo o executor base, pois bloqueio as operações
           }
       }
       executor.execute(sql); // Sò se passar nas validações eu chamo
    }


}
