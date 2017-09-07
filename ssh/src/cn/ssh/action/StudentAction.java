package cn.ssh.action;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ssh.pojo.Student;
import cn.ssh.service.StudentService;
import cn.ssh.utils.action.CommonAction;

public class StudentAction extends CommonAction<Student>{

	@Autowired
	private StudentService studentService;
	
	@Action(value="add")
	public void add(){
		studentService.add(entity);
	}
}
