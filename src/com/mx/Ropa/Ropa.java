/**
 * 
 */
package com.mx.Ropa;

/**
 * 
 */
public class Ropa {
	private int clave;
	private String tipo;
	private String marca;
	private String talla;
	private String origen;
	private double precio;

	/**
	 * Constructor parametrizado
	 * @param clave
	 * @param tipo
	 * @param marca
	 * @param origen
	 * @param precio
	 */
	public Ropa(int clave, String tipo, String marca, String origen, String talla, double precio) {
		this.clave = clave;
		this.tipo = tipo;
		this.marca = marca;
		this.origen = origen;
		this.talla = talla;
		this.precio = precio;
	}
	

	/**
	 * @return the talla
	 */
	public String getTalla() {
		return talla;
	}

	/**
	 * @param clave
	 */
	public Ropa(int clave) {
		this.clave = clave;
	}

	/**
	 * @param talla the talla to set
	 */
	public void setTalla(String talla) {
		this.talla = talla;
	}

	/**
	 * Constructor vacio
	 */
	public Ropa() {
	}

	/**
	 * @return the clave
	 */
	public int getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(int clave) {
		this.clave = clave;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ropa [clave=" + clave + ", tipo=" + tipo + ", marca=" + marca + ", origen=" + origen + ", precio="
				+ precio + "]\n";
	}

}
