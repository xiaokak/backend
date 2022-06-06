/***********************************************************
 * @Description : 考试记录VO
 ***********************************************************/
package zucc.exam.vo;

import zucc.exam.entity.Exam;
import zucc.exam.entity.ExamRecord;
import zucc.exam.entity.User;
import lombok.Data;

@Data
public class ExamRecordVo {
    /**
     * 当前考试记录对应的考试
     */
    private Exam exam;

    /**
     * 当前考试对应的内容
     */
    private ExamRecord examRecord;

    /**
     * 参加考试的用户信息
     */
    private User user;
}
