package com.example.easylogin.model.entity;
//Entity�N���X�͎��̉�������N���X
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//DB�ɂ���user�e�[�u�������̉����Ă�
@Entity
@Table(name="user")
public class User {

	//@Id�Ńv���C�}���[�L�[�ł��邱�Ƃ��w��
	//@Column��user�e�[�u���̂ǂ̃J�����ƃ}�b�s���O���邩�w��
	//@GeneratedValue��ID�t�B�[���h�̐U�镑�����w��
		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		
		@Column(name="user_name")
		private String userName;
		
		@Column(name="password")
		private String password;
		
		@Column(name="full_name")
		private String fullName;
	
		//private�ŃJ�v�Z�������Ă�̂�getter/setter��p�ӂ��ĕύX�ł���悤�ɂ��Ă�
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}	
}
