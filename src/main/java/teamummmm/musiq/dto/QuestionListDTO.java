package teamummmm.musiq.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class QuestionListDTO {
    private Long question_id;  // 오브젝트 아이디 (userQuestionId)

    private String question_message;  // 질문 내용 (questionMsg)

    private String emoji;  // 질문 이모지 (emoji)

    private Integer main_color;  // 질문의 메인 컬러
}
