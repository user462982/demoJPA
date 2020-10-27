package com.example.demo.repositoryFragments;

import com.example.demo.entities.SubProperty;
import com.example.demo.interfaces.WithOtherProperty;
import com.example.demo.interfaces.WithSubProperty;

import java.util.List;

public interface OtherPropertyRepositoryFragment<T extends WithOtherProperty, K> {
    List<T> deleteAllByOtherProperty(String otherProperty);
}
