public class Matematica implements MathOperations{
    @Override
    public int adunare(int a, int b) {
        return a+b;
    }

    @Override
    public int scadere(int a, int b) {
        return a-b;
    }

    @Override
    public int inmultire(int a, int b) {
        return a*b;
    }

    @Override
    public int impartire(int a, int b) {
        return a/b;
    }

    @Override
    public int div(int a, int b) {
        return a%b;
    }
}
