package com.W11.Tekprog.Service;

import java.util.List;
import com.W11.Tekprog.Model.Students;
public interface GenericService<T extends Students> {
    List<T> findAll() throws Exception;
	T save(T entity) throws Exception;
	void delete(Long id) throws Exception;
}
