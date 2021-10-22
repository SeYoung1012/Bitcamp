package com.test.interfaceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//StudentManager 인터페이스를 구현해서 데이터 저장하는 클래스

public class StudentManagerImpl implements StudentManager {
	// 필드 : List /Set /Map 형태의 데이터 저장소 사용

	Scanner scan = new Scanner(System.in);
	List<StudentVO> list = new ArrayList<>();

	@Override
	public int insert(StudentVO vo) {
		if (isExist(vo))
			return -1;
		list.add(vo);
		return 0;
	}

	@Override
	public StudentVO selectOne(String id) {
		for (StudentVO vo : list) {
			if (vo.getId().equals(id)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public List<StudentVO> selectList(String name) {
		List<StudentVO> lis = new ArrayList<StudentVO>();
		for (StudentVO students : list) {
			if (students.getName().equals(name)) {
				lis.add(students);
			}
		}
		return lis;
	}

	@Override
	public List<StudentVO> selectAll() {
		return list;
	}

	@Override
	public int update(StudentVO vo) {
		StudentVO stu = selectOne(vo.getId());
		int index = list.indexOf(stu);
		if (stu != null) {
			stu.setKor(vo.getKor());
			stu.setEng(vo.getEng());
			stu.setMath(vo.getMath());
			list.set(index, stu);

			return 1;
		}
		return 0;
	}

	@Override
	public int delete(String id) {
		for (StudentVO student : list) {
			if (student.getId() == (id)) {
				list.remove(student);
				return 1;
			}
		}
		return 0;
	}

	private boolean isExist(StudentVO vo) {
		for (StudentVO students : list) {
			if (students.getId().equals(vo.getId())) {
				return true;

			}

		}
		return false;

	}

	public void printData() {
		System.out.println(list);
	}

}
