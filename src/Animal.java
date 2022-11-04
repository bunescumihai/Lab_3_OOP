public class Animal {
    private int nrPicioare = 4;
    private String culoare;
    private int inaltime;

    public Animal(String culoare){
        this.culoare = culoare;
    }

    public Animal(int nrPicioare, String culoare){
        this.nrPicioare = nrPicioare;
        this.culoare = culoare;
    }

    public void sunet(){
        System.out.println("Animalul a scos un sunet");
    }

    public void sari(){
        System.out.println("Animalul nu vrea sa sara");
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }
}
