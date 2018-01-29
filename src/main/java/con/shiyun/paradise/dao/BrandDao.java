package con.shiyun.paradise.dao;

import java.util.List;
import java.util.Map;

public interface BrandDao {
    //查询品牌
    List<Map<String, Object>> selectBrand();

    //查询品牌数量
    int selectBrandCount();

}
