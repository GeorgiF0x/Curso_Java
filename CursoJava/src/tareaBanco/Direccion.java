package tareaBanco;

public class Direccion {

	//attributos
	private String via;
	private String portal;
	private int piso;
	private int puerta;
	private String ciudad;
	private String pais;
	private int cod_postal;
	
	//constructor
	public Direccion(String via, String portal, int piso, int puerta, String ciudad, String pais, int cod_postal) {
		super();
		this.via = via;
		this.portal = portal;
		this.piso = piso;
		this.puerta = puerta;
		this.ciudad = ciudad;
		this.pais = pais;
		this.cod_postal = cod_postal;
	}
	
	//getter y setter

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getPortal() {
		return portal;
	}

	public void setPortal(String portal) {
		this.portal = portal;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getPuerta() {
		return puerta;
	}

	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(int cod_postal) {
		this.cod_postal = cod_postal;
	}

	//toString
	@Override
	public String toString() {
		return "Direccion [via=" + via + ", portal=" + portal + ", piso=" + piso + ", puerta=" + puerta + ", ciudad="
				+ ciudad + ", pais=" + pais + ", cod_postal=" + cod_postal + "]";
	}
	
	
	
	
	
	
}
