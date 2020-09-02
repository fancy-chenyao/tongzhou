package cn.ncepu.service_basicdata.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Xia Bing
 * @Description:
 * @Date: Create in 17:04 2020/8/29
 * @Modified By:
 */
@Configuration
@MapperScan("cn.ncepu.service_basicdata.mapper")
public class BasicConfig {
}
