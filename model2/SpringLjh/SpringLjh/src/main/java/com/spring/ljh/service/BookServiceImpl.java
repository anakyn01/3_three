package com.spring.ljh.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ljh.dao.BookDao;

//���� Ŭ������ ����Ͻ� Ŭ������ ��ġ�Ѱ� ������ mvc���� ���� Ŭ������ ��Ʈ�ѷ��� DAO�� �����ϴ� ��Ȱ�� �Ѵ�

@Service//Ŭ���̾�Ʈ�� ��û�� ���� ����Ͻ� ������ �����ϴ� ������Ʈ
public class BookServiceImpl implements BookService {

   @Autowired
   BookDao bookDao;
   
   //�����ε� �������̵�� Ŭ������ ������ 
   @Override //���� �������̽����� ���ǵȰ��� ������ �Ѵٴ� �� ��Ŭ���������� ���� �������̽��� �޼ҵ� 
   //�ñ״�ó�� ���� ��� �ڵ����� �ñ״�ó�� ����� �ִ� ����� �ִ�
   //affectRowCount�� �Ѱ��� ���� ����� ����Ǵ��� �ƴ����� �˻�
   public String create(Map<String, Object> map) {
      int affectRowCount = this.bookDao.insert(map);
      if(affectRowCount == 1) {
         return map.get("book_id").toString();
      }
      return null;
   }
   
   @Override
   public Map<String, Object> detail( Map<String, Object> map){
      return this.bookDao.selectDetail(map);
   }
   
   
   
   
   
   
   
}
