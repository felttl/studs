package com.felix.todo.DAO;


import java.util.List;

/**
 * crud minimum method and functions
 */
public interface Crud {
    boolean insert();
    Object selectById(long id);
    List<Object> selectAll();
    boolean update();
    boolean delete();
}
