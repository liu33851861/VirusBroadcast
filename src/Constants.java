/**
 * 模拟参数
 *
 * @ClassName: Constants
 * @Description: 模拟参数
 * @author: Bruce Young
 * @date: 2020年02月02日 21:40
 */
public class Constants {

    public static int ORIGINAL_COUNT = 50;//初始感染数量
    public static float BROAD_RATE = 0.8f;//传播率
    public static float SHADOW_TIME = 140;//潜伏时间
    public static int HOSPITAL_RECEIVE_TIME = 10;//医院收治响应时间
    public static int BED_COUNT = 1000;//医院床位
    /**
     * 流动意向平均值，建议调整范围：[-0.99,0.99]
     * <p>
     * -0.99可达到人群最快速率，甚至完全控制疫情传播
     * 0.99为人群流动最快速率, 可导致全城感染
     */
    public static float u = -0.99f;
    public static int CITY_PERSON_SIZE = 5000;//城市总人口数量

}
