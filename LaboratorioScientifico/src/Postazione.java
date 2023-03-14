
public class Postazione {
	String idPostazione;
	int postiTotali;
	int postiDisponibili;
	
	public Postazione(String idPostazione, int postiTotali, int postiDisponibili) {
		super();
		this.idPostazione = idPostazione;
		this.postiTotali = postiTotali;
		this.postiDisponibili = postiDisponibili;
	}

	public String getIdPostazione() {
		return idPostazione;
	}

	public void setIdPostazione(String idPostazione) {
		this.idPostazione = idPostazione;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public void setPostiTotali(int postiTotali) {
		this.postiTotali = postiTotali;
	}

	public int getPostiDisponibili() {
		return postiDisponibili;
	}

	public void setPostiDisponibili(int postiDisponibili) {
		this.postiDisponibili = postiDisponibili;
	}
	
}
