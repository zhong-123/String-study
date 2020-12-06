package edu.nf.ch04.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author wangl
 * @date 2020/12/1
 * BeanPostProcessor这个接口称之为Bean的后处理器，它可以在Spring容器实例化
 * bean对象并完成依赖注入，在执行bean的初始化方法（如：InitializingBean接口、
 * 自定义的init-method）前后执行，用于添加一些其他的处理逻辑。（注意：这个接口
 * 是针对所有的Bean）
 */
public class MyPostProcessor implements BeanPostProcessor {

    /**
     * 在执行初始化方法前执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessBeforeInitialization");
        return bean;
    }

    /**
     * 执行初始化方法后执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行postProcessAfterInitialization");
        return bean;
    }
}
