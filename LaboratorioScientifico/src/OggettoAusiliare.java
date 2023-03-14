
public class OggettoAusiliare {
	String nome;
	String descrizione;
	int quantita;
	
	public OggettoAusiliare(String nome, String descrizione, int quantita) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.quantita = quantita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
}
