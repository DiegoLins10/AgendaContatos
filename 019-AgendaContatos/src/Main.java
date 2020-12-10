//@Author Diego Lins
public class Main {

	public static void main(String[] args) {
		
		TabelaDeContatos t = new TabelaDeContatos();
		t.adiciona("Diego ", "11987549239");
		t.adiciona("Andreia ","11155454");
		t.adiciona("tais ", "6564546546");
		t.percorre();
	}

}