package cursoDAgil.bd.domain;

public class Direccion {
	private Integer idDireccion;
	private String calle;
	private Integer numero;
	private String colonia;
	private String ciudad;
	private String estado;
	private String pais;
	private Integer codigoPostal;
	
	public Integer getIdDireccion(){
		return idDireccion;
	}
	
	public void setIdDireccion(Integer idDireccion){
		this.idDireccion = idDireccion;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String Ciudad) {
		this.ciudad = Ciudad;
	}
	
	public Integer getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(Integer CodigoPostal) {
		this.codigoPostal = CodigoPostal;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer Numero) {
		this.numero = Numero;
	}
	
	public String getColonia() {
		return colonia;
	}
	
	public void setColonia(String Colonia) {
		this.colonia = Colonia;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String Estado) {
		this.estado = Estado;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
