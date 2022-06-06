/***********************************************************
 * @Description : Action的数据库操作类
 ***********************************************************/
package zucc.exam.repository;

import zucc.exam.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action, Integer> {
}
