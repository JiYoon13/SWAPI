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

@ 질문사항
1. log4dbc-log4j2-jdbc 등 로그와 관련된 파일이나 정보들은 꼭 필요한 부분인가요?? 어디서 어떻게 사용되는 부분인지 궁금합니다

2. test.xml 파일이나 MovieVO.java 파일에서 MySQL Workbench의 데이터를 가져오는 부분은 Mybatis를 연동했기 때문에 되는 일인가요?? 
Workbench에서 만든 데이터들을 어떻게 불러오게 되는건지 이해하기가 조금 어렵습니다..

3. home.jsp파일에서 실무에서는 보통 json으로 받아와 javascript이나 jquery등으로 뿌린다고 설명해주셨는데 그러면 home.jsp파일이 아닌 다른 파일을 추가로 생성해서 진행해야 하나요??
# #

### 2주차 과제 ###
---

1. SW 활용 현황 API 문서 가이드 작성
  - 사용자 접속자수
  - 부서별 사용자 접속자수 
  - 로그인 요청 수
  - 게시글 작성 수
2. SW 활용 현황 API 문서 가이드
  - [2주차_SW 활용 현황 API 가이드 문서_김지윤.docx](https://github.com/JiYoon13/SWAPI/files/5842739/2._SW.API._.docx)

@ 질문사항
 1. APi 문서 작성한 것 중에 잘못된 부분이 있나요?? 
 ---
 
# #

### 3주차 과제 ###
---

1. Rest란?
하나의 URI는 하나의 고유한 리소스를 대표하도록 설계된다는 개념
REST방식은 특정한 URI는 반드시 그에 상응하는 데이터 자체라는 것을 의미하는 방식이다.

2. Rest API란?
Rest API란 REST 아키텍처의 제약 조건을 준수하는 애플리케이션 프로그래밍 인터페이스로, 외부에서 특정 URL을 통해 사용자가 원하는 정보를 제공하는 방식
REST는 HTTP를 기반으로 XML 또는 JSON을 이용하여 서버-클라이언트가 데이터를 주고받는 통신 방식
# 스프링에서의 REST 
 @ResponseBody 애너테이션을 지원하게 되면서 REST 방식의 처리를 지원, @RestController를 통해 구현 가능

- REST API는 자원, 행위, 표현으로 구성
(1) Resource – URI
 - 클라이언트는 URI를 통해 서버에 해당 자원의 상태에 대한 조작을 요청
(2) Verb – 행위, HTTP Method
 - GET, POST, PUT, DELETE 등
(3) Representation
 - JSON, XML을 통해 데이터를 주고받음

3. 스프링부트로 개발 환경 설정하기

![캡처](https://user-images.githubusercontent.com/44959513/106143097-ab8c3700-61b5-11eb-99ff-f4e182196317.PNG)

4. [20년도 로그인 수 API] 스프링부트, Mybatis, mariadb 연동
- workbench에서 DB, table 생성
- Mybatis 연동

![캡처2](https://user-images.githubusercontent.com/44959513/106143154-b941bc80-61b5-11eb-9075-05a6640cd2cd.PNG)

5. SQL 작성
 1) 월별 접속자 수
select count(*) as totCnt
from statistc.requestinfo ri
where left(ri.CreateDate, 6) = #{YearMonth};

 2) 일자별 접속자수
select count(*) as totCnt
from statistc.requestinfo ri
where ri.CreateDate = #{beginDate};

 3) 월 평균 하루 로그인 수
select count(*)/31 as totCnt
from statistc.requestinfo ri
where left(ri.CreateDate, 6) = #{YearMonth};

 4) 휴일을 제외한 년별 로그인 수
select count(*) as totCnt

from statistc.requestinfo ri

where left(ri.CreateDate, 4) = #{Year}; not in (20210101, …)

 5) 부서별 월별 로그인 수
select count(*) as totCnt

from statistc.requestinfo ri

where left(ri.CreateDate, 6) = #{YearMonth} AND ri.Dept_code = #{Dept};

@ 질문사항
1. DB, Table 생성 코드 중에 code_Explain varchar(50) NOT NULL 이 부분은 어떤 내용인가요?
2. 20년도 로그인 수를 CreateDate로만 비교해서 얻은 값이 맞나요? 
3. 평균 하루 로그인수와 휴일을 제외한 로그인 수는 정확하게 어떻게 SQL을 작성해야할 지 모르겠습니다
4. 가이드에서 [20년도 로그인 수]를 구한 것에서 월별 접속자수, 부서별 월별 접속자 수를 추가로 구현하려면 현재 코드에 이어서 작성하는 건가요?? 아니면 따로 코드를 작성해야 하나요??

 ---


   
