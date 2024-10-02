package com.proyecto01.proyecto01.service;

import com.proyecto01.proyecto01.model.Producto;
import com.proyecto01.proyecto01.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto saveProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public List<Producto> getProductos(){
        return productoRepository.getAllProductos();
    }

    public Producto getProductoById(int id){
        return productoRepository.findById(id);
    }

    public String deleteProducto(int id){
        productoRepository.delete(id);
        return "Producto eliminado !!" + id;
    }

    public Producto updateProducto(Producto  producto){
        return productoRepository.update(producto);
    }
}