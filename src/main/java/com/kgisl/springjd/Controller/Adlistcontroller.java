package com.kgisl.springjd.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.kgisl.springjd.Service.AdlistService;
import com.kgisl.springjd.Service.LoginService;
import com.kgisl.springjd.entity.Adlist;
import com.kgisl.springjd.entity.UserModel;
@Controller
@RequestMapping("/adlist")
public class Adlistcontroller {
@Autowired
private AdlistService adlistService;

@Autowired
private LoginService loginService;

    @GetMapping("/l1")
    public String signup() {
    
        return "index";
    }
    @GetMapping("/list")
    public String listAdlist(Model theModel) {
      
        List < Adlist > theAdlist= adlistService.getAdlists();
        theModel.addAttribute("adlist", theAdlist);
        return "list-adlist";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        //System.out.println("");
        Adlist theadlist = new Adlist();
        theModel.addAttribute("adlist", theadlist);
        return "Adlist-form";
    }

    @PostMapping("/saveAdlist")
    public String saveAdlist(@ModelAttribute("adlist") Adlist theAdlist) {
        adlistService.saveAdlist(theAdlist);
        return "redirect:/adlist/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("Id") int theId,
        Model theModel) {
        Adlist theAdlist= adlistService.getaAdlist(theId);
        theModel.addAttribute("adlist", theAdlist);
        return "Adlist-form";
    }

    @GetMapping("/delete")
    public String deleteAdlist(@RequestParam("Id") int theId) {
        //System.out.println(theId);
        adlistService.deleteAdlist(theId);
        return "redirect:/adlist/list";
    }
    @GetMapping("/list2")
    public String listUserModel(Model theModel) {
      
        List < UserModel > theUserModel= loginService.getUserModels();
        theModel.addAttribute("userModel", theUserModel);
        return "list-adlist";
    }

    @GetMapping("/showForm1")
    public String showFormForAdd1(Model theModel) {
        //System.out.println("");
        UserModel theUserModel = new UserModel();
        theModel.addAttribute("userModel", theUserModel);
        return "Login-form";
    }

    @PostMapping("/saveUserModel")
    public String saveUserModel(@ModelAttribute("userModel") UserModel theUserModel) {
        loginService.saveUserModel(theUserModel);
        return "home";
    }
    @GetMapping("/list3")
    public String listCategory(Model theModel) {
      Adlist adlist=new Adlist();
        theModel.addAttribute("userModel", adlist);
        return "category-l";
    }
    @GetMapping("/l")
    public String listLoginModel(Model theModel) {
      Adlist adlist=new Adlist();
        theModel.addAttribute("LoginModel", adlist);
        return "adminlogin";
    }
    @GetMapping("/log")
    public String loginModel(Model theModel) {
     
        Adlist adlist=new Adlist();
        theModel.addAttribute("LoginModel", adlist);
        return "home";
    }
}

