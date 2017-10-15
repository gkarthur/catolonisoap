package com.archi.repo.cap.catoloni.service;

import java.util.List;

import com.archi.repo.cap.catoloni.domain.Catoloni;

public interface CatoloniService {
	List<Catoloni> getList();
	Catoloni getById(Long id);
}
