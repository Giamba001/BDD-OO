
public class RiepilogoOggettoAusiliare {
	String consumoMensile;
	String consumoAnnuale;
	
	public RiepilogoOggettoAusiliare(String consumoMensile, String consumoAnnuale) {
		super();
		this.consumoMensile = consumoMensile;
		this.consumoAnnuale = consumoAnnuale;
	}

	public String getConsumoMensile() {
		return consumoMensile;
	}

	public void setConsumoMensile(String consumoMensile) {
		this.consumoMensile = consumoMensile;
	}

	public String getConsumoAnnuale() {
		return consumoAnnuale;
	}

	public void setConsumoAnnuale(String consumoAnnuale) {
		this.consumoAnnuale = consumoAnnuale;
	}
	
}
