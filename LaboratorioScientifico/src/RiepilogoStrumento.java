
public class RiepilogoStrumento {
	int utilizziMensili;
	int UtilizziAnnuali;
	
	public RiepilogoStrumento(int utilizziMensili, int utilizziAnnuali) {
		super();
		this.utilizziMensili = utilizziMensili;
		UtilizziAnnuali = utilizziAnnuali;
	}

	public int getUtilizziMensili() {
		return utilizziMensili;
	}

	public void setUtilizziMensili(int utilizziMensili) {
		this.utilizziMensili = utilizziMensili;
	}

	public int getUtilizziAnnuali() {
		return UtilizziAnnuali;
	}

	public void setUtilizziAnnuali(int utilizziAnnuali) {
		UtilizziAnnuali = utilizziAnnuali;
	}
	
	
}
