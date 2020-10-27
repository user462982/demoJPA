package com.example.demo.repositoryFragments;

import com.example.demo.entities.SubProperty;
import com.example.demo.interfaces.WithSubProperty;

import java.util.List;

public interface SubPropertyRepositoryFragment<T extends WithSubProperty, K> {
    List<T> findAllBySubProperty(SubProperty subProperty);
}
