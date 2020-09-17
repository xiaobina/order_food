package only.mxb.orderfood.controller;

import only.mxb.orderfood.entities.User;
import only.mxb.orderfood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author isalo
 * @date 2020-05-18 10:01
 *
 * 登陆/登出模
 *
 * @RestController：封装了Controller和responseBody
 * @GetMapping:封装了requestMapping和requestBody
 *
 */
@Controller
public class LogController {
    @Autowired
    UserService userService;
    @Autowired
    HttpServletRequest request;

    @ResponseBody
    @GetMapping("/login")
    public boolean login(User user) {
        User user1 = userService.selectUserByPhone(user.getPhone());
        if (user1 != null && user1.getCode().equals(user.getCode())) {
            request.getSession().setAttribute("userPhone", user.getPhone());
            return true;
        } else {
            return true;
        }
    }

    @ResponseBody
    @GetMapping("/logout")
    public boolean logout(User user) {
        System.out.println("aaa");
        request.getSession().invalidate();
        return true;
    }

    @ResponseBody
    @GetMapping("/updateCode")
    public void updateCode(User user){
        userService.updateUserByPhone(user);
    }
}
