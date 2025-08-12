package com.Argela.service;

import com.Argela.dataTransferObject.CdrResponse;

import java.util.List;

public interface CdrService {
    List<CdrResponse> getAll();
    List<CdrResponse> getByCaller(String aNumber);
}
