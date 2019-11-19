package xin.zhuyao.springbootcxf.config;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xin.zhuyao.springbootcxf.service.CxfService;

import javax.xml.ws.Endpoint;

/**
 * @ClassName CxfConfig
 * @Author zy
 * @Date 2019/11/14 19:56
 * @Description CxfConfig
 * @Version 1.0
 */
@Configuration
public class CxfConfig {

    @Autowired
    private CxfService cxfService;

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(){
        return new SpringBus();
    }

    /**
     * AX-WS站点服务
     * @return
     */
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), cxfService);
        endpoint.publish("/visual");
        return endpoint;
    }
}
