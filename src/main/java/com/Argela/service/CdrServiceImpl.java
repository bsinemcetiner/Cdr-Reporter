package com.Argela.service;

import com.Argela.dataTransferObject.CdrResponse;
import com.Argela.mapper.CdrMapper;
import com.Argela.repository.CdrRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CdrServiceImpl implements CdrService {

    private final CdrRepository cdrRepository;
    private final CdrMapper cdrMapper;

    @Override
    public List<CdrResponse> getAll() {
        return cdrRepository.findAll()
                .stream()
                .map(cdrMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<CdrResponse> getByCaller(String aNumber) {
        return cdrRepository.findByaNumber(aNumber)
                .stream()
                .map(cdrMapper::toResponse)
                .collect(Collectors.toList());
    }
}
