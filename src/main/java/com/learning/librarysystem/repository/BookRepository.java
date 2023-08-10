/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.learning.librarysystem.repository;

import com.learning.librarysystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author erick.karanja_cellul
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
