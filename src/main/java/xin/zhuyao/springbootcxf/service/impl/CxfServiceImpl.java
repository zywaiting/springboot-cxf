package xin.zhuyao.springbootcxf.service.impl;

import org.springframework.stereotype.Service;
import xin.zhuyao.springbootcxf.domain.User;
import xin.zhuyao.springbootcxf.service.CxfService;

import javax.jws.WebService;

/**
 * @ClassName CxfServiceImpl
 * @Author zy
 * @Date 2019/11/19 16:04
 * @Description CxfServiceImpl
 * @Version 1.0
 */
@Service
@WebService(targetNamespace = "cxf")
public class CxfServiceImpl implements CxfService {

    @Override
    public User getUser(String id) {
        User user = new User();
        if ("1".equals(id)) {
            user.setId(1L);
            user.setName("yaoZhu");
            user.setPhone("18110981995");
            return user;
        }
        user.setId(2L);
        user.setName("luWang");
        user.setPhone("18110981995");
        return user;
    }
}
