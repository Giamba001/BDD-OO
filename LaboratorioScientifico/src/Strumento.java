
public class Strumento {
	String nomeStrumento;
	String descrizione;
	String caratteristicheTecniche;
	
	public Strumento(String nomeStrumento, String descrizione, String caratteristicheTecniche) {
		super();
		this.nomeStrumento = nomeStrumento;
		this.descrizione = descrizione;
		this.caratteristicheTecniche = caratteristicheTecniche;
	}

	public String getNomeStrumento() {
		return nomeStrumento;
	}

	public void setNomeStrumento(String nomeStrumento) {
		this.nomeStrumento = nomeStrumento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCaratteristicheTecniche() {
		return caratteristicheTecniche;
	}

	public void setCaratteristicheTecniche(String caratteristicheTecniche) {
		this.caratteristicheTecniche = caratteristicheTecniche;
	}
	
	
}
