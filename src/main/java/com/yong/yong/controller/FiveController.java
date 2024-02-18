package com.yong.yong.controller;

import com.yong.yong.domain.Fiveguyz;
import com.yong.yong.dto.FiveguyzDTO;
import com.yong.yong.service.FiveguyzService;
import io.swagger.models.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class FiveController {

    private final FiveguyzService fiveguyzService;

    @PostMapping("/users")
    public Response reigterUser(@RequestBody FiveguyzDTO fiveguyzDTO){
        Response response = new Response();
        fiveguyzService.register(fiveguyzDTO);

        return response;
    }
}



