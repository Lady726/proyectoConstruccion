
package com.ecommerce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.demo.model.Producto;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {


}
