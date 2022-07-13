import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){
        TreeMap<String, TreeSet<Pessoa>> listaPessoas = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                        ()-> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.toCollection(TreeSet::new)));
        return listaPessoas;

    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas){
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
    }
}
