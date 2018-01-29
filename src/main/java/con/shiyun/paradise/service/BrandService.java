package con.shiyun.paradise.service;

import java.util.List;
import java.util.Map;

public interface BrandService {
    //查询品牌
    List<Map<String, Object>> selectBrand();

    //查询品牌数量
    int selectBrandCount();
}
