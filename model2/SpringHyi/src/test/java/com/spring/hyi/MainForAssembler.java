package com.spring.hyi;

import java.io.BufferedReader;
//버퍼를 사용하여 읽기를 하는 함수 버퍼를 사용하지 않는 읽기와 스기는 키를 누르는 즉시 바로 프로그램에 전달된다
//반면에 버퍼를 사용하는 입력은 키보드에 입력이 있을때 마다 한문자씩 버퍼로 전송한다 버퍼가 가득차거나 
//혹은 개행문자가 나타나면 버퍼의 내용을 한번에 전달한다
//데이터를 한곳에서 다른한곳으로 전송하는 동안에 일시적으로 그데이터를 보관하는 메모리의 영역이다
import java.io.IOException;
import java.io.InputStreamReader;

import com.spring.hyi.sub.Assembler;

public class MainForAssembler {
	
	private static Assembler assembler = new Assembler();
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		

	}
	
	private static void processChangeCommand(String[] args) {
		
	}
	
	private static void processNewCommand(String[] args) {
		
	}

}
