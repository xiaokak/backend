/***********************************************************
 * @Description : 页面的数据库操作类
 ***********************************************************/
package zucc.exam.repository;

import zucc.exam.entity.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepository extends JpaRepository<Page, Integer> {
}
