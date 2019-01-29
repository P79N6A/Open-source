package com.txp.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 基于 EnvironmentPostProcessor 扩展外部化配置属性源
 * // 3. from-EnvironmentPostProcessor : 19
 *
 * @author zhaoyao
 * @version 1.0
 * @date 2019-01-29
 */
@Slf4j
public class ExtendPropertySourcesEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {

        log.info("[ExtendPropertySourcesEnvironmentPostProcessor] EnvironmentPostProcessor postProcessEnvironment");
    }

}
