public abstract class Televizor {
    private int lungime;
    private int latime;
    private int inaltime;
    private boolean aprins = false;

    public Televizor(int lungime, int latime, int inaltime) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public abstract void stingeTelevizor();
    public abstract void aprindeTelevizor();

    public void asteapta(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e){

        }
    }

    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }

    public int getInaltime() {
        return inaltime;
    }

    public boolean isAprins() {
        return aprins;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void setAprins(boolean aprins) {
        this.aprins = aprins;
    }
}
