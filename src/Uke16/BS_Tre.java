package Uke16;

public class BS_Tre<T extends Comparable<T>> {

    private BinaerTreNode<T> rot;

    public void leggTil(T element) {
        rot = leggTilRek(rot, element);
    }

    public void setRot(BinaerTreNode<T> rot) {
        this.rot = rot;
    }

    private BinaerTreNode<T> leggTilRek(BinaerTreNode<T> p, T element) {
        if (p == null) {
            return new BinaerTreNode<T>(element);
        }

        if (element.compareTo(p.getElement()) < 0) {
            p.setVenstre(leggTilRek(p.getVenstre(), element));
        } else if (element.compareTo(p.getElement()) > 0) {
            p.setHogre(leggTilRek(p.getHogre(), element));
        }

        return p;
    }


    public void skrivVerdierOriginal(T nedre, T ovre) {
        skrivVerdierOriginalRek(rot, nedre, ovre);
        System.out.println();
    }

    private void skrivVerdierOriginalRek(BinaerTreNode<T> p, T min, T maks) {
        if (p != null) {
            skrivVerdierOriginalRek(p.getVenstre(), min, maks);

            if (p.getElement().compareTo(min) >= 0 && p.getElement().compareTo(maks) <= 0) {
                System.out.print(p.getElement() + " ");
            }

            skrivVerdierOriginalRek(p.getHogre(), min, maks);
        }
    }

    public void skrivVerdier(T nedre, T ovre) {
        skrivVerdierRek(rot, nedre, ovre);
        System.out.println();
    }

    private void skrivVerdierRek(BinaerTreNode<T> p, T min, T maks) {
        if (p != null) {

            int sjekkNedre = p.getElement().compareTo(min);
            int sjekkOvre = p.getElement().compareTo(maks);

            if (sjekkNedre > 0) {
                skrivVerdierRek(p.getVenstre(), min, maks);
            }

            if (sjekkNedre >= 0 && sjekkOvre <= 0) {
                System.out.print(p.getElement() + " ");
            }

            if (sjekkOvre < 0) {
                skrivVerdierRek(p.getHogre(), min, maks);
            }
        }
    }

    public boolean erBalansert() {
        return erBalansertRek(rot);
    }

    private boolean erBalansertRek(BinaerTreNode<T> p) {
        if (p == null) {
            return true;
        }

        int venstreHogde = 0;
        int hogreHogde = 0;

        if (p.getVenstre() != null) {
            venstreHogde = p.getVenstre().getHogdeU();
        }

        if (p.getHogre() != null) {
            hogreHogde = p.getHogre().getHogdeU();
        }

        int forskjell;

        if (venstreHogde > hogreHogde) {
            forskjell = venstreHogde - hogreHogde;
        } else {
            forskjell = hogreHogde - venstreHogde;
        }

        if (forskjell > 1) {
            return false;
        }

        return erBalansertRek(p.getVenstre()) && erBalansertRek(p.getHogre());
    }
}