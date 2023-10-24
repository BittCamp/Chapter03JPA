package com.example.demo;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity // 하나의 객체로 생성한다.
@Table(name="board") //테이블 명을 보드로 지정
@Getter
@Setter
public class BoardDTO {
	@Id//primary key로 설정.
	@Column(name="seq")
	
	//특정 데이터 베이스에 맞게 자동으로 생성하는 방식, 자동으로 시퀀스 테이블이 생성된다.
	//@GeneratedValue(strategy=GenerationType.AUTO) 
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="BOARD_SEQ_GENERATOR")
	private int seq;
	
	@Column(name="id", nullable=false, unique=true,length=30)
	private String id;
	
	@Column(name="name" , nullable=false, length=30)
	private String name;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="content")
	private String content;
	
	@CreationTimestamp //엔터티가 생성되는 시점의 시간 등록
	private Timestamp logtime;
}
