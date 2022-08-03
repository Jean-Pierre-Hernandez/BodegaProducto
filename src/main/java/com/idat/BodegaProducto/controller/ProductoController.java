package com.idat.BodegaProducto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.BodegaProducto.entity.Producto;
import com.idat.BodegaProducto.service.ProductoService;

@RestController
@RequestMapping("/api/producto/v1")
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Producto producto) {
		service.guardaProducto(producto);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarProductoBodega() {
		service.asignarProductoBodega();
	}

}
