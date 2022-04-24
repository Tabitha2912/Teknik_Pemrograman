package com.W11.Tekprog.Repository;

import com.W11.Tekprog.Model.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;  
//repository that extends CrudRepository
@Repository  
public interface StudentsRepository <T extends Students> extends CrudRepository<T, Long>
{  
}   