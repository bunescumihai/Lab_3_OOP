public class Pisica extends Animal{

    public Pisica(String culoare){
        super(4,culoare);
    }

    @Override
    public void sunet(){
        System.out.println("Meow");
    }

    public void sunet(int n){
        for(int i = 0; i < n; i++)
            System.out.println("Meow");
    }
}
