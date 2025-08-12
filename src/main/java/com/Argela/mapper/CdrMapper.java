package com.Argela.mapper;

import com.Argela.dataTransferObject.CdrResponse;
import com.Argela.entities.Cdr;
import org.springframework.stereotype.Component;

@Component
public class CdrMapper {

    public CdrResponse toResponse(Cdr entity) {
        return CdrResponse.builder()
                .id(entity.getId())
                .startTime(entity.getStartTime())
                .endTime(entity.getEndTime())
                .imsi(entity.getImsi())
                .imei(entity.getImei())
                .cellId(entity.getCellId())
                .lacId(entity.getLacId())
                .anumber(entity.getANumber())
                .bnumber(entity.getBNumber())
                .setupDuration(entity.getSetupDuration())
                .conversationDuration(entity.getConversationDuration())
                .direction(entity.getDirection())
                .result(entity.getResult())
                .build();
    }

}

