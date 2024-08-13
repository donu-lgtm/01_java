package main.java.com.ohgiraffers.section03.Question;

import main.java.com.ohgiraffers.section02.uses.Member;
import main.java.com.ohgiraffers.section02.uses.MemberrRegister;

public class LoginService {

public void signup(){


    Member[] members = new Member[5];
    members[0] = new Member(1, "user01","pass01","홍길동", 20, '남');
    members[1]= new Member(2, "user02", "pass02", "유관순", 16 , '여');
    members[2]= new Member(3, "user03", "pass03", "이순신", 40 , '남');
    members[3]= new Member(4, "user04", "pass04", "세종대왕", 35 , '남');
    members[4]= new Member(5, "user05", "pass05", "윤봉길", 30 , '남');
    MemberrRegister memberrRegister= new MemberrRegister();
    memberrRegister.regist(members);

}}
