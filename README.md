# BackEnd Development Practice #

### 1주차 과제 ###
---

1. 스프링 개발 환경 구축
 - JDK, Eclipse, Spring, Tomcat 설치
 - 웹 페이지 생성
   - Spring Legacy Project 생성 > localhost:8080/프로젝트명/

2. 데이터베이스 환경 구축
 - MariaDB 설치 
 - GUI 기반의 클라이언트인 MySQL Workbench 설치
 - 샘플 DB 구축 
   - Theater 스키마 생성 > 데이터 INSERT (movie_name, director, type)

3. Spring, MariaDB, MyBatis 연동
 - MariaDB, MyBatis 관련 Dependency 추가 
   - Dependency 오류 발생 > Spring JDBC 버전 수정(완료)
 - MariaDB, MyBatis 세부 설정
   - DataSourcebean을 선언하여 DI를 받을 수 있도록 설정 
   - sqlSessionFactorybean을 선언하여 MariaDB 설정 기능을 사용하도록 세팅
 - src/main/resources 디렉토리 내에 파일 생성
   - VO에 typeAlias 설정 (mybatis-config.xml)
   - logger 설정 (logback.xml)
   - 로그 설정 (log4jdbc.log4j2.properties)

4. 데이터 조회 및 처리 
 - VO를 담고 있는 리스트를 가지는 함수가 있는 인터페이스 작성 (MovieDAO.java)
 - SqlSession을 통해 등록된 SQL 쿼리문을 실행하여 List를 리턴 (MovieDAOImpl.java)
 - DB처리를 위한 비즈니스 로직 작성 (Service)
 - MovieVO 코드 작성
   - DB 테이블의 column명과 동일하게 멤버 변수를 선언
   - get, set 메서드를 통해 멤버 변수에 접근
 - service에서 selectMovie를 호출하여 해당 내용을 화면으로 전달
 - 화면 설정
   - List를 받아서 c:forEach문으로 조회된 결과를 출력
 - Tomcat 설정 변경
   - localhost:8080/프로젝트명/ > localhost:8080/
 - 결과화면
 ![1주차_결과화면](https://user-images.githubusercontent.com/44959513/105055692-a7299500-5ab6-11eb-81d8-7dcd108f57e1.png)
 
---
 질문사항
1. log4dbc-log4j2-jdbc 등 로그와 관련된 파일이나 정보들은 꼭 필요한 부분인가요?? 어디서 어떻게 사용되는 부분인지 궁금합니다

2. test.xml 파일이나 MovieVO.java 파일에서 MySQL Workbench의 데이터를 가져오는 부분은 Mybatis를 연동했기 때문에 되는 일인가요?? 
Workbench에서 만든 데이터들을 어떻게 불러오게 되는건지 이해하기가 조금 어렵습니다..

3. home.jsp파일에서 실무에서는 보통 json으로 받아와 javascript이나 jquery등으로 뿌린다고 설명해주셨는데 그러면 home.jsp파일이 아닌 다른 파일을 추가로 생성해서 진행해야 하나요??
---


### 2주차 과제 ###
---

1. SW 활용 현황 API 문서 가이드 작성
 - SW 년월별 사용자 데이터
  - 사용자 접속자수
  - 부서별 사용자 접속자수 
  - 로그인 요청 수

 - SW 사용자 데이터
  - 게시글 작성 수


   
