
public class Responsabile extends Utente{
	String matricolaResponsabile;
	String nomeResponsabile;
	String cognomeResponsabile;
	int eta;
	String email;
	String telefono;
	
	public Responsabile(String username, String password, String matricolaResponsabile, String nomeResponsabile,
			String cognomeResponsabile, int eta, String email, String telefono) {
		super(username, password);
		this.matricolaResponsabile = matricolaResponsabile;
		this.nomeResponsabile = nomeResponsabile;
		this.cognomeResponsabile = cognomeResponsabile;
		this.eta = eta;
		this.email = email;
		this.telefono = telefono;
	}

	public String getMatricolaResponsabile() {
		return matricolaResponsabile;
	}

	public void setMatricolaResponsabile(String matricolaResponsabile) {
		this.matricolaResponsabile = matricolaResponsabile;
	}

	public String getNomeResponsabile() {
		return nomeResponsabile;
	}

	public void setNomeResponsabile(String nomeResponsabile) {
		this.nomeResponsabile = nomeResponsabile;
	}

	public String getCognomeResponsabile() {
		return cognomeResponsabile;
	}

	public void setCognomeResponsabile(String cognomeResponsabile) {
		this.cognomeResponsabile = cognomeResponsabile;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
