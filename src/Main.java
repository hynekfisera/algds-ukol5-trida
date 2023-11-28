public class Main {
    public static void main(String[] args) {
        Clovek petr = new Clovek();
        petr.setJmeno("Petr");
        petr.setVek(40);
        petr.setBarvaOci("modrá");
        petr.setVyska(180);
        System.out.println(petr.getJmeno());
    }
}