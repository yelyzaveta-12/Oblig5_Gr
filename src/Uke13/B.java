package Uke13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B {

    public static void main(String[] args) {

        Map<Integer, List<String>> tabell = new HashMap<>(10);

        String[] bilnummeret = { "EL65431", "TA14374", "ZX87181",
                "EL47007", "VV50000", "UV14544", "EL32944"
        };

        for (String nummer : bilnummeret) {
            int hash = Character.getNumericValue(nummer.charAt(nummer.length() - 1));

            tabell.putIfAbsent(hash, new ArrayList<>());
            tabell.get(hash).add(nummer);
        }

        System.out.println(tabell);
    }
}
