package com.kyulhansoft.service;

import com.kyulhansoft.entity.Todo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Transactional // transform class into a service
public class TodoService {
    
    @PersistenceContext
    EntityManager entityManager;
    
    public Todo create(Todo todo) {
        entityManager.persist(todo);
        return todo;
    }
    
    public Todo update(Todo todo) {
        entityManager.merge(todo);
        return todo;
    }
    
    public Todo find(Long id) {
        return entityManager.find(Todo.class, id);
    }
    
    public List<Todo> getTodos() {
        return entityManager.createQuery("select t from Todo t", Todo.class).getResultList();
    }
}
