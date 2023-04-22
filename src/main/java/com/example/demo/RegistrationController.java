package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.Arrays;

@RestController
public class RegistrationController {
    @GetMapping("/register")
    public ModelAndView register(@ModelAttribute RegistData registData,ModelAndView mv){
        StringBuilder sb = new StringBuilder();
		sb.append("名前：" + registData.getName());
		sb.append(", パスワード：" + registData.getPassword());
		sb.append(", 性別：" + registData.getGender());
		sb.append(", 地域：" + registData.getArea());
		sb.append(", 興味のある分野：" + Arrays.toString(registData.getInterest()));
		//sb.append(", 備考：" + registData.getRemarks().replaceAll("¥n", ""));
		mv.setViewName("result"); 
		mv.addObject("registData", sb.toString());
		return mv;
    }
}
