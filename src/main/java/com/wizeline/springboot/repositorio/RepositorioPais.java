/*
 * Copyright (c) 2022 Nextiva, Inc. to Present.
 * All rights reserved.
 */

package com.wizeline.springboot.repositorio;

/**
 * Class Description goes here.
 *
 * @author orlando.rincon@nextiva.com
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wizeline.springboot.entidad.EntidadPais;

@Repository
public interface RepositorioPais extends JpaRepository<EntidadPais, Long>{

}
