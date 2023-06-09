package org.zerock.w1.service;

import org.zerock.w1.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
   INSTANCE;

   // 1-2. TodoDTO객체를 받는 Register생성
   public void register(TodoDTO todoDTO) {
       System.out.println("DTO : " + todoDTO);
   }

   // 1-3. 10개의 TodoDTO객체 만들어 반환
    public List<TodoDTO> getList() {

       List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i -> {
           TodoDTO dto = new TodoDTO();
           dto.setTno((long)i);
           dto.setTitle("Todo.." + i);
           dto.setDeuDate(LocalDate.now());

           return dto;
       }).collect(Collectors.toList());

       return todoDTOS;

    }

    // 2-1 특정 번호 조회 기능
    public TodoDTO get(Long tno) {

       TodoDTO dto = new TodoDTO();
       dto.setTno(tno);
       dto.setTitle("Sample Todo");
       dto.setDeuDate(LocalDate.now());
       dto.setFinished(true);

       return dto;
    }
}
