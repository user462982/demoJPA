package com.example.demo.repositories;

import com.example.demo.interfaces.WithOtherProperty;
import com.example.demo.interfaces.WithSubProperty;
import com.example.demo.repositoryFragments.OtherPropertyRepositoryFragment;
import com.example.demo.repositoryFragments.SubPropertyRepositoryFragment;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository<T extends WithSubProperty, K extends Long> extends JpaRepository<T, K>, SubPropertyRepositoryFragment<T, K>,
        OtherPropertyRepositoryFragment<WithOtherProperty, K> {}
