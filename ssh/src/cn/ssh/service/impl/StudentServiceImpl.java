package cn.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ssh.dao.StudentDao;
import cn.ssh.pojo.Student;
import cn.ssh.service.StudentService;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	@Override
	public void add(Student student) {
		studentDao.add(student);;
	}

}
