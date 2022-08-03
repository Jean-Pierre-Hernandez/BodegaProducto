package com.idat.BodegaProducto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.BodegaProducto.entity.ProductoDetalle;

@Repository
public interface DetalleProductoRepository extends JpaRepository<ProductoDetalle, Integer> {

}
