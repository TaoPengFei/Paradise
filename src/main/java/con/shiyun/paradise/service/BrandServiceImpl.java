package con.shiyun.paradise.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import con.shiyun.paradise.dao.BrandDao;
import org.springframework.stereotype.Service;


@Service("brandService")
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandDao brandDao;

    //查询品牌
    @Override
    public List<Map<String, Object>> selectBrand() {

        return brandDao.selectBrand();
    }

    //查询品牌数量
    @Override
    public int selectBrandCount() {

        return brandDao.selectBrandCount();
    }

}
