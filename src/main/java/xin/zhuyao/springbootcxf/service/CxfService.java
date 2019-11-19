package xin.zhuyao.springbootcxf.service;

import xin.zhuyao.springbootcxf.domain.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @ClassName CxfService
 * @Author zy
 * @Date 2019/11/19 16:02
 * @Description CxfService
 * @Version 1.0
 */
@WebService(targetNamespace = "cxf")
public interface CxfService {

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @WebMethod
    User getUser(@WebParam(name = "id") String id);
}
