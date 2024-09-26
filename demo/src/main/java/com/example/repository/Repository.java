package com.example.repository;
import java.util.List;
public interface Repository<T> {
    void insert(T dt);
    int insert(String sql);
    List<T> selectAll();
}

    
