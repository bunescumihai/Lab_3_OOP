public class TelevizorulMeu extends Televizor{
    private int source = 1;

    public TelevizorulMeu(int lungime, int latime, int inaltime){
        super(lungime, latime, inaltime);
    }

    @Override
    public void stingeTelevizor() {
        asteapta(2);
        setAprins(false);
    }

    @Override
    public void aprindeTelevizor() {
        asteapta(4);
        setAprins(true);
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }
}
