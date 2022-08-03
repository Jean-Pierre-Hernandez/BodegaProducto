package com.idat.BodegaProducto.service;

import com.idat.BodegaProducto.entity.Producto;

public interface ProductoService {
	
	void guardaProducto(Producto producto);
	
	void asignarProductoBodega();
}
