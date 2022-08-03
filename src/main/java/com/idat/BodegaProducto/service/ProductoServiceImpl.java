package com.idat.BodegaProducto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.BodegaProducto.client.OpenFeignClient;
import com.idat.BodegaProducto.entity.BodegaProductoFK;
import com.idat.BodegaProducto.entity.Producto;
import com.idat.BodegaProducto.entity.ProductoDetalle;
import com.idat.BodegaProducto.repository.DetalleProductoRepository;
import com.idat.BodegaProducto.repository.ProductoRepository;



@Service
public class ProductoServiceImpl implements ProductoService{
	
	
	@Autowired
	private ProductoRepository repositoryProducto;
	
	@Autowired
	private DetalleProductoRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public void guardaProducto(Producto producto) {
		repositoryProducto.save(producto);
	}

	@Override
	public void asignarProductoBodega() {
		
		List<Producto> listado = feign.listarProductoSeleccionados();;
		BodegaProductoFK fk = null;
		ProductoDetalle detalle = null;
		
		for (Producto producto : listado) {
			
			fk = new BodegaProductoFK();
			fk.setIdProducto(producto.getIdProducto());
			fk.setIdProducto(1);
			
			detalle = new ProductoDetalle();
			detalle.setFk(fk);
			
			repositoryDetalle.save(detalle);
		}
		
	}
	

}
