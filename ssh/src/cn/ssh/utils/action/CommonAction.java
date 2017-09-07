package cn.ssh.utils.action;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Service
@Scope(value="prototype")
@ParentPackage(value="struts-default")
@Namespace(value="/")
public class CommonAction<T> extends ActionSupport implements ModelDriven<T> {
	
	protected T entity;
	
	@Override
	public T getModel() {
		return entity;
	}

	public CommonAction() {
//		获得子类的.class对象
		Class childrenClass = this.getClass();
//		获得子类的父类的类型
		Type superclass = childrenClass.getGenericSuperclass();
//		判断是否为父类的参数化类型.并强转为参数化类型
		ParameterizedType type = null;
		if (superclass instanceof ParameterizedType) {
			type =  (ParameterizedType) superclass;
		}
//		从参数化类型中得到参数类型
		Type[] types = type.getActualTypeArguments();
		Class clazz = (Class) types[0];
		try {
			entity = (T) clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	
}
