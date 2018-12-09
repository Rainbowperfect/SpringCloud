package org.myself.service;

import org.myself.pojo.Dept;

import java.util.List;


public interface DeptService
{
	 boolean add(Dept dept);

	 Dept get(Long id);

	  List<Dept> list();
}
