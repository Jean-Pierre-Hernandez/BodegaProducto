package com.idat.BodegaProducto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_producto")
public class ProductoDetalle {
	
	@Id
	private BodegaProductoFK fk =new BodegaProductoFK();

	/**
	 * @return the fk
	 */
	public BodegaProductoFK getFk() {
		return fk;
	}

	/**
	 * @param fk the fk to set
	 */
	public void setFk(BodegaProductoFK fk) {
		this.fk = fk;
	}
	
	

}
