public class Main  {
    public static void main(String[] args) {
        Animal caine = new Animal("Negru");
        caine.sunet();
        Animal pisica = new Pisica("Orange");
        pisica.sunet();
        Pisica pisica1 = new Pisica("Sura");
        pisica1.sunet();
        pisica1.sunet(3);
        pisica1.sari();

        Matematica matematica = new Matematica();
        System.out.println(matematica.adunare(3,4));

        TelevizorulMeu televizorulMeu = new TelevizorulMeu(810,25,600);
        televizorulMeu.aprindeTelevizor();
        System.out.println("Televizorul s-a aprins");
        televizorulMeu.stingeTelevizor();
        System.out.println("Televizorul s-a stins");
    }
}
