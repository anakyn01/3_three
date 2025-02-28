package com.spring.ljh.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //�ش� Ŭ������ ������ ���� ������ ����ü���� ���
public class BookDao {

   //create
   @Autowired //�ʿ��� ���� ��ü Ÿ�Կ� �ش��ϴ� ���� ã�� ����
   SqlSessionTemplate sqlSessionTemplate;
   
   public int insert(Map<String, Object> map) {
      return this.sqlSessionTemplate.insert("book.insert", map);
   }
   
   //read
   /*
   Map<String, Object>�� ���ʸ��� ����Ͽ� ������ �ڷ���
   ���׸�
   - ������ Ÿ���� �Ϲ�ȭ �Ѵ�
   - �������� Ÿ���� Ŭ���� ���ο��� �����ϴ� ���� �ƴ� �ܺο��� ����ڿ� ���� �����Ǵ� ���� ����
   - �Ķ���� Ÿ���̳� ����Ÿ�Կ� ���� ���Ǹ� �ܺη� �̷��
   - ������ �ÿ� �̸� �����ϴ� ������� Ÿ�԰˻縦 �ع����� ��üŸ���� �������� ���ϼ� �ְ�
   - ��ȯ���� ���� Ÿ�� ��ȯ �˻翡 ���� ����� ���ϼ� �ֽ��ϴ�
   
   selectOne
   - �����͸� �ϳ��� �����ö� ����Ѵ�
   - ���� ���� ��� ����� 0�̸� selectOne�޼ҵ�� null�� ����
   - ��������� ������ �̸� TooManyResultException���ܸ� ������
   */
   public Map<String, Object> selectDetail (Map<String, Object> map){
      return this.sqlSessionTemplate.selectOne("book.select_detail", map);
   }
   
   
   
   
   
   
   
   
   
}
