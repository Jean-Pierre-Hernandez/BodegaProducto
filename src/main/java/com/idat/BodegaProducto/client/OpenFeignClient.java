package com.idat.BodegaProducto.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.BodegaProducto.entity.Producto;

@FeignClient(name="idat-producto", url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/producto/v1/listar")
	public List<Producto> listarProductoSeleccionados();

}
