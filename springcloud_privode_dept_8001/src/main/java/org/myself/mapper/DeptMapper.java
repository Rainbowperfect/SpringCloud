package org.myself.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.myself.pojo.Dept;

import java.util.List;

@Mapper
public interface DeptMapper {

     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();
}
