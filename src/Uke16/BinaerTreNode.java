package Uke16;

public class BinaerTreNode<T> {

    private T element;
    private BinaerTreNode<T> venstre;
    private BinaerTreNode<T> hogre;
    private int hogdeU;

    public BinaerTreNode(T element) {
        this.element = element;
        this.venstre = null;
        this.hogre = null;
        this.hogdeU = 1;
    }

    public T getElement() {
        return element;
    }

    public BinaerTreNode<T> getVenstre() {
        return venstre;
    }

    public void setVenstre(BinaerTreNode<T> venstre) {
        this.venstre = venstre;
    }

    public BinaerTreNode<T> getHogre() {
        return hogre;
    }

    public void setHogre(BinaerTreNode<T> hogre) {
        this.hogre = hogre;
    }

    public int getHogdeU() {
        return hogdeU;
    }

    public void setHogdeU(int hogdeU) {
        this.hogdeU = hogdeU;
    }
}
