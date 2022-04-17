/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pham Thang <Thangyb2706@gmail.com>
 */
public interface Dao<T> {
    List<T> getAll();
    Optional<T> get(int id);
    Optional<T> get(String id);
    int insert(T t);
    int update(T t);
    int delete(T t);
    List<T> find(T t);
}
