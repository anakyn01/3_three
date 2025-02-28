package com.spring.ljh;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;//�ڹٿ� ui�� ���

import com.spring.ljh.service.BookService;


@Controller//������̼�[�ٸ� ���α׷����� ������ ������ �����ϱ����� ����ϴ�  �ּ�
//������Ʈ�� �����ϴ� ��Ʈ�ѷ��� �Ӹ��Ŵ ����� �����ϵ��� �ϴ� ���
public class LjhController {
   //�Է±�� ���񽺸� ȣ���ϱ� ���� ���� ��(������Ʈ)������ ���� ���� �� �߰��Ѵ�
   @Autowired
   BookService bookService;

   @GetMapping(value="/")//������ ����� �Ҷ� ���
   public String home() {
      return "home";
   }
   
   //create �ּҰ� GET������� �ԷµǾ����� sub/create�� ����� �並 �����ش�
   //ModelAndView ��ü�� �����ؼ� ��ü�������� ����
   //@GetMapping�� @PostMapping�� ���� ��� 
   @GetMapping(value="/create")
   public ModelAndView create() {
      return new ModelAndView("sub/create");
   }
   
   //���� ModelAndView =>�� ��ü�� url�� ���� ���Ͻ�Ű�� �޼ҵ�
   //@RequestMapping(value="/create", method = RequestMethod.POST)
   //@RequestParam HTTP�� ������Ʈ���̳� �������͸� �޼ҵ��� �Ķ���ͷ� ���ε��Ҷ� ���
   //���ε� ���α׷��� � �⺻������ ������ �ִ� ��������� ��ü���� �� ������ Ȯ���ϴ°��� ����
   @PostMapping(value="/create")//������ ������ 3.�� ���̸� ���Ұ���
   public ModelAndView createPost(@RequestParam Map<String, Object>map) {
   //1)��ü ����
   ModelAndView mav = new ModelAndView();
   //2)������ ���񽺸� ����
   String bookId = this.bookService.create(map);
   //3)�������̶�� �����Ű�� ���������� ���� �׷��� ������ ���� ���� ���·� ����
   if (bookId == null) {//�������ΰ� �ƴ϶�� ���� ���� ���� ȭ������ ������
      mav.setViewName("redirect:/create");
   }else {
      mav.setViewName("redirect:/detail?bookId="+bookId);
   }
   return mav;
   }   
   
   //read @RequestParam => ������Ʈ�� �Ķ���͸� �а� �Ķ���͸� GET,POST�� ������ ������� ������ �ְ� �Ѵ�
   /*
   ModelAndView(String viewName) => ������ �� �̸��� ����
   addObject(String name, Object value) => �信 ������ ���� ����
   addAllObject(Map values) => view�� ������ ���� Map�� name-value�� �����Ͽ� �ѹ��� ����   
   */
   @GetMapping(value="/detail")
   public ModelAndView detail(@RequestParam Map<String, Object> map) {
      Map<String, Object> detailMap = this.bookService.detail(map);
      
      ModelAndView mav = new ModelAndView();
      mav.addObject("data", detailMap);
      String bookId = map.get("bookId").toString();
      mav.addObject("bookId", bookId);
      mav.setViewName("/sub/detail");
       return mav;
   }
   
   
   /*���� ���μ���
   1)���̹�Ƽ�� �±׻���
   2)��Ʈ�ѷ� @GetMapping url����
   3)dao���� autowired�� sql���� ���ø�
   4)��������Ͻ� ������ �帣�� ���񽺸� ����
   5)��Ʈ�ѷ����� ���� ������̾��
   6)���񽺸� ��Ʈ�ѷ����� ����
    * */
   
   /*���� ��Ʈ��
   ���� ���
   /sample/test?a=1&b=2
   url : /sample/test
   ������Ʈ�� : ?a=1&b=2
   ������Ʈ���� ���� : ?
   ������Ʈ���� �׸� ���� : &
   ������Ʈ���� �׸�� : a = 1, b=2
   URI :/sample/test?a=1&b=2
   URI�� �������� ������ url
   */
   
   
   
   
   
   
   
   

}
