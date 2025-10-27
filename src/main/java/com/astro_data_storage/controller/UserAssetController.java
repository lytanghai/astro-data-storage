package com.astro_data_storage.controller;

import com.astro_data_storage.dto.request.CreateUserAssetRequest;
import com.astro_data_storage.dto.response.common.SuccessResponse;
import com.astro_data_storage.service.UserAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-asset")
public class UserAssetController {

    @Autowired
    private UserAssetService userAssetService;

    //create
    @PostMapping("/register")
    public SuccessResponse registerAsset(@RequestBody CreateUserAssetRequest createUserAssetRequest) {
        return userAssetService.registerAsset(createUserAssetRequest);
    }

    //get --> summary

    //list

}
