package cn.ssh.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import cn.ssh.dao.StudentDao;
import cn.ssh.pojo.Student;
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate; 
	@Override
	public void add(Student student) {
		hibernateTemplate.save(student);
	}

}
