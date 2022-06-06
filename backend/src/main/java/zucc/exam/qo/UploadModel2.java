package zucc.exam.qo;

/**
 @Description : 文件传输的实体类，支持单个文件
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadModel2 {
    /**
     * 要保存的文件列表
     */
    private MultipartFile file;
    /**
     * 文件要存储的文件夹
     */
    private String dir;
}
