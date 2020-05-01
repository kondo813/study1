package com.example.easylogin.model.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easylogin.model.entity.User;
//Repository��DB�ւ̃A�N�Z�X�������ł��Ă����C���^�[�t�F�C�X�̂���
@Repository						//�p���@�@�@�@�@�@<User�G���e�B�e�B,User�e�[�u����ID�^>
public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findByUserNameAndPassword(String userName, String password);
}
