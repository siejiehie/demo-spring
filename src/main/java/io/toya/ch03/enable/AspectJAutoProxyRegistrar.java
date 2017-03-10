package io.toya.ch03.enable;

import org.springframework.aop.config.AopConfigUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by Sai on 2017/3/10.
 */
public class AspectJAutoProxyRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        AopConfigUtils.registerAspectJAnnotationAutoProxyCreatorIfNecessary(beanDefinitionRegistry);
        // AnnotationAttributes enableAJAutoProxy = AnnotationConfigUtils.attributesFor(annotationMetadata, EnableAspectJAutoProxy.class);
        AnnotationAttributes enableAJAutoProxy = null;
        if (enableAJAutoProxy.getBoolean("proxyTargetClass")) {
            AopConfigUtils.forceAutoProxyCreatorToUseClassProxying(beanDefinitionRegistry);
        }
    }

}
