public class TabelaDeContatos {
	private ListaDeContatos tabela[];

	public TabelaDeContatos() {
		tabela = new ListaDeContatos[26];
	}

	public int funcaoDeEspalhamento(char c) {
		int letra = c;
		return letra - 97;
	}

	public void adiciona(String nome, String fone) {
		char letra = nome.toLowerCase().charAt(0);
		int i = funcaoDeEspalhamento(letra);
		if (tabela[i] == null)
			tabela[i] = new ListaDeContatos();
		tabela[i].adiciona(new Contato(nome, fone));
	}

	public Contato remove(String nome) {
		char letra = nome.toLowerCase().charAt(0);
		int i = funcaoDeEspalhamento(letra);
		if (tabela[i] != null) {
			return tabela[i].remove(nome);
		}
		return null;
	}

	public void percorre() {
		for (int i = 0; i < tabela.length; i++) {
			if (tabela[i] != null)
				System.out.println(tabela[i].percorre());
		}
	}
}
