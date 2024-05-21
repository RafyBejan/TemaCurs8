
public class Exemplu {
	public void doSomething(int i) {
        try {
            if (i == 0) throw new E1();
            else throw new E2();
        } catch (E1 | E2 e) {
            System.out.println("Prins");
        }
    }

    public static void main(String[] args) {
        Exemplu exemplu = new Exemplu();
        exemplu.doSomething(0);  
        exemplu.doSomething(1);  
    }
}

