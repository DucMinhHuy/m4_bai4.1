package huy.bai4_1.controller;

import huy.bai4_1.model.Login;
import huy.bai4_1.model.User;
import huy.bai4_1.sevice.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/huy")
public class UserController {
    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView=new ModelAndView("/home","login",new Login());
        return modelAndView;
    }
    @PostMapping("/model")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user= UserDao.checkLogin(login);
        if(user==null){
            ModelAndView modelAndView=new ModelAndView("error");
            return modelAndView;
        }else {
            ModelAndView modelAndView=new ModelAndView("user");
            modelAndView.addObject("user",user);
            return modelAndView;
        }
    }
}