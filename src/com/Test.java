package com;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.omg.CosNaming._NamingContextExtStub;

public class Test {
	Teacher t1,t2,t3;
	Student st1,st2,st3;
	Course cou1,cou2,cou3;
	
	public void setteacher(Teacher teacher){
		this.t1=teacher;
		this.t2=teacher;
		this.t3=teacher;
	}
	public void setStudent(Student student) {
		this.st1 = student;
		this.st2 = student;
		this.st3 = student;
	}
	public void setCourse(Course course) {
		this.cou1 = course;
		this.cou2 = course;
		this.cou3 = course;
	}
	
	void show(){
		t1 = new Teacher(4087, 28, "������", "��");
		st1 = new Student(3226, 22, "С��", "Ů");
		cou1 = new Course(10833216, "Java��Ŀ����", "1#202", "2020/03/12","������");
		
		t2 = new Teacher(4089, 33, "��Ծƽ", "��");
		st2 = new Student(3227, 21, "С��", "��");
		cou2 = new Course(10833217, "��������繤��", "1#302", "2020/03/15","��Ծƽ");
		
		t3 = new Teacher(4083, 24, "����Ѿ", "Ů");
		st3 = new Student(3220, 24, "С��", "Ů");
		cou3 = new Course(10833213, "JavaScript����", "1#402", "2020/03/22","����Ѿ");
		
		System.out.println("\n--------------------ѡ�οα�����---------------------\n");
		System.out.println("  ���		    �γ���	 ����	   ʱ��		 ��ʦ");
		System.out.println(cou1.getCouId()+"	"+cou1.getCouName()
				+"	"+cou1.getCouAddress()+"	"+cou1.getCouTime()+"	"+cou1.getTeacher());
		System.out.println(cou2.getCouId()+"	"+cou2.getCouName()
				+"	"+cou2.getCouAddress()+"	"+cou2.getCouTime()+"	"+cou2.getTeacher());
		System.out.println(cou3.getCouId()+"	"+cou3.getCouName()
				+"	"+cou3.getCouAddress()+"	"+cou3.getCouTime()+"	"+cou3.getTeacher());
		
		System.out.println("\n--------------------ѧ����Ϣ����---------------------\n");
		System.out.println("ѧ��	����	�Ա�    ����");
		System.out.println(st1.getId()+"	"+st1.getName()+"	"+st1.getSex()+"	"
				+st1.getAge());
		System.out.println(st2.getId()+"	"+st2.getName()+"	"+st2.getSex()+"	"
				+st2.getAge());
		System.out.println(st3.getId()+"	"+st3.getName()+"	"+st3.getSex()+"	"
				+st3.getAge());
		
		int stu,tea,i,esc;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n--------------------����ѡ������1���˿�����2������---------------------\n");
		i=scanner.nextInt();
		if(i==1) {
		System.out.println("\n������ѧ����ţ�");
		stu=scanner.nextInt();
		System.out.println("�������ʦ��ţ�");
		tea=scanner.nextInt();
		if(stu==st1.getId()) {
			if(tea==cou1.getCouId()) {
				System.out.println("ѧ��	����	�Ա�      ���		   �γ���        ����	   ʱ��		 ��ʦ");
				System.out.println(st1.getId()+"	"+st1.getName()+"	"+st1.getSex()+"	"
						+cou1.getCouId()+"	"+cou1.getCouName()
						+"	"+cou1.getCouAddress()+"	"+cou1.getCouTime()+"	"+cou1.getTeacher());
			}else if(tea==cou2.getCouId()) {
				System.out.println("ѧ��	����	�Ա�      ���		   �γ���        ����	   ʱ��		 ��ʦ");
				System.out.println(st1.getId()+"	"+st1.getName()+"	"+st1.getSex()+"	"
						+cou2.getCouId()+"	"+cou2.getCouName()
						+"	"+cou2.getCouAddress()+"	"+cou2.getCouTime()+"	"+cou2.getTeacher());
			}else if(tea==cou3.getCouId()) {
				System.out.println("ѧ��	����	�Ա�      ���		   �γ���        ����	   ʱ��		 ��ʦ");
				System.out.println(st1.getId()+"	"+st1.getName()+"	"+st1.getSex()+"	"
						+cou3.getCouId()+"	"+cou3.getCouName()
						+"	"+cou3.getCouAddress()+"	"+cou3.getCouTime()+"	"+cou3.getTeacher());
			}
			System.out.println("\n--------------------ѡ�γɹ�������---------------------\n");
			
		}else if(stu==st2.getId()) {
			if(tea==cou1.getCouId()) {
				System.out.println("ѧ��	����	�Ա�      ���		   �γ���        ����	   ʱ��		 ��ʦ");
				System.out.println(st2.getId()+"	"+st2.getName()+"	"+st2.getSex()+"	"
						+cou1.getCouId()+"	"+cou1.getCouName()
						+"	"+cou1.getCouAddress()+"	"+cou1.getCouTime()+"	"+cou1.getTeacher());
			}else if(tea==cou2.getCouId()) {
				System.out.println("ѧ��	����	�Ա�      ���		   �γ���        ����	   ʱ��		 ��ʦ");
				System.out.println(st2.getId()+"	"+st2.getName()+"	"+st2.getSex()+"	"
						+cou2.getCouId()+"	"+cou2.getCouName()
						+"	"+cou2.getCouAddress()+"	"+cou2.getCouTime()+"	"+cou2.getTeacher());
			}else if(tea==cou3.getCouId()) {
				System.out.println("ѧ��	����	�Ա�      ���		   �γ���        ����	   ʱ��		 ��ʦ");
				System.out.println(st2.getId()+"	"+st2.getName()+"	"+st2.getSex()+"	"
						+cou3.getCouId()+"	"+cou3.getCouName()
						+"	"+cou3.getCouAddress()+"	"+cou3.getCouTime()+"	"+cou3.getTeacher());
			}
			System.out.println("\n--------------------ѡ�γɹ�������---------------------\n");
			
		}else if(stu==st3.getId()) {
			if(tea==cou1.getCouId()) {
				System.out.println("ѧ��	����	�Ա�      ���		   �γ���        ����	   ʱ��		 ��ʦ");
				System.out.println(st3.getId()+"	"+st3.getName()+"	"+st3.getSex()+"	"
						+cou1.getCouId()+"	"+cou1.getCouName()
						+"	"+cou1.getCouAddress()+"	"+cou1.getCouTime()+"	"+cou1.getTeacher());
			}else if(tea==cou2.getCouId()) {
				System.out.println("ѧ��	����	�Ա�      ���		   �γ���        ����	   ʱ��		 ��ʦ");
				System.out.println(st3.getId()+"	"+st3.getName()+"	"+st3.getSex()+"	"
						+cou2.getCouId()+"	"+cou2.getCouName()
						+"	"+cou2.getCouAddress()+"	"+cou2.getCouTime()+"	"+cou2.getTeacher());
			}else if(tea==cou3.getCouId()) {
				System.out.println("ѧ��	����	�Ա�      ���		   �γ���        ����	   ʱ��		 ��ʦ");
				System.out.println(st3.getId()+"	"+st3.getName()+"	"+st3.getSex()+"	"
						+cou3.getCouId()+"	"+cou3.getCouName()
						+"	"+cou3.getCouAddress()+"	"+cou3.getCouTime()+"	"+cou3.getTeacher());
			}
			System.out.println("\n--------------------ѡ�γɹ�������---------------------\n");
			
		}
		}else if(i==2) {
			System.out.println("������Ҫ�˿εı�ţ�");
			esc=scanner.nextInt();
			if(esc==cou1.getCouId() || esc==cou2.getCouId() || esc==cou3.getCouId()) {
				System.out.println("\n--------------------�˿γɹ�������---------------------\n");
			}
		}else {
			System.out.println("\n-----------------�밴��ʾ��ȷ����-----------------\n");
		}
		
		
		
	}

}
