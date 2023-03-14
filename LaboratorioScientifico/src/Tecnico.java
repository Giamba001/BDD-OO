
public class Tecnico extends Utente{	
		String matricola;
		String nome;
		String cognome;
		int eta;
		String email;
		String telefono;
	
		public Tecnico(String username, String password, String matricola, String nome, String cognome, int eta,
			String email, String telefono) {
		super(username, password);
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.email = email;
		this.telefono = telefono;
	}

		public String getMatricola() {
			return matricola;
		}

		public void setMatricola(String matricola) {
			this.matricola = matricola;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
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
	


