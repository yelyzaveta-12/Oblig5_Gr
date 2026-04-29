package Uke16;

public class Main {
    public static void main(String[] args) {
        BS_Tre<Integer> tre = new BS_Tre<Integer>();

        tre.leggTil(50);
        tre.leggTil(25);
        tre.leggTil(75);
        tre.leggTil(10);
        tre.leggTil(30);
        tre.leggTil(60);
        tre.leggTil(90);
        tre.leggTil(28);
        tre.leggTil(35);
        tre.leggTil(80);

        System.out.println("Original:");
        tre.skrivVerdierOriginal(25, 75);

        System.out.println("Forbedret:");
        tre.skrivVerdier(25, 75);
        System.out.println();

        //erBalansert oppgave

        BS_Tre<Integer> tre2 = new BS_Tre<Integer>();

        BinaerTreNode<Integer> n10 = new BinaerTreNode<Integer>(10);
        BinaerTreNode<Integer> n5 = new BinaerTreNode<Integer>(5);
        BinaerTreNode<Integer> n15 = new BinaerTreNode<Integer>(15);

        n10.setVenstre(n5);
        n10.setHogre(n15);

        n10.setHogdeU(2);
        n5.setHogdeU(1);
        n15.setHogdeU(1);

        tre2.setRot(n10);

        System.out.println("Er tre2 balansert?");
        System.out.println(tre2.erBalansert());


    }
}