<h1>자바웹개발워크북 1장 실습 Jsp, Servlet </h1>
<br>
<p>컨트롤러와 JSP 사이 데이터 오가기</p>
<br>
<br>


<h1>📆 개발일정</h1>
<br>
2023.04 ~ 2023.04<br><br>
<br>


<h1>⚡ 핵심기능</h1> <br>
<li> TodoDTO 객체 화면에 띄우기  <br> <br>
&nbsp;&nbsp; : TodoDTO 생성 -> TodoService에 getList 만들기 -> TodoListController에 List<TodoDTO> 가져오고 화면 전송 -> list.jsp 에 ${dto}로 띄움 
<br><br></li><br> <br>

<img width="700" alt="List Page" src="https://user-images.githubusercontent.com/94521647/235934945-cd5c71c4-d735-4e19-adaa-7df4839fca94.png"> <br> <br>


<li>Todo 조회 화면 띄우기 <br> <br>
&nbsp;&nbsp; : UTodoService에 get 만들기 -> TodoReadController 에  TodoService.INSTANCE.get(tno); 호출 -> read.jsp에 ${dto.title}  로 띄우기 <br><br></li><br> <br>

<img width="700" alt="Pasted Graphic 1" src="https://user-images.githubusercontent.com/94521647/235935388-680e8a9f-495c-435b-8aa6-5a174a026d10.png"> <br>


<br><p>본 내용은 자바 웹 개발 워크북을 공부하며, 개발하였습니다. </p>

