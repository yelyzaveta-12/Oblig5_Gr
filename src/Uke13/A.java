package Uke13;

public class A {

    static String[] tabell = new String[10];

    static int hash(String nummer) {
        return nummer.charAt(nummer.length()-1) - '0';
    }

    static void insert(String nummer) {
        int i = hash(nummer);
        while (tabell[i] != null)
            i = (i + 1) % tabell.length;
        tabell[i] = nummer;
    }

    public static void main(String[] args) {
        String[] bilnummeret = {
                "EL65431","TA14374","ZX87181",
                "EL47007","VV50000","UV14544","EL32944"
        };

        for (String nummer : bilnummeret) insert(nummer);

        for (int i = 0; i < tabell.length; i++)
            System.out.println(i + ": " + tabell[i]);
    }
}
