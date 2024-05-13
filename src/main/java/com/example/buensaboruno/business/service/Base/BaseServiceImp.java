package com.example.buensaboruno.business.service.Base;


import com.example.buensaboruno.domain.entities.Base;
import com.example.buensaboruno.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public abstract class BaseServiceImp<E extends Base,ID extends Serializable> implements BaseService<E, ID> {



    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImp(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public E create(E request){
        var newEntity = baseRepository.save(request);

        return newEntity;
    }

    @Override
    @Transactional
    public E getById(ID id){
        Optional<E> entityOptional = baseRepository.findById(id);
        return entityOptional.get();

    }

    @Override
    @Transactional
    public List<E> getAll(){
        var entities = baseRepository.findAll();

        return entities;
    }

    @Override
    @Transactional
    public void deleteById(ID id){
        var entity = getById(id);
        baseRepository.delete(entity);

    }

    @Override
    @Transactional
    public E update(E request, ID id){
        var optionalEntity = baseRepository.findById((ID) request.getId());
        if (optionalEntity.isEmpty()){

            throw new RuntimeException("No se encontro una entidad con el id " + request.getId());
        }
        var newEntity = baseRepository.save(request);

        return newEntity;
    }
}
