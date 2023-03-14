import java.util.Date;

public class Prenotazione {
	Date giorno;
	String orario;
	boolean isPossible;
	
	public Prenotazione(Date giorno, String orario, boolean isPossible) {
		super();
		this.giorno = giorno;
		this.orario = orario;
		this.isPossible = isPossible;
	}
	public Date getGiorno() {
		return giorno;
	}
	public void setGiorno(Date giorno) {
		this.giorno = giorno;
	}
	public String getOrario() {
		return orario;
	}
	public void setOrario(String orario) {
		this.orario = orario;
	}
	public boolean isPossible() {
		return isPossible;
	}
	public void setPossible(boolean isPossible) {
		this.isPossible = isPossible;
	}
	
	
}
