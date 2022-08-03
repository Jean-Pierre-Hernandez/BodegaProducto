package com.idat.BodegaProducto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BodegaProductoFK implements Serializable{
	
	private static final long serialVersionUID = 4417214286334278899L;

	
	@Column(name="id_bodega", nullable = false, unique = true)
	private Integer idBodega;
	
	@Column(name="id_producto", nullable = false, unique = true)
	private Integer idProducto;

	
	public Integer getIdBodega() {
		return idBodega;
	}

	/**
	 * @param idBodega the idBodega to set
	 */
	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}

	/**
	 * @return the idProducto
	 */
	public Integer getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	
	
}
