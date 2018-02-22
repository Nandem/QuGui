package cn.duyeying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * All rights Reserved, Designed By hxjd
 * 类　名: Starter
 * 包　名: cn.duyeying
 * 所　属: 华夏九鼎
 * 版　权: 2018 hxjd Inc. All rights reserved.
 * 日　期: 2/22/2018 9:59 PM
 * 版　本: V1.0
 * 创建人：Nandem
 * 修改人：修改人
 * 注　意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 * 描　述: TODO(用一句话描述该文件做什么)
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Starter
{
    public static void main(String[] args)
    {
        SpringApplication.run(Starter.class, args);
    }
}
