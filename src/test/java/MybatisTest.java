import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.bean.WxbGoodSku;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class MybatisTest {
    /**
     * 添加
     */
    @Test
    public void add(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis.cfg.xml");
            //构造模式
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            //工厂模式
            SqlSession session = sessionFactory.openSession();
            //返回值是对数据库影响的行数
            Date date=new Date();
            String goodId = UUID.randomUUID().toString();
            WxbGood wxbGood = new WxbGood(goodId, "33", "69609206", "imageFolder/20160509/44671132_1.jpg",
                    "imageFolder/20160509/44671132_2.jpg", "imageFolder/20160509/44671132_3.jpg", "11", "1", "1",
                    "1", "1", "1", null, null, 3, "01", "2", 1, null, 0, 0, null, null, "9", null, 11, null, 0, 1, 7, "0");
            session.insert("com.qianfeng.fxmall.goods.bean.WxbGood.save",wxbGood);
            /*System.out.println("影响的行数："+i);
            System.out.println("主键："+wxbGood.getGoodId());*/
            WxbGoodSku wxbGoodSku = new WxbGoodSku ("66607863", "1", "2", "3", "4", wxbGood.getGoodId(), wxbGood.getOrderNo(), "5");
            session.insert("com.qianfeng.fxmall.goods.bean.WxbGoodSku.save",wxbGoodSku);
            //增删改都需要提交事务
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 一对多
     */
    @Test
    public void select(){
        try {
            InputStream  stream = Resources.getResourceAsStream("mybatis.cfg.xml");
            //构造模式
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            //工厂模式
            SqlSession session = sessionFactory.openSession();
            WxbGood good = session.selectOne("com.qianfeng.fxmall.goods.bean.WxbGood.select");
            session.close();
            System.out.println(good);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 多对一
     */
    @Test
    public void queryGoodSkuAndGood(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis.cfg.xml");
            //构造模式
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            //工厂模式
            SqlSession session = sessionFactory.openSession();
            List<WxbGoodSku> skuList = session.selectList("com.qianfeng.fxmall.goods.bean.WxbGoodSku.queryGoodSkuAndGood");
            session.close();
            System.out.println(skuList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
