/***********************************************************
 * @Description : Action的前端展示类
 ***********************************************************/
package zucc.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PageVo {
    @JsonProperty("actionEntitySet")
    private List<ActionVo> actionVoList;

    @JsonProperty("permissionId")
    private String pageName;

    @JsonProperty("permissionName")
    private String pageDescription;
}
