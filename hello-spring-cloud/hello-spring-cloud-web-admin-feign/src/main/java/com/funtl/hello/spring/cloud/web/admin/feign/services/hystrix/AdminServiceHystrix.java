package com.funtl.hello.spring.cloud.web.admin.feign.services.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.services.AdminService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message){
        return String.format("hi,your message:\\\"\"+ message+\"\\\"but,request essor");
    }

}
