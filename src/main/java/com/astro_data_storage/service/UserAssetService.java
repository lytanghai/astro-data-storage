package com.astro_data_storage.service;

import com.astro_data_storage.common.DateUtilz;
import com.astro_data_storage.dto.request.CreateUserAssetRequest;
import com.astro_data_storage.dto.response.common.SuccessResponse;
import com.astro_data_storage.entity.CryptoHoldingModel;
import com.astro_data_storage.enumz.MessageResponseType;
import com.astro_data_storage.enumz.OperationType;
import com.astro_data_storage.repository.UserAssetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserAssetService {

    @Autowired
    private UserAssetRepo  userAssetRepo;

    public SuccessResponse registerAsset(CreateUserAssetRequest createUserAssetRequest) {
        SuccessResponse successResponse = new SuccessResponse();
        successResponse.setOperationType(OperationType.CREATE);

        if(createUserAssetRequest == null) {
            successResponse.setResponseType(MessageResponseType.FAILED);
            return successResponse;
        }
        CryptoHoldingModel cryptoHoldingModel = new CryptoHoldingModel();
        cryptoHoldingModel.setSymbol(createUserAssetRequest.getSymbol());
        cryptoHoldingModel.setChatId(createUserAssetRequest.getChatId());
        cryptoHoldingModel.setAmount(createUserAssetRequest.getAmount());
        cryptoHoldingModel.setConvertedAmount(createUserAssetRequest.getConvertedAmount());
        cryptoHoldingModel.setExchangeName(createUserAssetRequest.getExchangeName());
        cryptoHoldingModel.setBuyAt(createUserAssetRequest.getBuyAt());
        cryptoHoldingModel.setCreatedAt(DateUtilz.format(new Date()));

        userAssetRepo.save(cryptoHoldingModel);
        successResponse.setResponseType(MessageResponseType.SUCCESS);
        return successResponse;
    }

}
