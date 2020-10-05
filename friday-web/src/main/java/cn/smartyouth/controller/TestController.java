package cn.smartyouth.controller;

import cn.smartyouth.friday.common.core.JsonResponse;
import cn.smartyouth.service.IUsrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class TestController {

    @Autowired
    private IUsrInfoService usrInfoService;

    @GetMapping("/queryUsr")
    public JsonResponse queryUsr(){
        return JsonResponse.success(usrInfoService.list());
    }
}
